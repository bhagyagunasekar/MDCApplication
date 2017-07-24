package com.glic.mdc.common.util;
/**
 * <p>Title:MDCUtils </p>
 *
 * <p>Description:Utilitry methods used accorss the application /p>
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
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class MDCUtils {
	private static ResourceBundle resouceBundle = null;
	private static ResourceBundle resouceBundleConfig = null;
	private static Properties props = null;

	/**
	 * Given a String it replaces the repalce value
	 * @param strSource
	 * @param strReplaceVal
	 * @param strSearchString
	 * @return String strReplacedValue
	 */
	public static String findReplace(String strSource, String strReplaceVal, String strSearchString) {

		StringBuffer strBuff = new StringBuffer();

		String strReplacedValue = null;
		strBuff.append(strSource);

		int intEnd = strBuff.toString().indexOf(strSearchString);

		while (intEnd != -1) {

			strBuff = strBuff.replace(intEnd, intEnd + strSearchString.length(), strReplaceVal);
			intEnd = strBuff.toString().indexOf(strSearchString);
		}

		strReplacedValue = strBuff.toString();

		strBuff = null;

		return strReplacedValue;

	}

	/**
	 * Builds a Node with node name with value 
	 * @param String node
	 * @param String value
	 * @param boolean cdata
	 * @return String
	 */
	public static String buildNode(String node, String value, boolean cdata) {
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		sb.append(node);
		sb.append(">");
		if (cdata) {
			sb.append("<![CDATA[");
			sb.append(checkTrim(value));
			sb.append("]]>");
		} else {
			sb.append(checkTrim(value));
		}
		sb.append("</");
		sb.append(node);
		sb.append(">");
		return sb.toString();
	}

	/**
	 * Returns true if the node with value in source
	 * @param String source
	 * @param String node
	 * @param String value
	 * @return boolean 
	 */
	public static boolean isNodeExists(String source, String node, String value) {
		boolean nodeExists = false;
		if (source != null) {
			if (source.indexOf(buildNode(node, value, false)) != -1) {
				nodeExists = true;
			}
		}
		return nodeExists;
	}

	/**
	 * checkTrim : Removes the leading trailing spaces from the String
	 * @return java.lang.String
	 * @param strResult java.lang.String
	 */
	public static String checkTrim(String strResult) {
		String strTemp = "";
		if (strResult != null) {
			strTemp = strResult.trim();
		}
		return strTemp;
	}

	/**
		 * Gets the value of a node from the given XML
		 * @param String XML
		 * @param String node
		 * @return String
		 */
	public static String getValueFromNode(String XML, String node) {
		String value = null;
		String startNode = "<" + node + ">";
		String endNode = "</" + node + ">";
		value = XML.substring(XML.indexOf(startNode) + startNode.length(), XML.indexOf(endNode));
		return value;
	}
	
	/**
			 * checkNull : Removes the leading trailing spaces from the String
			 * @return java.lang.String
			 * @param strResult java.lang.String
			 */
			public static String checkNull(String strResult) {
				String strTemp = " ";
				if (strResult != null) {
					strTemp = strResult.trim();
				}
				if (strTemp.trim().length() == 0) {
					strTemp = " ";
				}
				return strTemp;
			}

	/**
	* Returns the message for Given errorCode
	* @param String errorCode
	* @return String message
	*/
	public static String getErrorMessage(String errorCode) {
		String message = null;
		try {
			if (resouceBundle == null) {
				resouceBundle = ResourceBundle.getBundle("com.glic.mdc.common.util.errorResource");
			}
			message = resouceBundle.getString(errorCode);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}

	/**
	 * Returns the config value for Given Code
	 * @param String Code
	 * @return String message
	 */
	public static String getConfig(String code) {
		if (props==null){
			new MDCUtils().loadProperty();
		}
		return props.getProperty(code);

	}
	
	/**
	 * 
	 *Loads property file from SystemProperty
	 *
	 */	
	private void loadProperty(){
		InputStream is = null;
		try {
			props = new Properties();
			String file = "config.properties";
			is = this.getClass().getClassLoader().getResourceAsStream(file);
			props.load(is);			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try{
				if (is!=null){
					is.close();
					is=null;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
