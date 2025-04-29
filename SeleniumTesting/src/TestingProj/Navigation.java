package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");

		Thread.sleep(4000);

		WebElement artOfTestingLogo = driver.findElement(By.xpath("//header/div[1]/div[1]/p[1]/a[1]"));
		artOfTestingLogo.click();

		driver.navigate().back();

		Thread.sleep(4000);

		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
