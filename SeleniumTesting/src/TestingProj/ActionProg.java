package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionProg
{

	public static void main(String[] args) throws InterruptedException
	{
		MouseOver();
		MouseAction();
		RightClick();
		DoubleClick();
		MouseOver1();
	}
	public static void MouseOver()
	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
                driver.get(baseUrl);
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));

                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();

                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before mouse over: " + bgColor);
                mouseOverHome.perform();
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After mouse over: " + bgColor);
                driver.close();
	}
	public static void MouseAction() throws InterruptedException
	{
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();

		seriesOfActions.perform() ;
		Thread.sleep(2000);
        driver.close();

	}
	public static void RightClick() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");

		//Right click in the TextBox
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='fname']"));
		action.contextClick(searchBox).perform();


		Thread.sleep(3000);
		driver.quit();
	}
	public static void DoubleClick() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();

		//Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		action.doubleClick(btn).perform();


		Thread.sleep(3000);
		driver.quit();

	}
	public static void MouseOver1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();

		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[@id='idOfButton']"));
		action.moveToElement(btn).perform();

		Thread.sleep(3000);
		driver.quit();
	}

}
