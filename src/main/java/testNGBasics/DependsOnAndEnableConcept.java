package testNGBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DependsOnAndEnableConcept {
	// Here team A depends on Team E and F so once Team E and F executes then only
	// Team A executed
	@Test(dependsOnMethods = { "teamF", "teamE" })
	public static void teamA() {
		System.out.println("Team A");
	}

	// This test case taking more time so i can use timeOut attribute in TestNg
	@Test(timeOut = 4000)
	public static void teamB() {
		System.out.println("Team B");
	}

	// I have a known issue in this method so i want skip this method then i can use
	// enabled=false
	@Test(enabled = false)
	public static void teamC() {
		System.out.println("Team C");
	}

	@Test
	public static void teamD() {
		System.out.println("Team D");
	}

	@Parameters({ "URL", "APIKey/userID" })
	@Test
	public static void teamE(String youareel, String apikeY) {
		System.out.println("Team E");
		System.out.println(youareel);
		System.out.println(apikeY);
	}

	@Test
	public static void teamF() {
		System.out.println("Team F");
	}
}
