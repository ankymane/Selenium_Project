package TestingProj;

public class ExcelsheetReader {

	public static void main(String[] args)
	{

		Xls_Reader xls=new Xls_Reader("D:\\Ankita\\Programs\\ExcelSReader_New.xlsx");


		System.out.println("Column count: "+xls.getColumnCount("Sheet1"));
		System.out.println("Get column count: "+xls.getColumnCount("Sheet1"));

		System.out.println("Row count: "+xls.getRowCount("Sheet1"));

		System.out.println("Get Data: "+xls.getCellData("Sheet1", 0, 3));
		System.out.println("Get Data 2: "+xls.getCellData("Sheet1", 0, 2));



		//we need to find who got fail
		for(int row=0; row<=xls.getRowCount("Sheet1");row++)
			{
				for(int col=0; col<xls.getColumnCount("Sheet1"); col++)
				{
					String gdata=xls.getCellData("Sheet1", "Grade",row);
					if(gdata.equals("Fail"))
					{
						System.out.println(xls.getCellData("Sheet1", col, row)+" ");
					}
				}
				System.out.println();
			}

	xls.setCellData("Sheet1", "Name", 9, "ABC8");
		xls.setCellData("Sheet1", "Hindi", 9, "10");
		xls.setCellData("Sheet1", "English", 9, "20");
		xls.setCellData("Sheet1", "Average", 9, "30");
		xls.setCellData("Sheet1", "Grade", 9, "Z");
		}


    }

