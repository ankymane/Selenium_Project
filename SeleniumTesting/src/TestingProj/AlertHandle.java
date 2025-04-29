package TestingProj;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException
	{
		Alert();
		WindowHandle();
		AlertHandle();

	}

	public static void Alert() throws NoAlertPresentException,InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


        driver.get("https://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        Thread.sleep(5000);
        System.out.println(alertMessage);


        alert.accept();
        driver.close();
	}
	public static void AlertHandle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();

		Thread.sleep(3000);

		Alert confirmBox = driver.switchTo().alert();
		confirmBox.dismiss();
		driver.close();

	}

	public static void WindowHandle() throws NoAlertPresentException,InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


            driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow=driver.getWindowHandle();

            Set<String> s1=driver.getWindowHandles();
        for (String ChildWindow : s1) {
            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                    driver.switchTo().window(ChildWindow);
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");

                    driver.findElement(By.name("btnLogin")).click();

                        driver.close();
            }
        }
        Thread.sleep(3000);
            driver.switchTo().window(MainWindow);

            driver.close();
	}


	}

