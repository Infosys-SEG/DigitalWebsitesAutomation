package executableClass;

import java.awt.AWTException;
import java.io.IOException;

import computedClass.Computed_DB;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		Computed_DB db= new Computed_DB();
		
		db.DB_CheckEnrolledDetails("Fully_Enrolled_Customers_Flow", "TC003_EnrollNewProgram_Phonenumber_VerifybyPII");
		System.out.println("Done");
	}
	

}
