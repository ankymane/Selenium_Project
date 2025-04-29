package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyLink {

	public static void main(String[] args)
	{
		method1();
		method2();
		method3();
		method4();
	}
	public static void method1()
	{
		String baseUrl = "http://demo.guru99.com/test/link.html";
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.linkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        driver.quit();
	}

	public static void method2()
	{

		String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());
        driver.quit();
	}

	public static void method3()

	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String theLinkText = driver.findElement(By
                .partialLinkText("egis"))
                .getText();
        System.out.println(theLinkText);
        theLinkText = driver.findElement(By
                .partialLinkText("EGIS"))
                .getText();
        System.out.println(theLinkText);

        driver.quit();

	}
	public static void method4()

	{

		 String baseUrl = "http://demo.guru99.com/test/block.html";
			System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.get(baseUrl);
	        driver.findElement(By.partialLinkText("Inside")).click();
	        System.out.println(driver.getTitle());
	        driver.navigate().back();
	        driver.findElement(By.partialLinkText("Outside")).click();
	        System.out.println(driver.getTitle());
	        driver.quit();
	}

}
