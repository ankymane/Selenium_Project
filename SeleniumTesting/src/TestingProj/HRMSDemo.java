package TestingProj;

import org.testng.annotations.Test;


	import org.testng.annotations.Test;
	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

	public class HRMSDemo {
		private WebDriver driver;
		  private String baseUrl;
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();
		  private JavascriptExecutor js;

		  @BeforeClass(alwaysRun = true)
		  public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver", "E:\\Ankita\\Software\\Chrome Driver\\Chrome Driver 134\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
		    baseUrl = "https://www.google.com/";
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    js = (JavascriptExecutor) driver;
		  }

		  @Test
		  public void testDemo() throws Exception {
		    driver.get("https://hrmsfront.prepstripe.com/login");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::*[name()='svg'][1]")).click();
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::*[name()='svg'][1]")).click();
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/users");
		    driver.findElement(By.linkText("Users")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/main/div/div/button")).click();
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("admin@example.com");
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("password");
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/main/div/div[2]/div[2]/table/tbody/tr/td[7]/div/button")).click();
		    driver.findElement(By.id("manager_id")).click();
		    new Select(driver.findElement(By.id("manager_id"))).selectByVisibleText("Regular User (user@example.com)");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li[3]/div/span")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/dashboard");
		    driver.findElement(By.linkText("Dashboard")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/employee-management");
		    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Employee Management']/parent::*")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/attendance-leave");
		    driver.findElement(By.linkText("Attendance Leave")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/payroll-processing");
		    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Payroll Processing']/parent::*")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/payslip-generation");
		    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Payslip Generation']/parent::*")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/salary-disbursement");
		    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Salary Disbursement']/parent::*")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/statutory-compliance");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payslip Generation'])[1]/following::a[2]")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/reports");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Settings'])[1]/preceding::a[1]")).click();
		    driver.get("https://hrmsfront.prepstripe.com/admin/payroll/settings");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/preceding::a[1]")).click();
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='HRMS'])[2]/following::*[name()='svg'][3]")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/header/div/div/div[2]/div[2]/ul/li")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/header/div/div/div[2]/div[2]/ul/li[2]")).click();
		    driver.findElement(By.xpath("//div[@id='root']/div/div[2]/header/div/div/div[2]/div[2]/ul/li[3]")).click();
		    driver.get("https://hrmsfront.prepstripe.com/login");
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("admin@example.com");
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("password");
		  }

		  @AfterClass(alwaysRun = true)
		  public void tearDown() throws Exception {
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }

		  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
	}


