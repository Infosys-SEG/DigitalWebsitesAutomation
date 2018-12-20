package computedClass;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Utility.ReadExcel;
import Utility.Readexcel_RowName;

public class Computed_DB 
{
	
	
	public void DB_CheckEnrolledDetails(String Functionality, String TCName) throws FileNotFoundException, IOException, InterruptedException, AWTException 
	{ 	
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
	    String chain="";
	    if(Readexcel_RowName.getValue("Winndixie(Y/N)").equalsIgnoreCase("Y"))
		{
			 chain="' and CHAIN_ID = 1";
		}
		else if(Readexcel_RowName.getValue("Bilo(Y/N)").equalsIgnoreCase("Y"))
		{
			chain="' and CHAIN_ID <> 1";
		}
		else if(Readexcel_RowName.getValue("Harveys(Y/N)").equalsIgnoreCase("Y"))
		{
			chain="' and CHAIN_ID <> 1";
		}
	    		
	   
	    new Readexcel_RowName().excelRead("Global_TestData_Sheet", Functionality, TCName);
	    String cardtype=String.valueOf(Readexcel_RowName.getValue("Card_Type(Card/Phone/CRC)")).replace("null", "");
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
			con = DriverManager.getConnection("jdbc:sqlserver://sqlclq01w-ag1l:1433;database=ODSCustomer_QA;integratedSecurity=true");			
			String dtval="SELECT CONVERT (date, SYSDATETIME())";
			stmt = con.createStatement();  
			dt=stmt.executeQuery(dtval);
			while (dt.next()) 
			{
				sysdate = dt.getString(1);
			}
			if(cardtype.equalsIgnoreCase("Card"))
			{
				String cn=String.valueOf(Readexcel_RowName.getValue("Phone/Card_Number")).replace("null", "");
				String mail=String.valueOf(Readexcel_RowName.getValue("EmailAddress")).replace("null", "");
				value=" where ALIAS_NUMBER='"+cn+chain+" and EMAIL_ADDRESS='"+mail+"'";
				
			}
			else if(cardtype.equalsIgnoreCase("Phone"))
			{
				String mob=String.valueOf(Readexcel_RowName.getValue("Primary_Phone")).replace("null", "");
				String mail=String.valueOf(Readexcel_RowName.getValue("EmailAddress")).replace("null", "");
				value=" where MOBILE_PHONE='"+mob+chain+" and EMAIL_ADDRESS='"+mail+"'";
			
			}
			else  if(cardtype.equalsIgnoreCase("CRC"))
			{
				String cn=String.valueOf(Readexcel_RowName.getValue("Phone/Card_Number")).replace("null", "");
				String mail=String.valueOf(Readexcel_RowName.getValue("EmailAddress")).replace("null", "");
				value=" where B.CRC_ID='"+cn+chain+" and EMAIL_ADDRESS='"+mail+"'";
			}
			String colnames = "SALUTATION, FIRST_NAME, LAST_NAME, BIRTH_DT, MOBILE_PHONE, EMAIL_ADDRESS, STREET_ADDRESS_1, STREET_ADDRESS_2, CITY_NAME, STATE_CODE, POSTAL_CODE, ALIAS_NUMBER, B.CRC_ID as B_CRC_ID, ENROLLMENT_STATUS, A.LAST_UPDATE_SOURCE as A_LAST_UPDATE_SOURCE, B.LAST_UPDATE_SOURCE as B_LAST_UPDATE_SOURCE, C.LAST_UPDATE_SOURCE as C_LAST_UPDATE_SOURCE, D.LAST_UPDATE_SOURCE as D_LAST_UPDATE_SOURCE, A.LAST_UPDATE_DT as A_LAST_UPDATE_DT, B.LAST_UPDATE_DT as B_LAST_UPDATE_DT, D.LAST_UPDATE_DT as D_LAST_UPDATE_DT";
				
			String SQL = "select "+colnames+" from ODSCustomer_QA.dbo.CUST_ALIAS as A join ODSCustomer_QA.dbo.CUST as B on A.MEMBER_ID = B.MEMBER_ID join ODSCustomer_QA.dbo.CUST_MEMBERSHIP as C on A.MEMBER_ID = C.MEMBER_ID join ODSCustomer_QA.dbo.CUST_ADDR as D on B.CRC_ID=D.CRC_ID" +value;	
			
			rs = stmt.executeQuery(SQL); 
			Reporter.log("Query Executed Successfully");
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
			    B_CRC_ID = rs.getString("B_CRC_ID");
				String ENROLLMENT_STATUS = rs.getString("ENROLLMENT_STATUS");
				
				String A_LAST_UPDATE_SOURCE = rs.getString("A_LAST_UPDATE_SOURCE");
				String B_LAST_UPDATE_SOURCE = rs.getString("B_LAST_UPDATE_SOURCE");
				String C_LAST_UPDATE_SOURCE = rs.getString("C_LAST_UPDATE_SOURCE");
				String D_LAST_UPDATE_SOURCE = rs.getString("D_LAST_UPDATE_SOURCE");
				String A_LAST_UPDATE_DT = rs.getString("A_LAST_UPDATE_DT");
				String B_LAST_UPDATE_DT = rs.getString("B_LAST_UPDATE_DT");
				String D_LAST_UPDATE_DT= rs.getString("D_LAST_UPDATE_DT");
				
				SALUTATION = (String.valueOf(SALUTATION).replace("null", "")).trim();
				FIRST_NAME = (String.valueOf(FIRST_NAME).replace("null", "")).trim();
				LAST_NAME = (String.valueOf(LAST_NAME).replace("null", "")).trim();
				BIRTH_DT = (String.valueOf(BIRTH_DT).replace("null", "")).trim();
				MOBILE_PHONE = (String.valueOf(MOBILE_PHONE).replace("null", "")).trim();
				EMAIL_ADDRESS = (String.valueOf(EMAIL_ADDRESS).replace("null", "")).trim();
				STREET_ADDRESS_1 = (String.valueOf(STREET_ADDRESS_1).replace("null", "")).trim();
				STREET_ADDRESS_2 = (String.valueOf(STREET_ADDRESS_2).replace("null", "")).trim();
				CITY_NAME = (String.valueOf(CITY_NAME).replace("null", "")).trim();
				STATE_CODE = (String.valueOf(STATE_CODE).replace("null", "")).trim();
				POSTAL_CODE = (String.valueOf(POSTAL_CODE).replace("null", "")).trim();
				ALIAS_NUMBER = (String.valueOf(ALIAS_NUMBER).replace("null", "")).trim();
				B_CRC_ID = (String.valueOf(B_CRC_ID).replace("null", "")).trim();
				ENROLLMENT_STATUS= (String.valueOf(ENROLLMENT_STATUS).replace("null", "")).trim();
				
				A_LAST_UPDATE_SOURCE=(String.valueOf(A_LAST_UPDATE_SOURCE).replace("null", "")).trim();
				B_LAST_UPDATE_SOURCE=(String.valueOf(B_LAST_UPDATE_SOURCE).replace("null", "")).trim();
				C_LAST_UPDATE_SOURCE=(String.valueOf(C_LAST_UPDATE_SOURCE).replace("null", "")).trim();
				D_LAST_UPDATE_SOURCE=(String.valueOf(D_LAST_UPDATE_SOURCE).replace("null", "")).trim();
				A_LAST_UPDATE_DT=(String.valueOf(A_LAST_UPDATE_DT).replace("null", "")).trim();
				B_LAST_UPDATE_DT=(String.valueOf(B_LAST_UPDATE_DT).replace("null", "")).trim();
				D_LAST_UPDATE_DT=(String.valueOf(D_LAST_UPDATE_DT).replace("null", "")).trim();
				
				if(cardtype.equalsIgnoreCase("Card"))
			    {
					if(!ALIAS_NUMBER.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Phone/Card_Number")).replace("null", "")))
					{
						
						Assert.fail("Card_Number not matched with DB");
					}
					else
					{
						Reporter.log("Card_Number matched with DB");
					}
					
			    }
				else if(cardtype.equalsIgnoreCase("CRC"))
			    {
					if(!B_CRC_ID.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Phone/Card_Number")).replace("null", "")))
					{
						
						Assert.fail("CRC Card_Number not matched with DB");
					}
					else
					{
						Reporter.log("CRC Card_Number matched with DB");
					}
			    }
				
				if(!ENROLLMENT_STATUS.equalsIgnoreCase("E"))				
				{
				
					Assert.fail("ENROLLMENT_STATUS not changed to E in DB");
				}
				else
				{
					Reporter.log("ENROLLMENT_STATUS changed to E in DB");
				}
				
				if(!SALUTATION.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Salutation")).replace("null", "")))
				{
					
					Assert.fail("Salutation not matched with DB");
				}
				else
				{
					Reporter.log("Salutation not matched with DB");
				}
				if(!FIRST_NAME.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("FirstName")).replace("null", "")))
				{
					
					Assert.fail("FirstName not matched with DB");
				}
				else
				{
					Reporter.log("FirstName matched with DB");
				}
				if(!LAST_NAME.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("LastName")).replace("null", "")))
				{
					
					Assert.fail("LastName not matched with DB");
				}
				else
				{
					Reporter.log("LastName matched with DB");
				}
				String Date=String.valueOf(Readexcel_RowName.getValue("Date")).replace("null", "");
				String Month=String.valueOf(Readexcel_RowName.getValue("Month")).replace("null", "");
				String Year=String.valueOf(Readexcel_RowName.getValue("Year")).replace("null", "");
				if(!BIRTH_DT.equalsIgnoreCase(Year+"-"+Month+"-"+Date))
				{
					
					Assert.fail("DOB not matched with DB");
				}
				else
				{
					Reporter.log("DOB matched with DB");
				}
				if(!MOBILE_PHONE.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Primary_Phone")).replace("null", "")))
				{
				
					Assert.fail("Primary_Phone not matched with DB");
				}
				else
				{
					Reporter.log("Primary_Phone matched with DB");
				}
				if(!EMAIL_ADDRESS.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("EmailAddress")).replace("null", "")))
				{
					
					Assert.fail("EmailAddress not matched with DB");
				}
				else
				{
					Reporter.log("EmailAddress matched with DB");
				}
				if(!STREET_ADDRESS_1.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Address1")).replace("null", "")))
				{
					
					Assert.fail("STREET_ADDRESS_1 not matched with DB");
				}
				else
				{
					Reporter.log("STREET_ADDRESS_1 matched with DB");
				}
				if(!STREET_ADDRESS_2.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Address2")).replace("null", "")))
				{
					
					Assert.fail("STREET_ADDRESS_2 not matched with DB");
				}
				else
				{
					Reporter.log("STREET_ADDRESS_2 matched with DB");
				}
				if(!CITY_NAME.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("City")).replace("null", "")))
				{
				
					Assert.fail("City not matched with DB");
				}
				else
				{
					Reporter.log("City matched with DB");
				}
				if(!STATE_CODE.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("State_Code")).replace("null", "")))
				{
					
					Assert.fail("State_Code not matched with DB");
				}
				else
				{
					Reporter.log("State_Code matched with DB");
				}
				if(!POSTAL_CODE.equalsIgnoreCase(String.valueOf(Readexcel_RowName.getValue("Zip")).replace("null", "")))
				{
					
					Assert.fail("Zip not matched with DB");
				}
				else
				{
					Reporter.log("Zip matched with DB");
				}
				if(!A_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					
					Assert.fail("Last updated source in cust alias table is not changed to web");
				}
				else
				{
					Reporter.log("Last updated source in cust alias table is changed to web");
				}
				if(!B_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
					
					Assert.fail("Last updated source in cust table is not changed to web");
				}
				else
				{
					Reporter.log("Last updated source in cust table is changed to web");
				}
				if(!C_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{
				
					Assert.fail("Last updated source in membership table is not changed to web");
				}
				else
				{
					Reporter.log("Last updated source in membership table is changed to web");
				}
				if(!D_LAST_UPDATE_SOURCE.equalsIgnoreCase("Web"))
				{	
					Assert.fail("Last updated source in address table is not changed to web");
				}
				else
				{
					Reporter.log("Last updated source in address table is changed to web");
				}
				String[] A_LAST_UPDATE_DT_Split=A_LAST_UPDATE_DT.split(" ");
				String[] B_LAST_UPDATE_DT_Split=B_LAST_UPDATE_DT.split(" ");
				String[] D_LAST_UPDATE_DT_Split=D_LAST_UPDATE_DT.split(" ");
				if(!A_LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
				{
					
					Assert.fail("Last updated date in cust alias table is not changed in DB");
				}
				else
				{
					Reporter.log("Last updated date in cust alias table is changed in DB");
				}
				if(!B_LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
				{
					
					Assert.fail("Last updated date in cust table is not changed in DB");
				}
				else
				{
					Reporter.log("Last updated date in cust table is changed in DB");
				}
				if(!D_LAST_UPDATE_DT_Split[0].equalsIgnoreCase(sysdate))
				{
					
					Assert.fail("Last updated date in address table is not changed in DB");
				}
				else
				{
					Reporter.log("Last updated date in address table is changed in DB");
				}
	        }
			
		} 		
	    catch(Exception e) 
		{
	    	
		}
	    finally 
	    {  
	    	if (dt != null) try { dt.close(); } catch(Exception e) {}
	    	if (rs != null) try { rs.close(); } catch(Exception e) {}  
	    	if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	    	if (con != null) try { con.close(); } catch(Exception e) {}  
	    }
		
		
	}
	
	public WebDriver DB_GetValue(WebDriver driver, String cardnumber) throws FileNotFoundException, IOException, InterruptedException, AWTException 
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
	    
	   // new ReadExcel().excelRead(sheet,i);
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
			 else if(cardtype.equalsIgnoreCase("Phone"))
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
	
}  	