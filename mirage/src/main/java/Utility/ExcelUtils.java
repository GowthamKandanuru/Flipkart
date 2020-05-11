package Utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static List<String> words ;
		public static List<String> getData(String path,String shname) throws Throwable
		{
			words = new ArrayList();
			FileInputStream in = new FileInputStream(path);
			workbook = new XSSFWorkbook(in);
			sheet = workbook.getSheet(shname);
			int k = sheet.getLastRowNum()-sheet.getFirstRowNum();
			for(int i=1;i<=k;i++)
			{
				row = sheet.getRow(i);
				for(int j=1;j<row.getLastCellNum();j++)
				{
					words.add(row.getCell(j).getStringCellValue());
				}
			}
			return words;
		}
}

//