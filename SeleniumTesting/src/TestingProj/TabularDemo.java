package TestingProj;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TabularDemo {

	public static void main(String[] args) throws InterruptedException, ParseException
	{

		Table1();
		Table2();
		Table3();
	}
	public static void Table1() throws InterruptedException
	{
		// Getting Table data
		String baseUrl = "https://testbook.com/maths/tabulation";
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(By.xpath("//td[contains(text(),'Fuel and Transport(lakhs)')]")).getText();
	        System.out.println(innerText);
	        String innerText1 = driver.findElement(By.xpath("//td[contains(text(),'General Awareness')]")).getText();
	        System.out.println(innerText1);

	        Thread.sleep(3000);
		driver.quit();
	}

	public static void Table2()
	{
		//Getting total table cols and rows
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
		  wd= new ChromeDriver();
	        wd.get("https://demo.guru99.com/test/web-table-element.php");

	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size());

	        List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("No of rows are : " + rows.size());
	        wd.close();
	}
	public static void Table3()
	{

		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("https://demo.guru99.com/test/web-table-element.php");
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = wd.findElement(By.tagName("table"));

		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);

		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed);
		    wd.close();
	}


}
