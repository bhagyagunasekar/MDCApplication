package com.glic.mdc.common;

/**
 * <p>Title:MDCSiteConstants </p>
 *
 * <p>Description:Class used to store all the constants used accross the application </p>
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
public interface MDCSiteConstants {
	
	public static final String DEFAULT_XML = "<glicApplication></glicApplication>";
	public static final String GLIC_APPLICATION_TAG="glicApplication";
	public static final String GLIC_APPLICATION_END_TAG="</glicApplication>";
	public static final String LOGGER_DEBUG = "DEBUG";
	public static final String LOGGER_INFO = "INFO";
	public static final String LOGGER_ERROR = "ERROR";
	public static final String LOGGER_FATAL = "FATAL";
	public static final String EVENT_NAME="EventName";
	
	// Event Constants
	public static final String SHOW_WELCOME="showWelcome";
	public static final String SHOW_GRIVANCE_FORM="showGrievanceForm";
	public static final String SHOW_GRIVANCE_CONFIRM_FORM="showConfirmGrievanceForm";
	public static final String MAIL_GRIVANCE_FORM="mailGrievanceForm";
	
	//GrievanceForm Constants
	public static final String PATIENT_NUMBER="PatientNumber";
	public static final String GROUP_NUMBER="GroupNumber";
	public static final String GROUP_NAME="GroupName";
	public static final String EMPLOYEE_NAME="EmployeeName";
	public static final String PATIENT_NAME="PatientName";
	public static final String DENTAL_OFFICE_NAME="DentalOfficeName";
	public static final String DENTAL_OFFICE_NUMBER="DentalOfficeNumber";
	public static final String DESCRIPTION="Description";
	public static final String EMERGENCY_CARE="Emergency";
	public static final String EMAIL="Email";
	public static final String EMAIL_TEXT="EmailText";
	public static final String PHONE="Phone";
	public static final String PHONE_TEXT="PhoneText";
	public static final String PHONE_TEXT_1="PhoneText1";
	public static final String PHONE_TEXT_2="PhoneText2";
	public static final String BEST_TIME="BestTime";
	
	
	//Config Paramaters
	public static final String EMAIL_SUBJECT="EMAIL_SUBJECT";
	public static final String EMAIL_HOST="HOST";
	public static final String FROM_ID="FROM_ID";
	public static final String TO_ID="TO_ID";
	
	// error Constants
	public static final String ERROR="error";
	public static final String ERRORS="errors";
	
	public static final String NO="No";
	
	//Email Constants
	public static final String PATIENT_INFORMATION="Patient Information";
	public static final String PATIENT_NUMBER_EMAIL="Patient Number";
	public static final String GROUP_NUMBER_EMAIL="Group Number";
	public static final String GROUP_NAME_EMAIL="Group Name";
	public static final String EMPLOYEE_NAME_EMAIL="Employee Name";
	public static final String PATIENT_NAME_EMAIL="Patient Name";
	public static final String DENTAL_OFFICE_NAME_EMAIL="Dental Office Name";
	public static final String DENTAL_OFFICE_NUMBER_EMAIL="Dental Office Number";
	public static final String DESCRIPTION_EMAIL="Description of Situation";
	public static final String EMERGENCY_CARE_EMAIL="Emergency Care";
	public static final String CONTACT_INFORMATION="Contact Information";
	public static final String BEST_TIME_EMAIL="Best Time to Contact";
	
}
