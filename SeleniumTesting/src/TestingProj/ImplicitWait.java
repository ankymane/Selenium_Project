package TestingProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");



		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("Bhavnachawda")).sendKeys("selenium");

		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("Ankita");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ankita12345");
		//driver.findElement(By.xpath("Bhavnachawda")).sendKeys("selenium");
driver.close();


	}

}
