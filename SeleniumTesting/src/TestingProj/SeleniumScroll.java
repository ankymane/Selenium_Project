package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScroll {

	public static void main(String[] args) throws Exception
	{
		Method1();
	}
		public static void Method1() throws Exception
		{

			System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://theimperative.in/");

		Thread.sleep(3000);

		JavascriptExecutor js= (JavascriptExecutor) driver;


		//js.executeScript("window.scrollBy(0,2000)", " ");


		WebElement wd=driver.findElement(By.xpath("//a[@id='btn-1621426287800']"));
		js.executeScript("arguments[0].scrollIntoView();", wd);
		System.out.println(wd.getText());


	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
