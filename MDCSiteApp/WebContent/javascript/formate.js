
var isNav4 = false, isNav5 = false, isIE4 = false
var strPhoneSeperator = "-"; 
var vphoneFormat = 1; // Global value for type of date format
var err = 0; // Set the error code to a default of zero
if(navigator.appName == "Netscape") {
if (navigator.appVersion < "5") {
isNav4 = true;
isNav5 = false;
}
else
if (navigator.appVersion > "4") {
isNav4 = false;
isNav5 = true;
   }
}
else {
isIE4 = true;
}


function phoneFormat(fieldName, fieldvalue, e, phoneCheck, ssnType) 
{
		vphoneFormat = ssnType;
		// fieldName = object name
		// fieldvalue = value in the field being checked
		// e = event
		// phoneCheck 
		// True  = Verify that the fieldvalue is a valid date
		// False = Format values being entered into fieldvalue only
		// vphoneFormat
		// 1 = xxx-xx-xxxx

		//Enter a tilde sign for the first number and you can check the variable information.
		if (fieldvalue == "~") 
		{
				alert("AppVersion = "+navigator.appVersion+" \nNav. 4 Version = "+isNav4+" \nNav. 5 Version = "+isNav5+" \nIE Version = "+isIE4+" \nYear Type = "+ +" \nDate Type = "+vphoneFormat+" \nSeparator = "+strPhoneSeperator);
				fieldName.value = "";
				fieldName.focus();
				return true;
		}
		var whichCode = (window.Event) ? e.which : e.keyCode;
		// Check to see if a seperator is already present.
		// bypass the date if a seperator is present and the length greater than 8
		if (fieldvalue.length == 11 && isNav4) 
		{
			if ((fieldvalue.indexOf("-") >= 1))
			return true;
		}
		
		//Eliminate all the ASCII codes that are not valid
		var alphaCheck = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/-";
			if (alphaCheck.indexOf(fieldvalue) >= 1) {
					if (isNav4) {
						fieldName.value = "";
						fieldName.focus();
						fieldName.select();
						return false;
					}
					else {
					fieldName.value = fieldName.value.substr(0, (fieldvalue.length-1));
					return false;
		   			}
			}
			
			if (whichCode == 8) //Ignore the Netscape value for backspace. IE has no value
				return false;
			else 
			{
			//Create numeric string values for 0123456789/
			//The codes provided include both keyboard and keypad values
			var strCheck = '48,49,50,51,52,53,54,55,56,57';
			if (strCheck.indexOf(whichCode) != -1) {
				if (isNav4) {
					if (((fieldvalue.length < 10 && phoneCheck) || (fieldvalue.length == 11 && phoneCheck)) && (fieldvalue.length >=1)) {
						fieldName.value = "";
						fieldName.focus();
						fieldName.select();
						return false;
					}
				}
				else 
				{
					if (vphoneFormat == 1) 
					{
						if (fieldvalue.length == 3) 
						{
							fieldName.value = fieldvalue+strPhoneSeperator;
						}
						if (fieldvalue.length == 7) 
						{
							fieldName.value = fieldvalue+strPhoneSeperator;
						}
					}
					return true;
				 }
			  }
		 }
}


var UNDEFINED;
function formatPhoneNumber( fieldOrValue )  {
    if ( fieldOrValue==UNDEFINED ) return(fieldOrValue);
    s = (fieldOrValue.value==UNDEFINED) ? (""+fieldOrValue) : fieldOrValue.value;
    if ( s.length==0 ) return(s);  
    s = s.replace(/[^\d]*/gi,"");  // strip out all non-digits before imposing the mask
    
    if(s.length>9)
    {
        s= s.replace(/^([\d]{3})([\d]{3})([\d]{4})([\d]*)$/gi,"$1-$2-$3").replace(/[ex]$/,"");
    }    
    return( (fieldOrValue.value==UNDEFINED) ? fieldOrValue=s : fieldOrValue.value=s );
 }
