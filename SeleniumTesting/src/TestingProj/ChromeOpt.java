package TestingProj;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOpt {

	public static void main(String[] args)
	{
		Adblocker();
		Incognito();
		HeadlessModeDemo();
	}
	public static void Adblocker()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("E:\\Ankita\\Software\\extension_5_21_0_0.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//driver.quit();
		}

	public static void Incognito()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			//driver.quit();
}

	public static void HeadlessModeDemo()
	{


		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://demo.guru99.com/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println("Page Title: " +title);
			driver.quit();
			}
}
