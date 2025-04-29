package TestingProj;

//import com.google.common.collect.Table.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WriteIntoExcel {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Ankita\\Software\\Chrome Driver 130\\chromedriver-win64\\chromedriver.exe");
	
		File file = new File("E:\\Ankita\\EclipseExcel.xlsx");

       
        FileInputStream inputStream = new FileInputStream(file);


        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
 
        		XSSFSheet sheet=wb.getSheet("STUDENT_DATA1");

        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

     
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


        driver.get("https://demoqa.com/automation-practice-form");


        //Identify the WebElements for the student registration form
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.id("userEmail"));
        WebElement genderMale= driver.findElement(By.id("gender-radio-1"));
        WebElement mobile=driver.findElement(By.id("userNumber"));
        WebElement address=driver.findElement(By.id("currentAddress"));
        WebElement submitBtn=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[11]/div[1]/button[1]"));


        for(int i=1;i<=rowCount;i++) {
            //Enter the values read from Excel in firstname,lastname,mobile,email,address
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
           mobile.sendKeys(String.valueOf((int) sheet.getRow(i).getCell(4).getNumericCellValue()));
            //String mobileNumber = String.valueOf((long)sheet.getRow(i).getCell(4).getNumericCellValue());
           //mobile.sendKeys(String.valueOf(sheet.getRow(i).getCell(4).getNumericCellValue()));
            address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());

            //Click on the gender radio button using javascript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", genderMale);

            js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

            Thread.sleep(3000);
            submitBtn.click();

            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));

            //create a new cell in the row at index 6
            XSSFCell cell = sheet.getRow(i).createCell(7);


            if (confirmationMessage.isDisplayed()) {

                cell.setCellValue("PASS");

            } else {

                cell.setCellValue("FAIL");
            }

            // Write the data back in the Excel file
            FileOutputStream outputStream = new FileOutputStream("E:\\Ankita\\EclipseExcel.xlsx");
            wb.write(outputStream);

            //close the confirmation popup
            WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
            closebtn.click();


            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        }

      
        wb.close();
        driver.quit();
        }

	}

