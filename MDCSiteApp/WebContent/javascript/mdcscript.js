function showConfirmPage(){
	 var submitFlag=true; 
	 if(TrimAll(document.forms[0].txtGroupName.value).length==0){
	  alert("You must enter a Group Name."); 
	  document.forms[0].txtGroupName.focus(); 
	  submitFlag=false; 
	 }else if(TrimAll(document.forms[0].txtEmpName.value).length==0){
	   alert("You must enter an Employee Name."); 
	   document.forms[0].txtEmpName.focus(); 
	   submitFlag=false; 
	 }else if(TrimAll(document.forms[0].txtPatientName.value).length==0){
	    alert("You must enter a Patient Name"); 
	    document.forms[0].txtPatientName.focus();
	     submitFlag=false; 
	 }else if(TrimAll(document.forms[0].txtDentalOfficeName.value).length==0){
	   alert("You must enter a Dental Office Name. If not applicable, please enter N/A"); 
	   document.forms[0].txtDentalOfficeName.focus(); submitFlag=false; 
	 }else if(TrimAll(document.forms[0].txtDescription.value).length==0){
	   alert("You must describe your grievance."); 
	   document.forms[0].txtDescription.focus();
	   submitFlag=false; 
	 }
	 else 
	 { 
	   if(document.forms[0].chkEmail.checked||document.forms[0].chkPhone.checked){
	    	if(document.forms[0].chkEmail.checked){
			     if(!validateEmail(TrimAll(document.forms[0].txtEmail.value))){
				     showAlert();
				     submitFlag=false;
			     }
			}else{ 
			   	if(TrimAll(document.forms[0].txtPhone.value).length!=3 ||TrimAll(document.forms[0].txtPhone_1.value).length!=3 ||TrimAll(document.forms[0].txtPhone_2.value).length!=4){ 
		     		alert("Your phone number must be 10 digits long. Please make sure you include your area code."); 
		     		document.forms[0].txtPhone.focus(); submitFlag=false; 
			    } 
			} 	
	    }
     	 else{ alert("You must provide at least one method for us to contact you."); 
     	 submitFlag=false; 
     	} 
     }
	if(submitFlag){ 
		if(document.forms['0'].chkEmergency.checked){
			document.forms['0'].hidEmergency.value="Yes";
		}else{
			document.forms['0'].hidEmergency.value="No";
		}
		if(document.forms['0'].chkPhone.checked){
			document.forms['0'].hidPhone.value="Yes";
		}else{
			document.forms['0'].hidPhone.value="No";
		}
		if(document.forms['0'].chkEmail.checked){
			document.forms['0'].hidEmail.value="Yes";
		}else{
			document.forms['0'].hidEmail.value="No";
		}
		document.forms[0].action="addGrievance.do";
		document.forms[0].EventName.value="showConfirmGrievanceForm";
		document.forms[0].submit();
	} 
}

/** 
 * Function : LTrim(str ) 
 * Description : This function will remove leading spaces from passed string value. 
 * function returns string with spaces eliminated. 
 */
function LTrim(str){ 
	if (str==null){
		return null;
	} 
	for(var i=0;str.charAt(i)==" ";i++); 
	return str.substring(i,str.length); 
}
/** 
* Function : RTrim(str ) 
* Description : This function will remove Trailing spaces from passed string value. 
* function returns string with spaces eliminated. 
*/
function RTrim(str){
	 if (str==null){
	 	return null;
	 } 
	 for(var i=str.length-1;str.charAt(i)==" ";i--); 
	 return str.substring(0,i+1); 
}
/** 
* Function : LTrimAll(str ) 
* Description : This function will remove Leading spaces including carage return and new line character from passed string value. 
* function returns string with spaces eliminated. 
*/
function LTrimAll(str) {
	if (str==null){
		return str;
	} 
	for (var i=0; str.charAt(i)==" " || str.charAt(i)=="\n" || str.charAt(i)=="\t"; i++); 
	return str.substring(i,str.length); 
}

/** 
* Function : LTrimAll(str ) 
* Description : This function will remove Trailing spaces including carage return and new line character from passed string value. 
* function returns string with spaces eliminated. 
*/
function RTrimAll(str) {
	if (str==null){
		return str;
	} for (var i=str.length-1; str.charAt(i)==" " || str.charAt(i)=="\n" || str.charAt(i)=="\t"; i--); 
	 return str.substring(0,i+1); 
}
/** 
* Function : LTrimAll(str ) 
* Description : This function will remove Trailing spaces including carage return and new line character from passed string value. 
* function returns string with spaces eliminated. 
*/

