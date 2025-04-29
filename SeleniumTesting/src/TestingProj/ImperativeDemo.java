package TestingProj;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import dev.failsafe.internal.util.Assert;


public class ImperativeDemo
{

	public static void main(String[] args) throws Exception
	{
		join();

	}

	public static void join() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


		        WebDriver driver = new ChromeDriver();
		        driver.get("https://theimperative.in/");
		        Thread.sleep(2000);
		       driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[11]/a[1]")).click();
		        Thread.sleep(2000);

			      driver.findElement(By.xpath("//input[@id='form1_name']")).sendKeys("Ankita Mane");
			      driver.findElement(By.xpath("//input[@id='form1_email']")).sendKeys("ankita.mane@theimperative.in");
			      driver.findElement(By.xpath("//input[@id='form1_mobile-no']")).sendKeys("123456");
			      driver.findElement(By.xpath("//select[@id='form1_position-applied-for']")).sendKeys("Flutter Developer");
			     // Thread.sleep(3000);

			      // driver.findElement(By.xpath("//span[contains(text(),'Browse')]")).click();
			       File uploadFile = new File("D:\\Ankita\\Test Cases\\STLC Process.txt");

				    WebElement fileInput = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/main/div/div[2]/div/section[2]/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div/form/div[1]/div[2]/div[5]"));
				    fileInput.sendKeys(uploadFile.getAbsolutePath());
				    driver.findElement(By.xpath("//span[contains(text(),'Browse')]")).click();


				    //driver.findElement(By.id("file-submit")).click();

				    WebElement fileName = driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/main[1]/div[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]"));
				    Assert.assertEquals("STLC Process.txt", fileName.getText());




		    //  driver.quit();
		    }



}
