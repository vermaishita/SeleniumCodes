package DataDriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFirst {
	String data;
	public void getData() throws IOException 
	{
		FileInputStream fs= new FileInputStream("E:\\Selenium Files\\LoginData.xlsx");
		//Access Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		//Access sheet from workbook
		XSSFSheet sheet=wb.getSheet("Login");
		
		//Access row from the work sheet
		int count=sheet.getLastRowNum();
		System.out.println("Total number of rows=" +count);
		
		XSSFRow row=sheet.getRow(0);
		
		//Fetch row from 0 row
		XSSFCell cell=row.getCell(1);
		data=cell.getStringCellValue();
		System.out.println("data is:" +data);
	}
	public static void main(String[] args) throws IOException {
		DataDrivenFirst ddf=new DataDrivenFirst();
		ddf.getData();
	}

}
