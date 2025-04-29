package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClick
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://in.linkedin.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='linkedin-logo']")).click();
        Thread.sleep(3000);

        driver.close();


	}

}
