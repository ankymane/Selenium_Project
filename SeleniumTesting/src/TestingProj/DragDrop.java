package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(draggable)
				     .moveToElement(droppable)
				     .release(droppable)
		        	     .build();

		dragAndDrop.perform();

	}

}
