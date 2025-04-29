package TestingProj;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception
	{
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();

		    String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";
		    driver.get(URL);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));

		    Select select = new Select(dropdown);

		    if(select.isMultiple())
		    {
		        System.out.println("Multiple choices are allowed, Select multiple options in the list ");
		    }
		    else {
		        System.out.println("Multiple choices are not allowed");
		    }
		    select.selectByVisibleText("May");

		    select.selectByValue("Ap");

		    select.selectByIndex(10);

		    select.deselectByVisibleText("May");
		    System.out.println("Option May is deselected successfully");
		   Thread.sleep(3000);
		    driver.close();
		  }
	}


