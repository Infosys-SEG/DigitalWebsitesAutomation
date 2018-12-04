package computedClass;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import Utility.ReadExcel;

public class Computed_DB 
{
	private String result;
	@Test
	public WebDriver DB(WebDriver driver,int i,int g1, String result) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{ 
		ReadExcel readExcel=new ReadExcel();
	    try 
	    {
	    	readExcel.openExcel();
	    } 
	    catch (IOException e) 
	    {
	    	e.printStackTrace();
	    }
	    catch (NullPointerException e) 
	    {
	        
	    } 
	    new ReadExcel().excelRead("Global",g1);
	    String chain="";
	    if(ReadExcel.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			 chain="1";
		}
		else if(ReadExcel.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			chain="2";
		}
		else if(ReadExcel.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			chain="3";
		}
	    		
	    String sheet=ReadExcel.getValue("Functionality");
	    new ReadExcel().excelRead(sheet,i);
	    String cardtype=String.valueOf(ReadExcel.getValue("Card_Type(Card/Phone/CRC)")).replace("null", "");
	    String value="";
	   
		// Declare the JDBC objects.  
		Connection con = null;  
		Statement stmt = null;  
		ResultSet rs = null;
		ResultSet dt = null;
		String sysdate=null;
		//ResultSet attr=null;
		try 
		{  
			// Establish the connection.  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			con = DriverManager.getConnection("jdbc:sqlserver://msqlq01hdqww:1433;database=ODSCustomer_QA;integratedSecurity=true");			
			String dtval="SELECT CONVERT (date, SYSDATETIME())";
			stmt = con.createStatement();  
			dt=stmt.executeQuery(dtval);
			while (dt.next()) 
			{
				sysdate = dt.getString(1);
			}
			 if(cardtype.equalsIgnoreCase("Card"))
			 {
				 String cn=String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "");
				 String mail=String.valueOf(ReadExcel.getValue("EmailAddress")).replace("null", "");
				 value=" where ALIAS_NUMBER='"+cn+"' and CHAIN_ID="+chain+" and D.LAST_UPDATE_DT='"+sysdate+"' and EMAIL_ADDRESS='"+mail+"'";
			 }
			 else if(cardtype.equalsIgnoreCase("Phone")||cardtype.equalsIgnoreCase("NewMember"))
			 {
				 String mob=String.valueOf(ReadExcel.getValue("Primary_Phone")).replace("null", "");
				 String mail=String.valueOf(ReadExcel.getValue("EmailAddress")).replace("null", "");
				 value=" where MOBILE_PHONE='"+mob+"' and CHAIN_ID="+chain+" and D.LAST_UPDATE_DT='"+sysdate+"' and EMAIL_ADDRESS='"+mail+"'";
			 }
			 else  if(cardtype.equalsIgnoreCase("CRC"))
			 {
				 String cn=String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "");
				 String mail=String.valueOf(ReadExcel.getValue("EmailAddress")).replace("null", "");
				 value=" where B.CRC_ID='"+cn+"' and CHAIN_ID="+chain+" and D.LAST_UPDATE_DT='"+sysdate+"' and EMAIL_ADDRESS='"+mail+"'";
			 }
			String SQL = "select * from ODSCustomer_QA.dbo.CUST_ALIAS A join ODSCustomer_QA.dbo.CUST B on A.MEMBER_ID = B.MEMBER_ID join ODSCustomer_QA.dbo.CUST_MEMBERSHIP C on A.MEMBER_ID = C.MEMBER_ID join ODSCustomer_QA.dbo.CUST_ADDR D on B.CRC_ID=D.CRC_ID" +value;	
			rs = stmt.executeQuery(SQL);  
			String B_CRC_ID=null;
			while (rs.next()) 
			{
				String SALUTATION = rs.getString("SALUTATION");
				String FIRST_NAME = rs.getString("FIRST_NAME");
				String LAST_NAME = rs.getString("LAST_NAME");
				String BIRTH_DT = rs.getString("BIRTH_DT");
				String MOBILE_PHONE = rs.getString("MOBILE_PHONE");				
				String EMAIL_ADDRESS = rs.getString("EMAIL_ADDRESS");
				String STREET_ADDRESS_1 = rs.getString("STREET_ADDRESS_1");
				String STREET_ADDRESS_2 = rs.getString("STREET_ADDRESS_2");
				String CITY_NAME = rs.getString("CITY_NAME");
				String STATE_CODE = rs.getString("STATE_CODE");
				String POSTAL_CODE = rs.getString("POSTAL_CODE");
				String ALIAS_NUMBER = rs.getString("ALIAS_NUMBER");
			    B_CRC_ID = rs.getString("B.CRC_ID");
				String ENROLLMENT_STATUS = rs.getString("ENROLLMENT_STATUS");
				String CHAIN_ID = rs.getString("CHAIN_ID");
				String A_LAST_UPDATE_SOURCE = rs.getString("A.LAST_UPDATE_SOURCE");
				String B_LAST_UPDATE_SOURCE = rs.getString("B.LAST_UPDATE_SOURCE");
				String C_LAST_UPDATE_SOURCE = rs.getString("C.LAST_UPDATE_SOURCE");
				String D_LAST_UPDATE_SOURCE = rs.getString("D.LAST_UPDATE_SOURCE");
				String A_LAST_UPDATE_DT = rs.getString("A.LAST_UPDATE_DT");
				String B_LAST_UPDATE_DT = rs.getString("B.LAST_UPDATE_DT");
				String D_LAST_UPDATE_DT= rs.getString("D.LAST_UPDATE_DT");
				
				SALUTATION=String.valueOf(SALUTATION).replace("null", "");
				FIRST_NAME=String.valueOf(FIRST_NAME).replace("null", "");
				LAST_NAME =String.valueOf(LAST_NAME).replace("null", "");
				BIRTH_DT=String.valueOf(BIRTH_DT).replace("null", "");
				MOBILE_PHONE=String.valueOf(MOBILE_PHONE).replace("null", "");
				EMAIL_ADDRESS=String.valueOf(EMAIL_ADDRESS).replace("null", "");
				STREET_ADDRESS_1=String.valueOf(STREET_ADDRESS_1).replace("null", "");
				STREET_ADDRESS_2=String.valueOf(STREET_ADDRESS_2).replace("null", "");
				CITY_NAME=String.valueOf(CITY_NAME).replace("null", "");
				STATE_CODE=String.valueOf(STATE_CODE).replace("null", "");
				POSTAL_CODE=String.valueOf(POSTAL_CODE).replace("null", "");
				ALIAS_NUMBER=String.valueOf(ALIAS_NUMBER).replace("null", "");
				B_CRC_ID=String.valueOf(B_CRC_ID).replace("null", "");
				ENROLLMENT_STATUS=String.valueOf(ENROLLMENT_STATUS).replace("null", "");
				CHAIN_ID=String.valueOf(CHAIN_ID).replace("null", "");
				A_LAST_UPDATE_SOURCE=String.valueOf(A_LAST_UPDATE_SOURCE).replace("null", "");
				B_LAST_UPDATE_SOURCE=String.valueOf(B_LAST_UPDATE_SOURCE).replace("null", "");
				C_LAST_UPDATE_SOURCE=String.valueOf(C_LAST_UPDATE_SOURCE).replace("null", "");
				D_LAST_UPDATE_SOURCE=String.valueOf(D_LAST_UPDATE_SOURCE).replace("null", "");
				A_LAST_UPDATE_DT=String.valueOf(A_LAST_UPDATE_DT).replace("null", "");
				B_LAST_UPDATE_DT=String.valueOf(B_LAST_UPDATE_DT).replace("null", "");
				D_LAST_UPDATE_DT=String.valueOf(D_LAST_UPDATE_DT).replace("null", "");
				
				if(cardtype.equalsIgnoreCase("Card"))
			    {
					if(!ALIAS_NUMBER.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "")))
					{
						result=result+"Card_Number not matched with DB"+"\n";
					}
			    }
				else if(cardtype.equalsIgnoreCase("CRC"))
			    {
					if(!B_CRC_ID.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "")))
					{
						result=result+"CRC Card_Number not matched with DB"+"\n";
					}
			    }
				
				if(!ENROLLMENT_STATUS.equalsIgnoreCase("E"))				
				{
					result=result+"ENROLLMENT_STATUS not changed to E in DB"+"\n";
				}
				if(!CHAIN_ID.equalsIgnoreCase(chain))				
				{
					result=result+"chainid not matched with DB"+"\n";
				}
				if(!SALUTATION.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Salutation")).replace("null", "")))
				{
					result=result+"Salutation not matched with DB"+"\n";
				}
				if(!FIRST_NAME.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("FirstName")).replace("null", "")))
				{
					result=result+"FirstName not matched with DB"+"\n";
				}
				if(!LAST_NAME.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("LastName")).replace("null", "")))
				{
					result=result+"LastName not matched with DB"+"\n";
				}
				
				String Date=String.valueOf(ReadExcel.getValue("Date")).replace("null", "");
				String Month=String.valueOf(ReadExcel.getValue("Month")).replace("null", "");
				String Year=String.valueOf(ReadExcel.getValue("Year")).replace("null", "");
				if(!BIRTH_DT.equalsIgnoreCase(Year+"-"+Month+"-"+Date))
				{
					result=result+"DOB not matched with DB"+"\n";
				}
				if(!MOBILE_PHONE.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Primary_Phone")).replace("null", "")))
				{
					result=result+"Primary_Phone not matched with DB"+"\n";
				}
				if(!EMAIL_ADDRESS.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("EmailAddress")).replace("null", "")))
				{
					result=result+"EmailAddress not matched with DB"+"\n";
				}
				if(!STREET_ADDRESS_1.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Address1")).replace("null", "")))
				{
					result=result+"STREET_ADDRESS_1 not matched with DB"+"\n";
				}
				if(!STREET_ADDRESS_2.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Address2")).replace("null", "")))
				{
					result=result+"STREET_ADDRESS_2 not matched with DB"+"\n";
				}
				if(!CITY_NAME.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("City")).replace("null", "")))
				{
					result=result+"City not matched with DB"+"\n";
				}
				if(!STATE_CODE.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("State_Code")).replace("null", "")))
				{
					result=result+"State_Code not matched with DB"+"\n";
				}
				if(!POSTAL_CODE.equalsIgnoreCase(String.valueOf(ReadExcel.getValue("Zip")).replace("null", "")))
				{
					result=result+"Zip not matched with DB"+"\n";
				}
				if(!A_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					result=result+"Last updated source in cust alias table is not changed to web"+"\n";
				}
				if(!B_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					result=result+"Last updated source in cust tablee isnot changed to web"+"\n";
				}
				if(!C_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					result=result+"Last updated source in membership table isnot changed to web"+"\n";
				}
				if(!D_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					result=result+"Last updated source in address table isnot changed to web"+"\n";
				}
				String[] A_LAST_UPDATE_DT_Split=A_LAST_UPDATE_DT.split(" ");
				String[] B_LAST_UPDATE_DT_Split=B_LAST_UPDATE_DT.split(" ");
				if(!A_LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
				{
					result=result+"Last updated date in cust alias table is not changed in DB"+"\n";
				}
				if(!B_LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
				{
					result=result+"Last updated date in cust table is not changed in DB"+"\n";
				}
				if(!D_LAST_UPDATE_DT.equalsIgnoreCase(sysdate))
				{
					result=result+"Last updated date in address table is not changed in DB"+"\n";
				}	
	        }
			/*String attrquery="select * from ODSCustomer_QA.dbo.CUST_ADDR where CRC_ID ='"+B_CRC_ID+"'";
			attr = stmt.executeQuery(attrquery);
			boolean chkpin=false;
			boolean chkpwd=false;
			boolean chkTC=false;
			boolean chkAC=false;
		//	boolean chkCITxtme=false;
			boolean chkSavewitcoup=false;
			String TxtMeOffr=String.valueOf(ReadExcel.getValue("save_coupons_ContactInfo(Y/N)")).replace("null", "");
			String TxtMeOffr1="";
			String Save_wit_coup=String.valueOf(ReadExcel.getValue("Save_With_Digital_Coupons(Y/N)")).replace("null", "");
			String Save_wit_coup1="";
			while (attr.next()) 
			{
				int ATTRIBUTE_ID=attr.getInt("ATTRIBUTE_ID");
				String ATTRIBUTE_CODE=attr.getString("ATTRIBUTE_CODE");
				String LAST_UPDATE_SOURCE = attr.getString("LAST_UPDATE_SOURCE");
				String LAST_UPDATE_DT = attr.getString("LAST_UPDATE_DT");
				
				if(Save_wit_coup.equalsIgnoreCase("Y"))
				{
					Save_wit_coup1="Opt-In";
				}
				else if(Save_wit_coup.equalsIgnoreCase("N"))
				{
					Save_wit_coup1="Opt-Out";
				}
				if(TxtMeOffr.equalsIgnoreCase("Y"))
				{
					TxtMeOffr1="Opt-In";
				}
				else if(TxtMeOffr.equalsIgnoreCase("N"))
				{
					TxtMeOffr1="Opt-Out";
				}
				if(ATTRIBUTE_ID==1105) 
				{
					chkpin=true;
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
					{
						result=result+"Last updated source in cust attribute table is not changed to web for Pin in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for pin in DB"+"\n";
					}
				}
				else if(ATTRIBUTE_ID==1106) 
				{
					chkpwd=true;
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
					{
						result=result+"Last updated source in cust attribute table is not changed to web for password in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for password in DB"+"\n";
					}
				}
				else if(ATTRIBUTE_ID==1109) 
				{
					chkAC=true;
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Loyalty.SendAuthorizationCodeToCustomer"))
					{
						result=result+"Last updated source in cust attribute table is not changed to \"Loyalty.SendAuthorizationCodeToCustomer\" for password in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for password in DB"+"\n";
					}
				}
				else if(ATTRIBUTE_ID==1501) 
				{
					chkTC=true;
					if(!ATTRIBUTE_CODE.equalsIgnoreCase("Yes"))
					{
						result=result+"Attribute code in cust attribute table is not changed to yes for Terms and conditions check in DB"+"\n";
					}
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
					{
						result=result+"Last updated source in cust attribute table is not changed to web for Terms and conditions in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for Terms and conditions in DB"+"\n";
					}
				}
				else if(ATTRIBUTE_ID==1302) 
				{
					chkSavewitcoup=true;
					if(!ATTRIBUTE_CODE.equalsIgnoreCase(Save_wit_coup1))
					{
						result=result+"Attribute code in cust attribute table is not changed for contact info text me offers in DB"+"\n";
					}
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
					{
						result=result+"Last updated source in cust attribute table is not changed to web for contact info text me offers in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for contact info text me offers in DB"+"\n";
					}
				}
				else if(ATTRIBUTE_ID.equalsIgnoreCase("1300")) 
				{
					chkCITxtme=true;
					if(!ATTRIBUTE_CODE.equalsIgnoreCase(TxtMeOffr1))
					{
						result=result+"Attribute code in cust attribute table is not changed for Security info digital coupon radio button in DB"+"\n";
					}
					if(!LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
					{
						result=result+"Last updated source in cust attribute table is not changed to web Security info digital coupon radio button in DB"+"\n";
					}
					String[] LAST_UPDATE_DT_Split=LAST_UPDATE_DT.split(" ");
					if(!LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
					{
						result=result+"Last updated date in cust attribute table is not changed for Security info digital coupon radio button in DB"+"\n";
					}
				}
			}
			if(chkpin==false)
			{
				result=result+"Attribute Id \"1105\" is not present in DB"+"\n";
			}
			if(chkpwd==false)
			{
				result=result+"Attribute Id \"1106\" is not present in DB"+"\n";
			}
			if(chkTC==false)
			{
				result=result+"Attribute Id \"1501\" is not present in DB"+"\n";
			}
			if(chkAC==false)
			{
				result=result+"Attribute Id \"1109\" is not present in DB"+"\n";
			}
			if(!String.valueOf(ReadExcel.getValue("save_coupons_ContactInfo(Y/N)")).replace("null", "").equalsIgnoreCase(""))
			{
				if(chkCITxtme==false)
				{
					result=result+"Attribute Id \"1300\" is not present in DB"+"\n";
				}
			}
			if(chkSavewitcoup==false)
			{
				result=result+"Attribute Id \"1302\" is not present in DB"+"\n";
			}*/
		} 		
	    catch(Exception e) 
		{
	    	e.printStackTrace();
		}
	    finally 
	    {  
	    	if (dt != null) try { dt.close(); } catch(Exception e) {}
	    	if (rs != null) try { rs.close(); } catch(Exception e) {}  
	    	if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	    	if (con != null) try { con.close(); } catch(Exception e) {}  
	    }
		this.result=result;
		return driver;
	}
	@Test
	public WebDriver GetDBValue(WebDriver driver,int i,int g1) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{ 
		ReadExcel readExcel=new ReadExcel();
	    try 
	    {
	    	readExcel.openExcel();
	    } 
	    catch (IOException e) 
	    {
	    	e.printStackTrace();
	    }
	    catch (NullPointerException e) 
	    {
	        
	    } 
	    new ReadExcel().excelRead("Global",g1);
	    String sheet=ReadExcel.getValue("Functionality");
	    new ReadExcel().excelRead(sheet,i);
	    String cardtype=String.valueOf(ReadExcel.getValue("Card_Type(Card/Phone/CRC)")).replace("null", "");
	    String value="";	   
		// Declare the JDBC objects.  
		Connection con = null;  
		Statement stmt = null;  
		ResultSet rs = null;
		ResultSet dt = null;
		
		//ResultSet attr=null;
		try 
		{  
			// Establish the connection.  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			con = DriverManager.getConnection("jdbc:sqlserver://msqlq01hdqww:1433;database=ODSCustomer_QA;integratedSecurity=true");			
			 if(cardtype.equalsIgnoreCase("Card"))
			 {
				 String cn=String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "");
				 value=" where ALIAS_NUMBER='"+cn+"' order by D.LAST_UPDATE_DT Desc";
			 }
			 else if(cardtype.equalsIgnoreCase("Phone")||cardtype.equalsIgnoreCase("NewMember"))
			 {
				 String mob=String.valueOf(ReadExcel.getValue("Primary_Phone")).replace("null", "");
				 value=" where MOBILE_PHONE='"+mob+"' order by D.LAST_UPDATE_DT Desc";
			 }
			 else  if(cardtype.equalsIgnoreCase("CRC"))
			 {
				 String cn=String.valueOf(ReadExcel.getValue("Phone/Card_Number")).replace("null", "");
				 value=" where B.CRC_ID='"+cn+"' order by D.LAST_UPDATE_DT Desc";
			 }
			String SQL = "select SALUTATION,FIRST_NAME,LAST_NAME,BIRTH_DT,MOBILE_PHONE,EMAIL_ADDRESS,STREET_ADDRESS_1,STREET_ADDRESS_2,CITY_NAME,STATE_CODE,POSTAL_CODE,ALIAS_NUMBER,B.CRC_ID as B_CRC_ID,ENROLLMENT_STATUS,CHAIN_ID,D.LAST_UPDATE_DT D_LAST_UPDATE_DT from ODSCustomer_QA.dbo.CUST_ALIAS A join ODSCustomer_QA.dbo.CUST B on A.MEMBER_ID = B.MEMBER_ID join ODSCustomer_QA.dbo.CUST_MEMBERSHIP C on A.MEMBER_ID = C.MEMBER_ID join ODSCustomer_QA.dbo.CUST_ADDR D on B.CRC_ID=D.CRC_ID" +value+";";	
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(SQL);  
			
			if (rs.next()) 
			{
				String SALUTATION = rs.getString("SALUTATION");
				String FIRST_NAME = rs.getString("FIRST_NAME");
				String LAST_NAME = rs.getString("LAST_NAME");
				String BIRTH_DT = rs.getString("BIRTH_DT");
				String MOBILE_PHONE = rs.getString("MOBILE_PHONE");				
				String EMAIL_ADDRESS = rs.getString("EMAIL_ADDRESS");
				String STREET_ADDRESS_1 = rs.getString("STREET_ADDRESS_1");
				String STREET_ADDRESS_2 = rs.getString("STREET_ADDRESS_2");
				String CITY_NAME = rs.getString("CITY_NAME");
				String STATE_CODE = rs.getString("STATE_CODE");
				String POSTAL_CODE = rs.getString("POSTAL_CODE");
				String ALIAS_NUMBER = rs.getString("ALIAS_NUMBER");
				String B_CRC_ID = rs.getString("B_CRC_ID");
				String ENROLLMENT_STATUS = rs.getString("ENROLLMENT_STATUS");
				String CHAIN_ID = rs.getString("CHAIN_ID");
				String D_LAST_UPDATE_DT = rs.getString("D_LAST_UPDATE_DT");
					
				SALUTATION=String.valueOf(SALUTATION).replace("null", "");
				FIRST_NAME=String.valueOf(FIRST_NAME).replace("null", "");
				LAST_NAME =String.valueOf(LAST_NAME).replace("null", "");
				BIRTH_DT=String.valueOf(BIRTH_DT).replace("null", "");
				MOBILE_PHONE=String.valueOf(MOBILE_PHONE).replace("null", "");
				EMAIL_ADDRESS=String.valueOf(EMAIL_ADDRESS).replace("null", "");
				STREET_ADDRESS_1=String.valueOf(STREET_ADDRESS_1).replace("null", "");
				STREET_ADDRESS_2=String.valueOf(STREET_ADDRESS_2).replace("null", "");
				CITY_NAME=String.valueOf(CITY_NAME).replace("null", "");
				STATE_CODE=String.valueOf(STATE_CODE).replace("null", "");
				POSTAL_CODE=String.valueOf(POSTAL_CODE).replace("null", "");
				ALIAS_NUMBER=String.valueOf(ALIAS_NUMBER).replace("null", "");
				B_CRC_ID=String.valueOf(B_CRC_ID).replace("null", "");
				ENROLLMENT_STATUS=String.valueOf(ENROLLMENT_STATUS).replace("null", "");
				CHAIN_ID=String.valueOf(CHAIN_ID).replace("null", "");
				D_LAST_UPDATE_DT=String.valueOf(D_LAST_UPDATE_DT).replace("null", "");
				
				
				System.out.println(FIRST_NAME);
				System.out.println(LAST_NAME);
				System.out.println("rsg");
				System.out.println(D_LAST_UPDATE_DT);
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{  
			if (dt != null) try { dt.close(); } catch(Exception e) {}
			if (rs != null) try { rs.close(); } catch(Exception e) {}  
			if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
			if (con != null) try { con.close(); } catch(Exception e) {}  
		}
			
		return driver;		
	}
	public String getresult() 
	{
		return result;
	}
}  	