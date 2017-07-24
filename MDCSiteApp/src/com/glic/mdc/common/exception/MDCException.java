package com.glic.mdc.common.exception;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
/**
 * <p>Title:MDCException </p>
 *
 * <p>Description: Exception class for MDC application. This exception base Exception ALL MDC Exceptions</p>
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
public class MDCException extends Exception implements Serializable {

	//	An attribute that says message not set.
	private static final String MESSAGE_NOT_SET = "MESSAGE NOT SET";
	//An attribute that says error code not set.
	private static final String ERROR_CODE_NOT_SET = "ERROR CODE NOT SET";

	//Stack Trace Information.
	private String m_stackTraceInfo = null;
	//Error code for this exception.
	private String m_errorCode = null;

	/**
	 * Constructs a MDCException with
	 * no specified detail message, or causal
	 * exception.
	 */

	public MDCException() {
		super(MESSAGE_NOT_SET);
		m_stackTraceInfo = getMDCStackTrace();
		m_errorCode = ERROR_CODE_NOT_SET;
	}
	/**
	 * Constructs a MDCException with
	 * the specified detail message, but no causal
	 * exception.
	 *
	 * @param message the detail message.
	 */

	public MDCException(String message) {
		super(message);
		m_stackTraceInfo = getMDCStackTrace();
		m_errorCode = ERROR_CODE_NOT_SET;
	}
	/**
	 * Constructor allows the developer to set the message and The error code
	 *
	 * @param message the exception message
	 * @param message the error code
	 */

	public MDCException(String message, String code) {
		super(message);
		m_stackTraceInfo = getMDCStackTrace();
		m_errorCode = code;
	}
	/**
	 * Constructor allows the developer to set the message and exception
	 *
	 * @param message - the exception message
	 * @param exception - exception object
	 */

	public MDCException(String message, Throwable exception) {
		super(message);
		m_stackTraceInfo = getStackTrace(exception);
		m_errorCode = ERROR_CODE_NOT_SET;
	}

	/**
   * Constructor allows the developer to set the message, the exception and The error code
   *
   * @param message - the exception message
   * @param exception - exception object
   * @param code - the error code
   */

	public MDCException(String message, String code, Throwable exception) {
		super(message);
		m_stackTraceInfo = getStackTrace(exception);
		m_errorCode = code;
	}

	/**
	 * Constructor allows the developer to set the message, the exception and The error code
	 *
	 * @param message - the exception message
	 * @param exception - exception object
	 * @param code - the error code
	 */

	public MDCException(String message, Throwable exception, String code) {
		super(message);
		m_stackTraceInfo = getStackTrace(exception);
		m_errorCode = code;
	}
	/**
	 * Constructor that allows nesting of another Throwable.
	 *
	 * @param   exception      The Throwable to be nested.
	 */

	public MDCException(Throwable exception) {
		super(exception.getMessage());
		m_stackTraceInfo = getStackTrace(exception);
		m_errorCode = ERROR_CODE_NOT_SET;
	}
	/**
	 * Constructor allows the developer to set the exception and The error code
	 *
	 * @param exception - exception object
	 * @param code - the error code
	 */

	public MDCException(Throwable exception, String code) {
		super(MESSAGE_NOT_SET);
		m_stackTraceInfo = getStackTrace(exception);
		m_errorCode = code;
	}
	/**
	 * This method allows the developer to get the error code
	 *	
	 * @return String Error Code
	 */

	public String getErrorCode() {
		return m_errorCode;
	}
	private String getMDCStackTrace() {
		String stackTraceInfo = null;
		ByteArrayOutputStream outPut = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(outPut);
		super.printStackTrace(writer);
		writer.flush();
		stackTraceInfo = outPut.toString();
		writer.close();
		try {
			outPut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stackTraceInfo;
	}

	private String getStackTrace(Throwable exception) {
		String stackTraceInfo = null;
		ByteArrayOutputStream outPut = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(outPut);
		exception.printStackTrace(writer);
		writer.flush();
		stackTraceInfo = outPut.toString();
		try {
			writer.close();
			outPut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stackTraceInfo;
	}

	/**
	 * Prints the stack trace for this exception.
	 *
	 */

	public void printStackTrace() {
		super.printStackTrace();
	}

	/**
	 * Prints the stack trace for this exception into a specified
	 * PrintStream.
	 *
	 * @param   stream  The PrintStream to use.
	 */

	public void printStackTrace(PrintStream stream) {
		super.printStackTrace(stream);
		stream.print(m_stackTraceInfo);
	}
	/**
	 * Prints the stack trace for this exception into a specified
	 * PrintWriter.
	 *
	 * @param   writer  The PrintWriter to use.
	 */

	public void printStackTrace(PrintWriter writer) {
		super.printStackTrace(writer);
		writer.print(m_stackTraceInfo);
	}

}
