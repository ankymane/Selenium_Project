package TestingProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form2 {

	public static void main(String[] args) throws Exception
	{
		RadioButton();
		CheckBox();
	}
	public static void RadioButton() throws Exception
	{
		 WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    String URL = "https://selenium08.blogspot.com/2019/08/radio-buttons.html";
		    driver.get(URL); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    WebElement yellow = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[4]"));

		    yellow.click();
		    System.out.println("Radio button Yellow is successfully selected.");

		    WebElement red = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));

		    red.click();
		    System.out.println("Radio Button Red is successfully Selected");

		    WebElement dhanbad = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[7]"));
		    dhanbad.click();
		   Thread.sleep(3000);
		    System.out.println("Radio button Dhanbad is successfully selected.");
		    driver.close();

		  }
	public static void CheckBox() throws Exception
	{
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();

		    String URL = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
		    driver.get(URL);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    WebElement red = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		    red.click();
		    System.out.println("Red Checkbox is selected");

		    WebElement blue = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[3]"));
		    blue.click();
		    System.out.println("Blue Checkbox is selected");

		    WebElement orange = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[4]"));
		    orange.click();
		    System.out.println("Orange Checkbox is selected");
			   Thread.sleep(3000);

		    driver.close();

	}
	}

