package com.glic.mdc.presentation.form;

/**
 * <p>Title:GrievanceForm </p>
 *
 * <p>Description: This is the form bean class used by girevance . 
 *    This extends BaseForm class.</p>
 * 
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company:GLIC </p>
 * 
 * 	@author CVNS
 * 
 *  @date Dec 13, 2005
 *  
 *  @version 1.0
 */
public class GrievanceForm extends BaseForm {

	private String txtPatientNumber = null;
	private String txtGroupNumber = null;
	private String txtGroupName = null;
	private String txtEmpName = null;
	private String txtPatientName = null;
	private String txtDentalOfficeName = null;
	private String txtDentalOfficeNo = null;
	private String txtDescription = null;
	private String chkEmergency = null;
	private String chkEmail = null;
	private String chkPhone = null;
	private String txtPhone = null;
	private String txtPhone_1 =null;
	private String txtPhone_2 =null;
	private String txtEmail = null;
	private String lstTime = null;

	private String outXML = null;

	private String hidEmergency = null;
	private String hidEmail = null;
	private String hidPhone = null;

	/**
	 * @return
	 */
	public String getChkEmail() {
		return chkEmail;
	}

	/**
	 * @return
	 */
	public String getChkEmergency() {
		return chkEmergency;
	}

	/**
	 * @return
	 */
	public String getChkPhone() {
		return chkPhone;
	}

	/**
	 * @return
	 */
	public String getLstTime() {
		return lstTime;
	}

	/**
	 * @return
	 */
	public String getTxtDentalOfficeName() {
		return txtDentalOfficeName;
	}

	/**
	 * @return
	 */
	public String getTxtDentalOfficeNo() {
		return txtDentalOfficeNo;
	}

	/**
	 * @return
	 */
	public String getTxtDescription() {
		return txtDescription;
	}

	/**
	 * @return
	 */
	public String getTxtEmail() {
		return txtEmail;
	}

	/**
	 * @return
	 */
	public String getTxtEmpName() {
		return txtEmpName;
	}

	/**
	 * @return
	 */
	public String getTxtGroupName() {
		return txtGroupName;
	}

	/**
	 * @return
	 */
	public String getTxtGroupNumber() {
		return txtGroupNumber;
	}

	/**
	 * @return
	 */
	public String getTxtPatientName() {
		return txtPatientName;
	}

	/**
	 * @return
	 */
	public String getTxtPatientNumber() {
		return txtPatientNumber;
	}

	/**
	 * @return
	 */
	public String getTxtPhone() {
		return txtPhone;
	}

	/**
	 * @param string
	 */
	public void setChkEmail(String string) {
		chkEmail = string;
	}

	/**
	 * @param string
	 */
	public void setChkEmergency(String string) {
		chkEmergency = string;
	}

	/**
	 * @param string
	 */
	public void setChkPhone(String string) {
		chkPhone = string;
	}

	/**
	 * @param string
	 */
	public void setLstTime(String string) {
		lstTime = string;
	}

	/**
	 * @param string
	 */
	public void setTxtDentalOfficeName(String string) {
		txtDentalOfficeName = string;
	}

	/**
	 * @param string
	 */
	public void setTxtDentalOfficeNo(String string) {
		txtDentalOfficeNo = string;
	}

	/**
	 * @param string
	 */
	public void setTxtDescription(String string) {
		txtDescription = string;
	}

	/**
	 * @param string
	 */
	public void setTxtEmail(String string) {
		txtEmail = string;
	}

	/**
	 * @param string
	 */
	public void setTxtEmpName(String string) {
		txtEmpName = string;
	}

	/**
	 * @param string
	 */
	public void setTxtGroupName(String string) {
		txtGroupName = string;
	}

	/**
	 * @param string
	 */
	public void setTxtGroupNumber(String string) {
		txtGroupNumber = string;
	}

	/**
	 * @param string
	 */
	public void setTxtPatientName(String string) {
		txtPatientName = string;
	}

	/**
	 * @param string
	 */
	public void setTxtPatientNumber(String string) {
		txtPatientNumber = string;
	}

	/**
	 * @param string
	 */
	public void setTxtPhone(String string) {
		txtPhone = string;
	}

	/**
	 * @return
	 */
	public String getOutXML() {
		return outXML;
	}

	/**
	 * @param string
	 */
	public void setOutXML(String string) {
		outXML = string;
	}

	/**
	 * @return
	 */
	public String getHidEmail() {
		return hidEmail;
	}

	/**
	 * @return
	 */
	public String getHidEmergency() {
		return hidEmergency;
	}

	/**
	 * @return
	 */
	public String getHidPhone() {
		return hidPhone;
	}

	/**
	 * @param string
	 */
	public void setHidEmail(String string) {
		hidEmail = string;
	}

	/**
	 * @param string
	 */
	public void setHidEmergency(String string) {
		hidEmergency = string;
	}

	/**
	 * @param string
	 */
	public void setHidPhone(String string) {
		hidPhone = string;
	}
	/**
	 * Resets the Form values
	 *
	 */
	public void reset() {
		this.txtPatientNumber = null;
		this.txtGroupNumber = null;
		this.txtGroupName = null;
		this.txtEmpName = null;
		this.txtPatientName = null;
		this.txtDentalOfficeName = null;
		this.txtDentalOfficeNo = null;
		this.txtDescription = null;
		this.chkEmergency = null;
		this.chkEmail = null;
		this.chkPhone = null;
		this.txtPhone = null;
		this.txtPhone_1 = null;
		this.txtPhone_2 = null;
		this.txtEmail = null;
		this.lstTime = null;

		this.outXML = null;

		this.hidEmergency = null;
		this.hidEmail = null;
		this.hidPhone = null;

	}
	/**
	 * @return
	 */
	public String getTxtPhone_1() {
		return txtPhone_1;
	}

	/**
	 * @return
	 */
	public String getTxtPhone_2() {
		return txtPhone_2;
	}

	/**
	 * @param string
	 */
	public void setTxtPhone_1(String string) {
		txtPhone_1 = string;
	}

	/**
	 * @param string
	 */
	public void setTxtPhone_2(String string) {
		txtPhone_2 = string;
	}

}
