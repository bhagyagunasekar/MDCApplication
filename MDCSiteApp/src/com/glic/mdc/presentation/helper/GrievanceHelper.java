package com.glic.mdc.presentation.helper;

import com.glic.mdc.common.MDCSiteConstants;
import com.glic.mdc.common.exception.MDCHelperException;
import com.glic.mdc.common.util.MDCUtils;
import com.glic.mdc.presentation.form.GrievanceForm;

/**
 * <p>Title:GrievanceHelper </p>
 *
 * <p>Description: This is the helper claass used to build XML from the request. 
 *    This extends BaseHelperclass.</p>
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
public class GrievanceHelper extends BaseHelper {
	/**
	 * Builds the Response XML For Grievance form and sets it form Bean
	 * @param GrievanceForm form
	 * @throws MDCHelperException
	 */
	public void responseShowGrievanceForm(GrievanceForm form) throws MDCHelperException {
		try {
			String emergencyChecked = MDCUtils.checkTrim(form.getHidEmergency());
			String emailChecked = MDCUtils.checkTrim(form.getHidEmail());
			String phoneChecked = MDCUtils.checkTrim(form.getHidPhone());
			if (emergencyChecked.length() == 0) {
				emergencyChecked = MDCSiteConstants.NO;
			}
			if (emailChecked.length() == 0) {
				emailChecked = MDCSiteConstants.NO;
			}
			if (phoneChecked.length() == 0) {
				phoneChecked = MDCSiteConstants.NO;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(
				MDCUtils.buildNode(
					MDCSiteConstants.PATIENT_NUMBER,
					MDCUtils.checkTrim(form.getTxtPatientNumber()),
					true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.GROUP_NUMBER, MDCUtils.checkTrim(form.getTxtGroupNumber()), true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.GROUP_NAME, MDCUtils.checkTrim(form.getTxtGroupName()), true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.GROUP_NAME, MDCUtils.checkTrim(form.getTxtGroupName()), true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.EMPLOYEE_NAME, MDCUtils.checkTrim(form.getTxtEmpName()), true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.PATIENT_NAME, MDCUtils.checkTrim(form.getTxtPatientName()), true));
			sb.append(
				MDCUtils.buildNode(
					MDCSiteConstants.DENTAL_OFFICE_NAME,
					MDCUtils.checkTrim(form.getTxtDentalOfficeName()),
					true));
			sb.append(
				MDCUtils.buildNode(
					MDCSiteConstants.DENTAL_OFFICE_NUMBER,
					MDCUtils.checkTrim(form.getTxtDentalOfficeNo()),
					true));
			sb.append(
				MDCUtils.buildNode(MDCSiteConstants.DESCRIPTION, MDCUtils.checkTrim(form.getTxtDescription()), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.EMERGENCY_CARE, MDCUtils.checkTrim(emergencyChecked), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.EMAIL, MDCUtils.checkTrim(emailChecked), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.EMAIL_TEXT, MDCUtils.checkTrim(form.getTxtEmail()), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.PHONE, MDCUtils.checkTrim(phoneChecked), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.PHONE_TEXT, MDCUtils.checkTrim(form.getTxtPhone()), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.PHONE_TEXT_1, MDCUtils.checkTrim(form.getTxtPhone_1()), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.PHONE_TEXT_2, MDCUtils.checkTrim(form.getTxtPhone_2()), true));
			sb.append(MDCUtils.buildNode(MDCSiteConstants.BEST_TIME, MDCUtils.checkTrim(form.getLstTime()), true));

			StringBuffer outXML = new StringBuffer();
			outXML.append(MDCUtils.buildNode(MDCSiteConstants.GLIC_APPLICATION_TAG, sb.toString(), false));
			form.setOutXML(outXML.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new MDCHelperException("Exception Occured in responseShowGrievanceForm() of GrievanceHelper");
		}
	}
}
