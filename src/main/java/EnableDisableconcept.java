import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableDisableconcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id'] div[class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")).getDomAttribute("style"));

		
		if(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id'] div[class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")).getDomAttribute("style").contains("opacity: 1;")) {
			System.out.println("is Enable");
			Assert.assertTrue(true);
			
			}
		else {
			Assert.assertTrue(false);
		}
		
	}

}
