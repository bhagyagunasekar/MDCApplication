package com.glic.mdc.common.exception;

/**
 * <p>Title:MDCHelperException </p>
 *
 * <p>Description:Exception class used throw if there is any error in Helper classes</p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company:GLIC </p>
 * 
 * 	@author CVNS
 * 
 *  @date Dec 14, 2005
 *  
 *  @version 1.0
 */
public class MDCHelperException extends MDCException {
	/**
	* Default constructor.
	*/

	public MDCHelperException() {
		super();
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   message     A user-friendly description of the exception.
	*/

	public MDCHelperException(String message) {
		super(message);
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   message     A user-friendly description of the exception.
	* @param   code		   An error code of the exception.
	*/

	public MDCHelperException(String message, String code) {
		super(message, code);
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   message		A user-friendly description of the exception.
	* @param   exception	A low level exception to be chained.
	*/

	public MDCHelperException(String message, Throwable exception) {
		super(message, exception);
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   message		A user-friendly description of the exception.
	* @param   exception	A low level exception to be chained.
	* @param   code			An error code of the exception.
	*/

	public MDCHelperException(String message, Throwable exception, String code) {
		super(message, exception, code);
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   exception	A low level exception to be chained.
	*/

	public MDCHelperException(Throwable exception) {
		super(exception);
	}
	/**
	* Constructor that takes an error message.
	*
	* @param   exception	A low level exception to be chained.
	* @param   code			An error code of the exception.
	*/

	public MDCHelperException(Throwable exception, String code) {
		super(exception, code);
	}

}
