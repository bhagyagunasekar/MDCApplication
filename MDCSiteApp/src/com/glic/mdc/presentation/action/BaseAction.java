package com.glic.mdc.presentation.action;

import com.glic.ea.framework.controller.GlicAction;
import com.glic.mdc.common.MDCSiteConstants;
import com.glic.mdc.common.util.MDCUtils;
/**
 * <p>Title:BaseAction </p>
 *
 * <p>Description: This is the base class for all action classes. 
 *    This extends GlicAction class.</p>
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
public class BaseAction extends GlicAction {

	/**
	 * Builds the Error XML
	 * @param String message
	 * @return String
	 */
	protected String getGLICErrorXML(String message) {
		String errorXML = "";
		String errorMessage = MDCUtils.buildNode(MDCSiteConstants.ERROR, message, true);
		errorMessage = MDCUtils.buildNode(MDCSiteConstants.ERRORS, errorMessage, false);
		errorXML = MDCUtils.buildNode(MDCSiteConstants.GLIC_APPLICATION_TAG, errorMessage, false);
		return errorXML;
	}
}
