<xsl:stylesheet version='1.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform'>
	<xsl:template match="glicApplication">
		<xsl:variable name="bestTime">
			<xsl:value-of select="BestTime" />
		</xsl:variable>
		<html>
			<HEAD>
				<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
				<title>GRIEVANCE FORM</title>
				<META name="keywords" content="guardian dental insurance, guardian health insurance, health insurance, dental insurance, business insurance, small business insurance, disability insurance, long term care insurance, health insurance companies" />
				<META name="description" content="Find out why over six million employees are covered by Guardian's group health, dental and vision insurance products" />
				<LINK rel="stylesheet" title="style" type="text/css" href="css/style.css" />
				<script language="JavaScript" src="javascript/formate.js" />
				<script language="JavaScript" src="javascript/mdcscript.js" />
			</HEAD>
			<BODY onload="javascript:window.history.forward(1);">
				<FORM method="post">
					<TABLE cellpadding="0" cellspacing="0" width="767">
						<TR>
							<td>&#160;</td>
							<TD align='right' class="home_link_normal" id="home" onclick="javascript:void homePage()" STYLE="cursor: hand" onMouseOver="this.className='home_link_mouseover'" onMouseOut="this.className='home_link_normal'">Home</TD>
						</TR>
						<div>
							<img border="0" height="8" width="1" alt="" src="images/x.gif" />
						</div>
					</TABLE>
					<table width="767" border="0" cellspacing="0" cellpadding="0">
						<div>
							<img border="0" height="8" width="1" alt="" src="images/x.gif" />
						</div>
						<tr>
							<td>
								<div>
									<img border="0" alt="Health insurance, medical insurance and dental insurance for groups" src="images/grievance.jpg" />
								</div>
							</td>
						</tr>
					</table>
					<table width="767" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td rowspan="2" bgcolor="#cccccc">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#ffffff">
								<img border="0" height="1" width="464" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#ffffff">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#ffffff">
								<img border="0" height="1" width="300" alt="" src="images/x.gif" />
							</td>
							<td rowspan="2" bgcolor="#cccccc">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
						</tr>
						<tr>
							<td valign="top" width="464" bgcolor="#ffffff">
								<table height="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td bgcolor="999966" colspan="3">
											<img border="0" height="5" width="464" alt="" src="images/x.gif" />
										</td>
									</tr>
									<tr>
										<td>
											<img border="0" height="1" width="20" alt="" src="images/x.gif" />
										</td>
										<td height="100%" width="424" valign="top">
											<div>
												<img border="0" height="10" width="1" alt="" src="images/x.gif" />
											</div>
											<img border="0" alt="" src="images/hdr_please_provide.gif" />
											<div>
													<img border="0" alt="" src="images/x.gif" />
											</div>
											<!--Main Section-->
											<span>
												We regret any trouble you may have experienced. We encourage you to provide as much detail

												as you like. Rest assured that your information is transmitted using a secure connection.
												<SPAN class="goldtd">All required fields are marked with an asterisk (*).</SPAN>
												<div>
													<img border="0" height="10" width="1" alt="" src="images/x.gif" />
												</div>
											</span>
										</td>
										<td>
											<img border="0" height="1" width="20" alt="" src="images/x.gif" />
										</td>
									</tr>
									<tr>
										<td>
											<img border="0" height="1" width="20" alt="" src="images/x.gif" />
										</td>
										<td>
											<TABLE cellpadding="0" cellspacing="0" border="0" width="424">
												<TBODY>
													<TR>

														<TD>
															<B>Patient Information</B>
														</TD>
														<TD width="60%">&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD colspan="5">
															<SPAN class="goldtd">Though they are not required, please help us address your grievance faster by providing the Patient Number and Group Number.</SPAN>
														</TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD>Patient Number:</TD>
														<TD align="left">
															<INPUT type="text" name="txtPatientNumber" class="fieldsOff" id="PatientNumber" maxlength="20" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="PatientNumber" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													
													<TR>
														<TD>Group Number:</TD>
														<TD>
															<INPUT type="text" name="txtGroupNumber" class="fieldsOff" id="GroupNumber" maxlength="20" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="GroupNumber" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													
													<TR>
														<TD>
															Group Name
															<SPAN class="goldtd">*:</SPAN>
														</TD>
														<TD>
															<INPUT type="text" name="txtGroupName" class="fieldsOff" id="GroupName" maxlength="45" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="GroupName" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>
															Employee Name
															<SPAN class="goldtd">*:</SPAN>
														</TD>
														<TD>
															<INPUT type="text" name="txtEmpName" class="fieldsOff" id="EmpName" maxlength="45" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="EmployeeName" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>
															Patient Name
															<SPAN class="goldtd">*:</SPAN>
														</TD>
														<TD>
															<INPUT type="text" name="txtPatientName" class="fieldsOff" id="PatientName" maxlength="45" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="PatientName" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>
															Dental Office Name
															<SPAN class="goldtd">*:</SPAN>
														</TD>
														<TD>
															<INPUT type="text" name="txtDentalOfficeName" class="fieldsOff" id="DentalOfficeName" maxlength="45" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="DentalOfficeName" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD colspan="2">
															<SPAN class="goldtd">If not applicable, enter 'N/A'</SPAN>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>Dental Office Number:</TD>
														<TD>
															<INPUT type="text" name="txtDentalOfficeNo" class="fieldsOff" id="DentalOfficeNo" maxlength="20" size="30">
																<xsl:attribute name="value">
																	<xsl:value-of select="DentalOfficeNumber" />
																</xsl:attribute>
															</INPUT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD colspan="2">
															Description of Situation
															<SPAN class="goldtd">*:</SPAN>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD colspan="5">
															<TEXTAREA rows="5" cols="80	" name="txtDescription">
																<xsl:value-of select="Description" />
															</TEXTAREA>
														</TD>
													</TR>
													<TR>
														<TD colspan="5">
															<INPUT type="checkbox" name="chkEmergency" id="emergency">
																<xsl:if test="Emergency = 'Yes'">
																	<xsl:attribute name="CHECKED">TRUE</xsl:attribute>
																</xsl:if>
															</INPUT>
															Check here if this grievance involves emergency care.
														</TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD colspan="5">
															<B>Contact Information</B>
															<SPAN class="goldtd">*</SPAN>
														</TD>
													</TR>
													<TR>
														<TD colspan="5">
															<SPAN class="goldtd">Please provide at least one method for us to contact you.</SPAN>
														</TD>
													</TR>
													<TR>
														<TD>
															<INPUT type="checkbox" name="chkEmail" id="email">
																<xsl:if test="Email = 'Yes'">
																	<xsl:attribute name="CHECKED">TRUE</xsl:attribute>
																</xsl:if>
															</INPUT>
															Email &#160;
														</TD>
														<TD colspan="2">
															<INPUT type="text" name="txtEmail" class="fieldsOff" id="emailVal" maxlength="45" size="13">
																<xsl:attribute name="value">
																	<xsl:value-of select="EmailText" />
																</xsl:attribute>
															</INPUT>
															&#160;
															<SPAN>(xxx@xxx.xxx)</SPAN>
														</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>
															<INPUT type="checkbox" name="chkPhone" id="phone">
																<xsl:if test="Phone = 'Yes'">
																	<xsl:attribute name="CHECKED">TRUE</xsl:attribute>
																</xsl:if>
																Phone
															</INPUT>
														</TD>
														<TD colspan="2">
															<INPUT type="text" name="txtPhone" class="fieldsOff" id="phoneVal" maxlength="3" size="3" onKeyUp="return autoTab(this,3,event);">
																<xsl:attribute name="value">
																	<xsl:value-of select="PhoneText" />
																</xsl:attribute>
															</INPUT>
															-
															<INPUT type="text" name="txtPhone_1" class="fieldsOff" id="phoneVal_1" maxlength="3" size="3" onKeyUp="return autoTab(this,3,event);">
																<xsl:attribute name="value">
																	<xsl:value-of select="PhoneText1" />
																</xsl:attribute>
															</INPUT>
															-
															<INPUT type="text" name="txtPhone_2" class="fieldsOff" id="phoneVal_2" maxlength="4" size="4">
																<xsl:attribute name="value">
																	<xsl:value-of select="PhoneText2" />
																</xsl:attribute>
															</INPUT>
															&#160;
															<SPAN>(999-999-9999)</SPAN>
														</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>Best Time to Contact:</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD><div><img border="0" height="25" width="20" alt="" src="images/x.gif" /></div></TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>
															<SELECT name="lstTime">
																<OPTION value="Before Noon">
																	<xsl:if test="BestTime='Before Noon'">
																		<xsl:attribute name="selected">selected</xsl:attribute>
																	</xsl:if>
																	Before Noon
																</OPTION>
																<OPTION value="Evening">
																	<xsl:if test="BestTime='Evening'">
																		<xsl:attribute name="selected">selected</xsl:attribute>
																	</xsl:if>
																	Evening
																</OPTION>
																<OPTION value="Early Morning">
																	<xsl:if test="BestTime='Early Morning'">
																		<xsl:attribute name="selected">selected</xsl:attribute>
																	</xsl:if>
																	Early Morning
																</OPTION>

															</SELECT>
														</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD colspan="5">CALIFORNIA DEPARTMENT OF MANAGED HEALTH CARE DISCLOSURE REGARDING GRIEVANCES:</TD>
													</TR>

													<TR>
														<TD colspan="5" class="disclosure_text">
															<div>
																<img border="0" height="5" width="1" alt="" src="images/x.gif" />
															</div>
															The California Department of Managed Health Care is responsible for regulating health care service plans. If you have a grievance against your health plan, you should first telephone your health plan at
															<B>1-800-273- 3330</B>
															and use your health plan’s grievance process before contacting the department. Utilizing this grievance procedure does not prohibit any potential legal rights or remedies that may be available to you. If you need help with a grievance involving an emergency, a grievance that has not been satisfactorily resolved by your health plan, or a grievance that has remained unresolved for more than 30 days, you may call the department for assistance. You may also be eligible for an Independent Medical Review (IMR). If you are eligible for IMR, the IMR process will provide an impartial review of medical decisions made by a health plan related to the medical necessity of a proposed service or treatment, coverage decisions for treatments that are experimental or investigational in nature and payment disputes for emergency or urgent medical services. The department also has a toll-free telephone number
															<B>(1-888-HMO-2219)</B>
															and a TDD line
															<B>(1-877-688-9891)</B>
															for the hearing and speech impaired. The department’s Internet Web site
															<B>
																<U>
																	<A href="javascript: homeHelp()" class="generic_link">http://www.hmohelp.ca.gov</A>
																</U>
															</B>
															has complaint forms, IMR application forms and instructions online.
														</TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
													<TR>
														<TD colspan="5" align="right">
															<INPUT type="button" name="btnPreview" class="button" value="Preview Your Completed Form" onclick="javascript:showConfirmPage();" />
														</TD>
													</TR>
													<TR>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
														<TD>&#160;</TD>
													</TR>
												</TBODY>
											</TABLE>

										</td>
										<td>
											<img border="0" height="1" width="20" alt="" src="images/x.gif" />
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="#cccccc">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
							<td height="100%" valign="top">
								<!--SideBar Section-->
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td bgcolor="#996666" colspan="3">
											<img border="0" height="5" width="100%" alt="" src="images/x.gif" />
										</td>
									</tr>
									<tr>
										<td>
											<img border="0" height="1" width="15" alt="" src="images/x.gif" />
										</td>
										<td valign="top">
											<div>
												<img border="0" alt="" src="images/hdr_important_contact.gif" />
												<img border="0" height="10" alt="" src="images/x.gif" />
											</div>
											<span id="solutions.resources">
												<div>
													<div>Managed Dental Care Customer Service:</div>
													<div>
														<img border="0" height="2" width="1" alt="" src="images/x.gif" />
													</div>
												</div>
												<div>
													<div>
														<img border="0" height="10" width="10" alt="" src="images/bullet_gray.gif"/>&#160;1-800-277-3330
													</div>
													<div>
														<img border="0" height="10" width="1" alt="" src="images/x.gif" />
													</div>
												</div>
												<div>
													<div>California Department of Managed Health Care:</div>
													<div>
														<img border="0" height="1" width="1" alt="" src="images/x.gif" />
													</div>
													<div>
														<img border="0" height="10" width="10" alt="" src="images/bullet_gray.gif"/>&#160;1-800-HMO-2219
													</div>
													<div>
														<img border="0" height="1" width="1" alt="" src="images/x.gif" />
													</div>
													<div>
														<img border="0" height="10" width="10" alt="" src="images/bullet_gray.gif"/>&#160;1-877-688-9891 (TDD)
													</div>
													<div>
														<img border="0" height="1" width="1" alt="" src="images/x.gif" />
													</div>
													<img border="0" height="10" width="10" alt="" src="images/bullet_gray.gif"/>&#160;
														<A href="javascript: homeHelp()" class="generic_link">www.hmohelp.ca.gov</A>
													
													<div>
														<img border="0" height="10" width="1" alt="" src="images/x.gif" />
													</div>
												</div>
											</span>
										</td>
										<td>
											<img border="0" height="1" width="15" alt="" src="images/x.gif" />
										</td>
									</tr>
								</table>
								<input type="hidden" name="EventName" />
								<input type="hidden" name="hidEmergency" />
								<input type="hidden" name="hidPhone" />
								<input type="hidden" name="hidEmail" />
								<table width="300" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td bgcolor="#669999">
											<img border="0" height="5" width="15" alt="" src="images/x.gif" />
										</td>
										<td bgcolor="#669999">
											<img border="0" height="5" width="270" alt="" src="images/x.gif" />
										</td>
										<td bgcolor="#669999">
											<img border="0" height="5" width="15" alt="" src="images/x.gif" />
										</td>
									</tr>
									<tr>
										<td>
											<img border="0" height="1" width="15" alt="" src="images/x.gif" />
										</td>
										<td valign="top">
											<table width="270" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td>
														<table border="0" cellspacing="0" cellpadding="0">
															<tr>
																<td>
																	<div>
																		<img border="0" alt="" src="images/hdr_helpful_links.gif" />
																		<img border="0" height="10" alt="" src="images/x.gif" />
																	</div>
																</td>
															</tr>
															<tr>
																<td colspan="2">
																	<img border="0" height="10" width="10" alt="" src="images/bullet_gray.gif"/>&#160;
																		<A href="javascript:findProvider();" class="generic_link">Find a Dental Provider</A>
																	
																</td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</td>
										<td>
											<img border="0" height="1" width="15" alt="" src="images/x.gif" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<!--Our Strength Section-->
					<table width="767" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td rowspan="4" bgcolor="#cccccc">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#cccccc">
								<img border="0" height="1" width="20" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#cccccc">
								<img border="0" height="1" width="725" alt="" src="images/x.gif" />
							</td>
							<td bgcolor="#cccccc">
								<img border="0" height="1" width="20" alt="" src="images/x.gif" />
							</td>
							<td rowspan="4" bgcolor="#cccccc">
								<img border="0" height="1" width="1" alt="" src="images/x.gif" />
							</td>
						</tr>

					</table>
					<table width="767" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td>
								<img border="0" height="1" width="20" alt="" src="images/x.gif" />
							</td>
							<td>
								<span id="footer_id">
									<div>
										<img border="0" height="8" width="1" alt="" src="images/x.gif" />
									</div>
									<div class="footer">Note: Free language assistance services are available for you and your dependents to assist with your dental needs. Please contact MDC’s Member Services Department at 1-800-273-3330, your assigned network general dentist or your network specialist (for MDC approved specialty care) if English is not your or your dependents’ preferred spoken or written language.</div>
									<div class="footer">Copies of all Vital Plan Documents translated into Spanish are available by contacting MDC's Member Services Department at 1-800-273-3330.</div>
									<div class="footer">Nota: Los servicios gratuitos de ayuda con el idioma están disponibles para usted y sus dependientes para ayudarle con sus necesidades dentales. Si el inglés no es el idioma preferido de usted o sus dependientes, por favor comuníquese a nuestro Departamento de Servicios para Miembros al 1-800-273-3330, su dentista general de red asignada o su especialista de red (para una atención especializada de MDC).</div>
									<div class="footer">Todas las copias de los documentos vitales de el plan tradudidos a español están disponibles comunicandose a  MDC el departamento de servicios al cliente a el 1-800-273-3330.</div>
									<div class="footer">&#169; <script>document.write(new Date().getFullYear())</script>, Managed Dental Care, 21820 Burbank Blvd, Suite 200, Woodland Hills, CA 91367, USA.</div>
									<div>
										<img border="0" height="5" width="1" alt="" src="images/x.gif" />
									</div>
									<div class="footer">We are committed to protecting your privacy. Read our <a href="javascript:showPrivatePolicy();" class="footer">privacy policies</a> for more information.</div>
									<div><img border="0" height="5" width="1" alt="" src="/images/x.gif"/></div>
								</span>
							</td>
						</tr>
					</table>
				</FORM>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>