function TrimAll(str) { 
	return LTrimAll(RTrimAll(str)); 
}
/** 
* Function : showAlert(str ) 
* Description : Displays error and set the focus the email field if the email is invalid. 
*/
function showAlert(){
	alert("We did not recognize the format of your email address. Please make sure it includes an '@' symbol, as well as a domain (e.g. '.com')."); 
	document.forms[0].txtEmail.focus(); 
}
/** 
* Function : validateEmail(email)  
* Description : validates the email address. 
*/
function validateEmail(email) { 
	if (! isValidEmailAddress(email) ) { 
		return false;
	} 
	return true;
}
function isValidEmailAddress(emailAddress) { 
	/* Check for empty address or invalid characters */ 
	if (emailAddress == "" || hasInvalidChar(emailAddress)) { 
		return false; 
	} 
	/* check for presence of the @ character */ 
	var atPos = emailAddress.indexOf("@", 1); 
	if (atPos == -1){ 
		return false;
	}
	/* Check that there are no more @ characters */ 
	if (emailAddress.indexOf("@", atPos + 1) > -1){
		return false;
	}
	/* Check for the presence of a dot somewhere after @ */
	 var dotPos = emailAddress.indexOf(".", atPos + 1); 
	 if (dotPos == -1) { 
	 	return false; 
	 } 
	 /* Check for presence of two or more characters after last dot */ 
	 var lastDotPos = emailAddress.lastIndexOf("."); 
	 if (lastDotPos + 3 > emailAddress.length) { 
	 	return false; 
	 } 
	 return true; 
}					
function hasInvalidChar(emailAddress) { 
	var invalidChars = "/;:,~!#$%^&*()? ";
	// this list is not complete 
	for (var k = 0; k < invalidChars.length; k++) {
		var ch = invalidChars.charAt(k);
		if (emailAddress.indexOf(ch) > -1) { 
			return true; 
		} 
	} 
	return false; 
}					
/** 
* Function : homePage(email)  
* Description : Submits the page for Home Page. 
*/
function homePage(){
	document.forms[0].action="addGrievance.do";
	document.forms[0].submit();
}
/** 
 * Function : showGreivanceForm() 
 * Description : This function will submit the page for firing the action which will display the grievance form. 
 * 
 */
function showGreivanceForm(){
	document.forms[0].action="addGrievance.do";
	document.forms[0].EventName.value="showGrievanceForm";
	document.forms[0].submit();
}
/** 
 * Function : findProvider( ) 
 * Description : This function will open the Dental provider site. 
 * function returns string with spaces eliminated. 
 */
function findProvider(){
	var newproviderwindow=window.open("https://www.guardiananytime.com/fpapp/FPWeb/dentalSearch.process","FindaProvider","height=900,width=900,status=yes,toolbar=no,menubar=no,location=no, scrollbars =yes,resizable=yes");
	if (!newproviderwindow.opener) newproviderwindow.opener = self;
	if (window.focus) {newproviderwindow.focus()};
}
/** 
 * Function : showPrivatePolicy( ) 
 * Description : This function will open the Private Policy page. 

 */
function showPrivatePolicy(){
	var newproviderwindow=window.open("https://www.guardianlife.com/privacy-policy","PrivatePolicies","height=700,width=900,status=yes,toolbar=no,menubar=no,location=no, scrollbars =yes,resizable=yes");
	if (!newproviderwindow.opener) newproviderwindow.opener = self;
	if (window.focus) {newproviderwindow.focus()};
}


/** 
 * Function : homeHelp( ) 
 * Description : This function will open the Home Page in New Window. 
 * function returns string with spaces eliminated. 
 */
function homeHelp(){
	var newlookupwindow=window.open("http://www.hmohelp.ca.gov/","Home","height=document.body.clientHeight,width=document.body.clientWidth,status=yes,toolbar=no,menubar=no,location=no, scrollbars =yes,resizable=yes");
	if (!newlookupwindow.opener) newlookupwindow.opener = self;
	if (window.focus) {newlookupwindow.focus()};
}
/** 
 * Function : mailGrievanceDetails(str ) 
 * Description : This function will submit the page which will fire the mail action. 
 * function returns string with spaces eliminated. 
 */
function mailGrievanceDetails(){ 
	document.forms[0].action="addGrievance.do"; 
	document.forms[0].EventName.value="mailGrievanceForm"; 
	document.forms[0].submit(); 
} 
var isNN = (navigator.appName.indexOf("Netscape")!=-1);
function autoTab(input,len, e) {
      var keyCode = (isNN) ? e.which : e.keyCode; 
      var filter = (isNN) ? [0,8,9] : [0,8,9,16,17,18,37,38,39,40,46];
      if(input.value.length >= len && !containsElement(filter,keyCode)) {
      input.value = input.value.slice(0, len);
      input.form[(getIndex(input)+1) % input.form.length].focus();
}
}

function containsElement(arr, ele) {
  var found = false, index = 0;
  while(!found && index < arr.length)
  if(arr[index] == ele)
  found = true;
  else
  index++;
  return found;
}

function getIndex(input) {
  var index = -1, i = 0, found = false;
  while (i < input.form.length && index == -1)
  if (input.form[i] == input)index = i;
  else i++;
  return index;
  }
 

	


