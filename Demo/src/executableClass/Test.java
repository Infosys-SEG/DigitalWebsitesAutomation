package executableClass;

import java.io.IOException;

import Utility.Writeexcel_RowName;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Writeexcel_RowName rn = new Writeexcel_RowName();
		rn.excelwrite("Fully_Enrolled_Customers_Flow", "TC003_EnrollNewProgram_Phonenumber_VerifybyPII", "Change_Phone_Number", "5035019925");
	}

}
