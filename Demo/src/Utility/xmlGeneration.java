package Utility;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Node;

public class xmlGeneration 
{
	public static void main(String args[]) throws ParserConfigurationException, TransformerException, IOException 
	{
	//	System.out.println(Type);
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
	  
	    Data obj=new Data();
	    int func=obj.rownum("Global");
	    for (int j =1;j<func;j++)
	    {
	    	new ReadExcel().excelRead("Global",j);		
			
			String Functionality = ReadExcel.getValue("Functionality");
	   
	    	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
	    	Document doc = docBuilder.newDocument();
	    	Node rootElement = (Node) doc.createElement("suite");
	    	doc.appendChild((Node) rootElement);

	    	Attr Suite_Name = doc.createAttribute("name");
	    	Suite_Name.setValue("SEG Roadrunner");
	    	((org.w3c.dom.Element) rootElement).setAttributeNode(Suite_Name);
		
	    	new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global", Functionality);
				
	    	String Chrome= Readexcel_RowName.getValue("Chrome(Y/N)");
	    	String IE= Readexcel_RowName.getValue("IE(Y/N)");
	    	String Winndixie= Readexcel_RowName.getValue("Winndixie(Y/N)");
	    	String Bilo= Readexcel_RowName.getValue("Bilo(Y/N)");
	    	String Harveys= Readexcel_RowName.getValue("Harveys(Y/N)");
	    	String BrowserType = null;
		
	    	String Banner = null;
	    	if(Chrome.equalsIgnoreCase("y")&&IE.equalsIgnoreCase("n"))
	    	{
	    		BrowserType="Chrome";	
	    	}
	    	else if(IE.equalsIgnoreCase("y")&&Chrome.equalsIgnoreCase("n"))
	    	{
				BrowserType="IE";	
			}	
			if(Winndixie.equalsIgnoreCase("y"))
			{
				Banner = "Winndixie";
				
			}
			else if(Bilo.equalsIgnoreCase("y"))
			{
				Banner = "Bilo";
				
			}
			else if(Harveys.equalsIgnoreCase("y"))
			{
				Banner = "Harveys";	
			}
			int s=obj.rownum(Functionality);
			new Readexcel_RowName().excelRead("Global_TestData_Sheet","Global",Functionality);		
			String TestSet_Name = Readexcel_RowName.getValue("TestSet_Name");
					
			String Brw = BrowserType;
			String conc = Functionality + "__" + Brw;
			
			Node test = (Node) doc.createElement("test");
			((Node) rootElement).appendChild((Node) test);
							
			Attr attr = doc.createAttribute("name");
			attr.setValue(conc);
			((org.w3c.dom.Element) test).setAttributeNode(attr);
								
			Node Parameter = (Node) doc.createElement("parameter");
			((Node) test).appendChild((Node) Parameter);
			Attr browserSetName = doc.createAttribute("name");
			browserSetName.setValue("BrowserType");
			((org.w3c.dom.Element) Parameter).setAttributeNode(browserSetName);
			Attr browserval = doc.createAttribute("value");
			browserval.setValue(BrowserType);
			((org.w3c.dom.Element) Parameter).setAttributeNode(browserval);

			Node Parameter2 = (Node) doc.createElement("parameter");
			((Node) test).appendChild((Node) Parameter2);
			Attr MarketSetName = doc.createAttribute("name");
			MarketSetName.setValue("Banner");		
			((org.w3c.dom.Element) Parameter2).setAttributeNode(MarketSetName);
			Attr Marketval = doc.createAttribute("value");
			Marketval.setValue(Banner);
			((org.w3c.dom.Element) Parameter2).setAttributeNode(Marketval);
						
			Node Classes = (Node) doc.createElement("classes");
			((Node) test).appendChild((Node) Classes);
			
							
			Node Class = (Node) doc.createElement("class");
			((Node) Classes).appendChild((Node) Class);
			
			Attr Classname_val = doc.createAttribute("name");
			Classname_val.setValue(TestSet_Name);
			((org.w3c.dom.Element) Class).setAttributeNode(Classname_val);
			
			Node methods = (Node) doc.createElement("methods");
			((Node) Class).appendChild((Node) methods);
					
				
			for (int i = 1; i < s; i++) 
			{
				
				// adding method name methods include
				
				
				
				Node include = (Node) doc.createElement("include");
				((Node) methods).appendChild((Node) include);
				
				new ReadExcel().excelRead(Functionality,i);		
					
				String Testcase_Name = ReadExcel.getValue("Testcase_Name");
				
				Attr method_val = doc.createAttribute("name");
				method_val.setValue(Testcase_Name);
				((org.w3c.dom.Element) include).setAttributeNode(method_val);
					              
				
				
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty(OutputKeys.METHOD, "xml");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
				DOMImplementation domImpl = doc.getImplementation();
				DocumentType doctype = domImpl.createDocumentType("doctype", "SYSTEM",
	                                                                                            "http://testng.org/testng-1.0.dtd");
				transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, doctype.getPublicId());
				transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(
				System.getProperty("user.dir")+"\\Run\\"+Functionality+".xml"));
				transformer.transform(source, result);           
			}
	    }
	}
}



