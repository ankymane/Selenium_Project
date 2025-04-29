package TestingProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	WebDriver driver;
	@BeforeMethod
	public void SetUp()//1//4//7
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://mystore.com/");
	}

	@Test(priority=1)
	public void GoogleTitleTest()//2
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=3)
	public void GoogleLogoTest()//5
	{
		boolean b=driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/a/picture/img")).isDisplayed();
	}

	@Test(priority=2)
	public void MyCartLink()//8
	{
		//boolean b=driver.findElement(By.linkText("My Cart")).isDisplayed();
		boolean b=driver.findElement(By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/ul/li[3]/span/span[1]")).isDisplayed();

	}

	@AfterMethod//3//6//9
	public void TearDown()
	{
		driver.quit();
	}
}
