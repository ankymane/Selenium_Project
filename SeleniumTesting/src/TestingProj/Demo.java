package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args) throws Exception
	{
	google();
	Linkedin();
	}

	public static void google() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.google.com/");
		        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Automation Testing");
		        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

		    Thread.sleep(3000);
		      driver.quit();
		    }

	public static void Linkedin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


		        WebDriver driver = new ChromeDriver();
		        driver.get("https://in.linkedin.com/");
		        driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		        driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[1]/input")).sendKeys("ankita.mane@theimperative.in");
		        driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[2]/input")).sendKeys("Imperative");
		        driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();

		    Thread.sleep(2000);
		      driver.quit();
		      System.out.println("Test run Successfully");
		    }
}





