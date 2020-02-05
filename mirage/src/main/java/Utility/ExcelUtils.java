package Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static String s;
		public static String getData(String path,String shname) throws Throwable
		{
			FileInputStream in = new FileInputStream(path);
			workbook = new XSSFWorkbook(in);
			sheet = workbook.getSheet(shname);
			int k = sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println(k);
			for(int i=1;i<2;i++)
			{
				row = sheet.getRow(i);
				//System.out.println(row.getLastCellNum());
				for(int j=1;j<row.getLastCellNum();j++)
				{
					 s= row.getCell(j).getStringCellValue();
				}
			}
			return s;
		}
}
