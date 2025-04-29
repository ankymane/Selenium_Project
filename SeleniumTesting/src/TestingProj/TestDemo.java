package TestingProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.irctc.co.in/nget/train-search");
	        try {

	             driver.findElement(By.xpath("a[contains(text(),'REGISTER')]")).click();

	           driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ankita0529");


	            String windowHandle = driver.getWindowHandle();

	            WebElement textBox = driver.findElement(By.xpath("//input[@id='usrPwd']"));
	            textBox.sendKeys("Imperative#123");
	            WebElement textBox1 = driver.findElement(By.xpath("//input[@id='cnfUsrPwd']"));
	            textBox1.sendKeys("Imperative#123");
	            Select prelang = new Select(driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-user-registration[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[5]/p-dropdown[1]/div[1]")));
	    		prelang.selectByVisibleText("English");

	    		  Select Secque = new Select(driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-user-registration[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[6]/p-dropdown[1]/div[1]")));
		    		Secque.selectByVisibleText("What is your pet name?");

	            WebElement Answer = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-user-registration[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[7]/input[1]"));
	            Answer.click();

	            WebElement proceed = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-user-registration[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/button[1]"));
	            proceed.click();
	        } catch (Exception e) {

	            System.out.println(e.getMessage());
	        }

	        driver.quit();
	    }

	}


