package TestingProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		    String URL = "https://www.google.com";
		    driver.get(URL);

		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		    String expectedTitle = "Google";

		    String actualTitle = driver.getTitle();

		    if(expectedTitle.equals(actualTitle))
		    {
		       System.out.println("Verification Successful – Correct title is displayed on the home webpage.");
		    }
		    else
		    {
		       System.out.println("Verification Failed: Incorrect title is displayed on the home webpage");
		    }

		    WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

		    if(searchBox.isEnabled())
		    {
		       System.out.println("Search box is enabled. Return: " +searchBox.isEnabled());
		    }
		    else
		    {
		       System.out.println("Search box is disabled. Return: " +searchBox.isEnabled());
		    }
		    WebElement sendText = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		    sendText.sendKeys("Selenium Tool");
		    Thread.sleep(2000);

		    WebElement searchButton = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
		    if(searchButton.isEnabled()) {
		         System.out.println("Search button is enabled. Return:" +searchButton.isEnabled());
		    }
		    else {
		         System.out.println("Search button is not enabled. Return: " +searchButton.isEnabled());
		    }
		    driver.close();
		 }

	}


