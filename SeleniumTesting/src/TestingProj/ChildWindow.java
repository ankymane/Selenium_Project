package TestingProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/browser-windows");

	         driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();

	         WebElement text = driver.findElement(By.id("sampleHeading"));

	         // Fetching the text using method and printing it
	         System.out.println("Element found using text: " + text.getText());
	         driver.quit();
	    }

	}


