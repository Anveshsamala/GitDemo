package testNGBasics;

import org.testng.annotations.Test;

public class GoldLoan {
	@Test
	public static void goldChainLoan() {
		System.out.println("Gold Chain Loan");
	}
//client want to execute some TC's for every deployment then we can use groups concept here
	@Test(groups = {"Smoke"})
	public static void goldNeclaceLoan() {
		System.out.println("Gold Neclace Loan");
	}

	@Test
	public static void goldRingLoan() {
		System.out.println("Gold Chain Loan");
	}
}
