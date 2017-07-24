package com.glic.mdc.presentation.action;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glic.ea.framework.controller.GlicAction;
import com.glic.ea.framework.controller.GlicActionMapping;
import com.glic.ea.framework.controller.GlicForm;
import com.glic.ea.framework.controller.GlicForward;
import com.glic.ea.framework.error.GlicException;
import com.glic.mdc.common.MDCSiteConstants;
import com.glic.mdc.common.exception.MDCException;
import com.glic.mdc.common.exception.MDCHelperException;
import com.glic.mdc.common.util.LoggerUtils;
import com.glic.mdc.common.util.MDCUtils;
import com.glic.mdc.presentation.form.GrievanceForm;
import com.glic.mdc.presentation.helper.GrievanceHelper;

/**
 * <p>Title:GrievanceAction </p>
 *
 * <p>Description: Actiion class used for all the Grievance operations,Like showing the form,submiting the form etc</p>
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
public class GrievanceAction extends BaseAction {
	public GlicForward execute(
		GlicActionMapping mapping,
		GlicForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws GlicException {
		GrievanceForm grievanceForm = null;
		GlicForward forward = null;
		GrievanceHelper helper = null;
		String forwardPath = null;
		String eventName = null;
		String XMLData = null;
		try {
			LoggerUtils.log(
				this.getClass(),
				MDCSiteConstants.LOGGER_INFO,
				"-----------------Begin GrievanceAction----------------");
			grievanceForm = (GrievanceForm) form;
			eventName = request.getParameter(MDCSiteConstants.EVENT_NAME);
			helper = new GrievanceHelper();
			//if the evenName is null set the Event name as SHOW_WELCOME
			if (MDCUtils.checkTrim(eventName).length() == 0) {
				eventName = MDCSiteConstants.SHOW_WELCOME;
				XMLData = MDCSiteConstants.DEFAULT_XML;
				grievanceForm.reset();
			} else if (MDCUtils.checkTrim(eventName).equals(MDCSiteConstants.SHOW_GRIVANCE_FORM)) {
				executeShowGrivanceForm(grievanceForm, helper);
				XMLData = grievanceForm.getOutXML();
			} else if (MDCUtils.checkTrim(eventName).equals(MDCSiteConstants.SHOW_GRIVANCE_CONFIRM_FORM)) {
				executeShowGrivanceForm(grievanceForm, helper);
				XMLData = grievanceForm.getOutXML();
			} else if (MDCUtils.checkTrim(eventName).equals(MDCSiteConstants.MAIL_GRIVANCE_FORM)) {
				eMailGrievanceForm(grievanceForm);
				XMLData = MDCSiteConstants.DEFAULT_XML;
			}
			forwardPath = eventName;
			LoggerUtils.log(
				this.getClass(),
				MDCSiteConstants.LOGGER_INFO,
				"-----------------End GrievanceAction----------------");

		} catch (MDCHelperException mdx) {
			LoggerUtils.log(
				this.getClass(),
				MDCSiteConstants.LOGGER_ERROR,
				"Exception occurred in method execute() of GrievanceAction :" + mdx.getMessage());
			XMLData = getGLICErrorXML("Error While Processing your request in GrievanceHelper");
			forwardPath = "error";
		} catch (MDCException mdx) {
			LoggerUtils.log(
				this.getClass(),
				MDCSiteConstants.LOGGER_ERROR,
				"Exception occurred in method execute() of GrievanceAction :" + mdx.getMessage());
			XMLData = getGLICErrorXML("Error While Mailing your details");
			forwardPath = "error";
		} catch (Exception ex) {
			ex.printStackTrace();
			LoggerUtils.log(
				this.getClass(),
				MDCSiteConstants.LOGGER_ERROR,
				"Exception occurred in method execute() of GrievanceAction :" + ex.getMessage());
			XMLData = getGLICErrorXML("Error While processing your request in action");
			forwardPath = "error";
		}
		request.setAttribute(GlicAction.RESULT_DATA, XMLData);
		forward = mapping.findGlicForward(forwardPath);
		return forward;
	}
	/**
	 * Builds the Response XML for Grievance Form
	 * @param GrievanceForm form
	 * @param GrievanceHelper helper
	 * @return GrievanceForm form
	 * @throws MDCHelperException
	 */
	private GrievanceForm executeShowGrivanceForm(GrievanceForm form, GrievanceHelper helper)
		throws MDCHelperException {
		helper.responseShowGrievanceForm(form);
		return form;
	}
	/**
	 * Mails the Content To recipiant
	 * @param GrievanceForm form
	 * @exception MDCException
	 */
	private void eMailGrievanceForm(GrievanceForm form) throws MDCException {
		try {
			String subject = MDCUtils.getConfig(MDCSiteConstants.EMAIL_SUBJECT);
			StringBuffer bodyContent = new StringBuffer();
			bodyContent.append("<table >");
			bodyContent.append("<tr><td align='left'><font size='4'><b>");
			bodyContent.append(MDCSiteConstants.PATIENT_INFORMATION);
			bodyContent.append("</b></font></td></tr>");
			bodyContent.append("</table>");
			bodyContent.append("<table >");
			bodyContent.append("<tr><td></td></tr>");
			bodyContent.append("<tr><td><b>");
			bodyContent.append(MDCSiteConstants.PATIENT_NUMBER_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtPatientNumber()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td><b>");
			bodyContent.append(MDCSiteConstants.GROUP_NUMBER_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtGroupNumber()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.GROUP_NAME_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtGroupName()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.EMPLOYEE_NAME_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtEmpName()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.PATIENT_NAME_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtPatientName()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.DENTAL_OFFICE_NAME_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtDentalOfficeName()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.DENTAL_OFFICE_NUMBER_EMAIL);
			bodyContent.append("&nbsp;&nbsp;: </b>\t\t");
			bodyContent.append(MDCUtils.checkNull(form.getTxtDentalOfficeNo()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td><b>");
			bodyContent.append(MDCSiteConstants.DESCRIPTION_EMAIL);
			bodyContent.append(": </b>");
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td wrap='yes'>");
			if(form.getTxtDescription().length()>80)
			{
			bodyContent.append("<TEXTAREA rows='5' cols='80' style='background-color:#ffffff;border:0px;' readonly='true'>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtDescription()));
			bodyContent.append("</TEXTAREA>");
			}
			else if(form.getTxtDescription().length()<80)
			{
				bodyContent.append(MDCUtils.checkNull(form.getTxtDescription()));
			}
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.EMERGENCY_CARE_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getHidEmergency()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td></td></tr>");
			bodyContent.append("<tr><td></td></tr>");
			bodyContent.append("</table>");
			bodyContent.append("<table>");
			bodyContent.append("<tr><td align='left'><font size='4'><b>");
			bodyContent.append(MDCSiteConstants.CONTACT_INFORMATION);
			bodyContent.append("</b></font>");
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td></td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtEmail()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td ><b>");
			bodyContent.append(MDCSiteConstants.PHONE);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getTxtPhone()));
			bodyContent.append(MDCUtils.checkNull(form.getTxtPhone_1()));
			bodyContent.append(MDCUtils.checkNull(form.getTxtPhone_2()));
			bodyContent.append("</td></tr>");
			bodyContent.append("<tr><td><b>");
			bodyContent.append(MDCSiteConstants.BEST_TIME_EMAIL);
			bodyContent.append("&nbsp;&nbsp;&nbsp;&nbsp;: </b>");
			bodyContent.append(MDCUtils.checkNull(form.getLstTime()));
			bodyContent.append("</td></tr>");
			bodyContent.append("</table>");
			// SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!
			String to = MDCUtils.getConfig(MDCSiteConstants.TO_ID);
			String from = MDCUtils.getConfig(MDCSiteConstants.FROM_ID);
			// SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!!!
			String host = MDCUtils.getConfig(MDCSiteConstants.EMAIL_HOST);
			// Create properties, get Session
			Properties props = new Properties();
			// If using static Transport.send(),
			// need to specify which host to send it to
			props.put("mail.smtp.host", host);
			// To see what is going on behind the scene
			props.put("mail.debug", "false");
			Session session = Session.getInstance(props);

			//Instantiatee a message
			Message msg = new MimeMessage(session);
			Multipart mp = new MimeMultipart();
			MimeBodyPart mbp = new MimeBodyPart();
			mbp.setContent(bodyContent.toString(), "text/html");
			mp.addBodyPart(mbp);
			msg.setContent(mp);
			//Set message attributes
			msg.setFrom(new InternetAddress(from));
			InternetAddress[] address = { new InternetAddress(to)};
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			Transport.send(msg);
			form.reset();
		} catch (MessagingException mex) {
			// Prints all nested (chained) exceptions as well
			mex.printStackTrace();
			throw new MDCException(mex.getMessage());
		}
	}
}
