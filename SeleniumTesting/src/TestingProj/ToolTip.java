package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToolTip {

	public static void main(String[] args) throws InterruptedException
	{

		Tool1();
		Tool2();
	}
	public static void Tool1() throws InterruptedException
	{
	String baseUrl = "https://demo.guru99.com/test/social-icon.html";
	System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTooltip = "Google+";

    		WebElement github = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/a[2]"));

        String actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip: "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip))
        {
          System.out.println("Test Case Passed");
        }
        Thread.sleep(2000);
        driver.close();
	}
	public static void Tool2() throws InterruptedException
	{

		 String baseUrl = "https://demo.guru99.com/test/tooltip.html";
			System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        String expectedTooltip = "What's new in 3.2";
	        driver.get(baseUrl);

	        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
	        Actions builder = new Actions (driver);

	        builder.clickAndHold().moveToElement(download);
	        builder.moveToElement(download).build().perform();

	        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
	        String actualTooltip = toolTipElement.getText();

	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);
	        if(actualTooltip.equals(expectedTooltip)) {
	            System.out.println("Test Case Passed");
	        }
	        Thread.sleep(2000);
	        driver.close();
	}

}
