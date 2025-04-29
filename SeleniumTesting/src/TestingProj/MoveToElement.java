package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();

		   String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		   driver.get(url);

		   WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
		   WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));

		   Actions actions = new Actions(driver);

		   actions.moveToElement(titleA);
		   actions.clickAndHold();

		   actions.moveToElement(titleC);
		   actions.release().perform();
		  }
	}

