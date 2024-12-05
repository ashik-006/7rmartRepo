package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class Exel_utilities 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int i, int j, String sheet) throws IOException  
 	{ 
		String filepath=Constants.TEST_DATA_FILE;
 		f=new FileInputStream(filepath); 
 		w= new XSSFWorkbook(f); 
 		sh = w.getSheet(sheet); 
 		Row r= sh.getRow(i); 
 		Cell c= r.getCell(j); 
 		return c.getStringCellValue(); 
 	}
	public static String getIntegerData(int i, int j, String sheet) throws IOException
	{
		String filepath=Constants.TEST_DATA_FILE;
 		f=new FileInputStream(filepath); 
		w=new XSSFWorkbook(f); 
		sh=w.getSheet(sheet); 
		Row r=sh.getRow(i); 
		Cell c=r.getCell(j); 
		int x=(int)c.getNumericCellValue(); 
		return String.valueOf(x);
	}
}
