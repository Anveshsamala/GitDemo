package testNGBasics;

import org.testng.annotations.*;

public class AnnotationsConcept {
	@BeforeSuite
	public void day1() {
		System.out.println("day one Before Suite");
	}

	@BeforeTest
	public void day2() {
		System.out.println("day two Before Test");
	}

	@BeforeClass
	public void day3() {
		System.out.println("day three Before Class");
	}

	@BeforeMethod
	public void day4() {
		System.out.println("day four Before Method");
	}

	@Test
	public void day5() {
		System.out.println("day five Test");
	}

	@AfterMethod
	public void day6() {
		System.out.println("day six After Method");
	}

	@AfterClass
	public void day7() {
		System.out.println("day seven After Class");
	}

	@AfterTest
	public void day8() {
		System.out.println("day eight After Test");
	}

	@AfterSuite
	public void day9() {
		System.out.println("day nine After Suite");
	}
}
