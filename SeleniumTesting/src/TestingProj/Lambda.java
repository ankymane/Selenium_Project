package TestingProj;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Lambda {


	 public static final String USERNAME = "ankita.mane@theimperative.in";  
	    public static final String ACCESS_KEY = "Ankita@11"; 

	    public static final String GRID_URL = "https://hub.lambdatest.com/wd/hub";

	    public static void main(String[] args) {
	        try {
	           
	            HashMap<String, Object> ltOptions = new HashMap<>();
	            ltOptions.put("ankita.mane@theimperative.in", USERNAME);
	            ltOptions.put("Ankita@11", ACCESS_KEY);
	            ltOptions.put("build", "LambdaTest-Sample-Build");
	            ltOptions.put("name", "LambdaTest-Sample-Test");
	            ltOptions.put("platformName", "Windows 11");    
	            ltOptions.put("selfHealing", true);             

	            
	            MutableCapabilities capabilities = new MutableCapabilities();
	            capabilities.setCapability("browserName", "Chrome");
	            capabilities.setCapability("browserVersion", "latest");
	            capabilities.setCapability("LT:Options", ltOptions); 

	          
	            WebDriver driver = new RemoteWebDriver(new URL(GRID_URL), capabilities);

	            driver.get("https://www.example.com");
	            WebElement heading = driver.findElement(By.tagName("h1"));
	            System.out.println("Heading: " + heading.getText());

	            driver.quit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	}


