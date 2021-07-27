package webDriverAdvanced.HCL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadandWrite {

	@Test
	public void excelRead() throws IOException, InvalidFormatException 
	{


		File file = new File("C:\\Users\\user\\Downloads\\Leads.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("Write Excel1");


		int row = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();


		for(int i=1; i<=row; i++)
		{
			XSSFRow row1 = sheet.getRow(i);

			for(int j=0;j<column;j++)
			{
				XSSFCell cell = row1.getCell(j);
				String res = cell.getStringCellValue();
				System.out.println(res);

			}

			book.close();


		}
	}

	@Test(priority=0)
	public void WriteExcel() throws IOException
	{
		File file = new File("C:\\Users\\user\\Downloads\\Leads.xlsx");
		FileOutputStream fo = new FileOutputStream(file);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Write Excel1");

		XSSFRow r1 = sheet.createRow(0);

		XSSFCell c1 = r1.createCell(0);
		c1.setCellType(CellType.STRING);
		c1.setCellValue("Benjamin");

		XSSFCell c1a = r1.createCell(1);
		c1a.setCellType(CellType.STRING);
		c1a.setCellValue("Benjamin");

		XSSFCell c1b = r1.createCell(2);
		c1b.setCellType(CellType.STRING);
		c1b.setCellValue("Benjamin");

		XSSFRow r2 = sheet.createRow(1);
		XSSFCell c2 = r2.createCell(0);
		c2.setCellType(CellType.STRING);
		c2.setCellValue("Akash");

		XSSFCell c2a = r2.createCell(1);
		c2a.setCellType(CellType.STRING);
		c2a.setCellValue("Akash");
		
		XSSFCell c2b = r2.createCell(1);
		c2b.setCellType(CellType.STRING);
		c2b.setCellValue("Akash");


		book.write(fo);
		book.close();

	}





}




