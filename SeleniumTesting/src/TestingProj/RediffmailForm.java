package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffmailForm {

	public static void main(String[] args) throws Exception
	{
		Rediffmail();
	}

	public static void Rediffmail() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Ankita Mane");
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("ankita.mane1100");
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Imperative@5");
		driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[11]/td[3]/input[1]")).sendKeys("Imperative@5");
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("ankita.mane12@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9874563210");


		Select drpdate = new Select(driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]")));
		drpdate.selectByVisibleText("05");
		Select drpMonth = new Select(driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]")));
		drpMonth.selectByVisibleText("SEP");
		Select drpYear = new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
		drpYear.selectByVisibleText("1993");
		driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[2]")).click();

		Select Country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		Country.selectByVisibleText("India");
		Select City = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]")));
		City.selectByVisibleText("Mumbai");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Register']")).click();


	}

}
