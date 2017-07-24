package com.glic.mdc.common.util;

/**
 * <p>Title:LoggerUtils</p>
 *
 * <p>Description: Utilitry class for logging implementation. LOG4J logging mechanism is implemented here./p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company:GLIC </p>
 * 
 * 	@author CVNS
 * 
 *  @date Dec 25, 2005
 *  
 *  @version 1.0
 */

import org.apache.log4j.Logger;

import com.glic.mdc.common.MDCSiteConstants;

public class LoggerUtils {

	/**
	  * Displays message for class with type  
	  * @param Class object
	  * @param String type
	  * @param String message
	  */
	public static void log(Class object, String type, String message) {

		try {
			Logger logger = Logger.getLogger(object);
			if (type.equals(MDCSiteConstants.LOGGER_DEBUG)) {
				logger.debug(message);
			}
			if (type.equals(MDCSiteConstants.LOGGER_INFO)) {
				logger.info(message);
			}
			if (type.equals(MDCSiteConstants.LOGGER_ERROR)) {
				logger.error(message);
			}
			if (type.equals(MDCSiteConstants.LOGGER_FATAL)) {
				logger.fatal(message);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}