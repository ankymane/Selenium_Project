package TestingProj;

//import dev.selenium.BaseChromeTest;
import java.io.File;
import org.testng.Assert;

//  import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import dev.failsafe.internal.util.Assert;

public class FileUpload {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();

		 driver.get("https://the-internet.herokuapp.com/upload");
		    File uploadFile = new File("E:\\Ankita\\Other\\IBVL.png");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
		    Assert.assertEquals("IBVL.png", fileName.getText());
	}

}
