package TestingProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args)
	{

		Seleniumwait();

	}

	public static void Seleniumwait()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

	      driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation Testing");
	      driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();

	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")));

	      driver.quit();

	}

}
