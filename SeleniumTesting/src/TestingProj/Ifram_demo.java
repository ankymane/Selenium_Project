package TestingProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifram_demo {

	public static void main(String[] args)
	{
		Iframe_Switch();
		//Iframe_Index();

	}
	public static void Iframe_Switch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");


	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe

  			System.out.println("*********We are done***************");

	}
	/*public static void Iframe_Index()
	{

		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/guru99home/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++)
	    {
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	}
}*/

}
