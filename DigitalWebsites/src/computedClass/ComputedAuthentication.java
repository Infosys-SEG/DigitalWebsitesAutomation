package computedClass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class ComputedAuthentication 
{
	public void loginAuthentication() throws AWTException, InterruptedException
	{
		Robot rb = new Robot();
	    /*rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	     //wait	
	    rb.keyPress(KeyEvent.VK_SHIFT);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_SHIFT);*/
	    
	    StringSelection un = new StringSelection("pdnAccess");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(un, null);         
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(3000); 
	    StringSelection password = new StringSelection("greasemonkey");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(password, null);         
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);    
	 }  
}
