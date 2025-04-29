package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExop
{
public static void main(String[] args) throws Exception
{

	System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");

	driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	driver.findElement(By.xpath("//body/div[8]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[2]/input[1]")).sendKeys("ankita.mane@theimperative.in");
	driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[2]/div/div[1]/div/div/div/div[4]/form/div[3]/input")).sendKeys("Ankita123");

    Thread.sleep(3000);

	driver.findElement(By.xpath("//body/div[8]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[5]/input[1]")).click();

 Thread.sleep(3000);

	String actxt=driver.findElement(By.xpath("//div[@id='msg_box']")).getText();
	System.out.println(actxt);

	
	String exptxt="Temporary Issue. Please try again later.";

	if(actxt.equals(exptxt))
	{
		System.out.println("Verification Pass");

	}
	else
	{
		System.out.println("Verification is failed expected is:" +exptxt+ "Actual is: " +actxt);

	} 
	}

}
