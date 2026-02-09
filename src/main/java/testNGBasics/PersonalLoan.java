package testNGBasics;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test
	public static void personalHomeLoan() {
		System.out.println("Personal Home Loan");
	}

	@Test(groups = {"Smoke"})
	public static void personalCarLoan() {
		System.out.println("Personal Car Loan");
	}

	@Test
	public static void personalGoldLoan() {
		System.out.println("Personal Gold Loan");
	}
}
