package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crickbuzz {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximise the browser
		driver.get("https://www.cricbuzz.com/cricket-series/10289/big-bash-league-2025-26/points-table");
//		List<WebElement> teamlist = driver
//				.findElements(By.xpath("//div[contains(@class,'point-table-grid')]"));
//		for (WebElement eachteam : teamlist) {
//			String teamname=eachteam.findElement(By.xpath("//div[@class='text-xs']")).getText();
//			//eachteam.findElement((By.xpath("//div[@class='flex justify-center items-center'][5]")).
//			System.out.println(teamname);
//			
//			
//			
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> rows = driver.findElements(
		        By.xpath("//div[contains(@class,'cb-pointstable')]/div"));

		for (WebElement row : rows) {
		    String teamName = row.findElement(By.xpath("./div[1]")).getText(); // 1st col
		    String played = row.findElement(By.xpath("./div[2]")).getText();   // 2nd col

		    System.out.println(teamName + " -> P: " + played);
		}
		driver.close();
	}
}
