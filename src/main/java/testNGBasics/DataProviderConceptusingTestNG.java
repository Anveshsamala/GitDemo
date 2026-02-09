package testNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConceptusingTestNG {
	@Test(dataProvider = "getData")
	public void loginFun(String username, String password) {
		System.out.println("Login functionality with multiple sets of data using TestNG dataProvider concept");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][2];
		// 1st set of data
		obj[0][0] = "validUsername";
		obj[0][1] = "validPassword";

		// 2nd set of data
		obj[1][0] = "InvalidUsername";
		obj[1][1] = "InvalidPassword";

		// 3rd set of data
		obj[2][0] = "partialUsername";
		obj[2][1] = "partialPassword";
		return obj;
	}

}
