package TestingProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

//import dev.failsafe.internal.util.Assert;

public class GoogleTitle
{
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://mystore.com/");
	}

	@Test
	public void GoogleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "MyStore, My Store","Title is not match");
	}

	@Test
	public void GoogleLogoTest()
	{

		boolean b=driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/a/picture/img")).isDisplayed();
		Assert.assertTrue(b);


	}

	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
