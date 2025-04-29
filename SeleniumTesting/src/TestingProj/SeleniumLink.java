package TestingProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLink {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://theimperative.in/");


		// No of Links
		List <WebElement> s1= driver.findElements(By.tagName("a"));
		System.out.println("No of Links" +s1.size());

		for (WebElement element : s1) {
			System.out.println(element.getText());

		}

	}

}
