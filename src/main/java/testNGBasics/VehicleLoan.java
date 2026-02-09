package testNGBasics;

import org.testng.annotations.Test;

public class VehicleLoan {
	@Test
	public static void vehicleCarLoan() {
		System.out.println("Vehicle Car Loan");
	}

	@Test(groups = {"Smoke"})
	public static void vehicleBusLoan() {
		System.out.println("Vehicle Bus Loan");
	}

	@Test
	public static void vehicleBikeLoan() {
		System.out.println("Vehicle Bike Loan");
	}

}
