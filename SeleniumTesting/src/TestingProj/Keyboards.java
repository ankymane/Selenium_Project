package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboards {

	public static void main(String[] args) throws InterruptedException
	{

		Enter();
		Url();
		Resize();
	}
	public static void Enter() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");

		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/nav[@id='main']/form[1]/input[1]"));
		//textbox.sendKeys(Keys.ENTER);

		Actions actions = new Actions(driver);

        actions.sendKeys(element, Keys.ENTER).perform();
        actions.sendKeys(element, Keys.ARROW_UP).perform();
        actions.sendKeys(element, Keys.ARROW_DOWN).perform();
        actions.sendKeys(element, Keys.TAB).perform();

        Thread.sleep(3000);
       driver.quit();

	}
	public static void Url()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 128\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
	}
	public static void Resize() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 128\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/selenium-tutorial");
		int width = 600;
		int height = 400;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		driver.close();
	}


}
