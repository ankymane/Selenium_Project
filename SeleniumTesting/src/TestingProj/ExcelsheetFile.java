package TestingProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelsheetFile {

	public static void main(String[] args) throws IOException
	{
		ReadExcel();
		ReadSinglerow();

	}
	public static void ReadExcel() throws IOException
	{
		/*FileInputStream fs = new FileInputStream("D:\\Ankita\\EclipseExcel.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		*/
		File file =    new File("E:\\Ankita\\EclipseExcel.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        //creating a Sheet object
        		XSSFSheet sheet=wb.getSheet("STUDENT_DATA");

        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){

            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();

            //iterate over each cell to print its value
            System.out.println("Row"+ i+" data is :");

            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }

    }
	public static void ReadSinglerow() throws IOException
    {
File file =    new File("E:\\Ankita\\EclipseExcel.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet=wb.getSheet("STUDENT_DATA");


        XSSFRow row2=sheet.getRow(1);
        XSSFCell cell=row2.getCell(2);

        String address= cell.getStringCellValue();

        System.out.println("Single row Demo:" + " \n " + "Address is :"+ address);
    }
}
