package ExcelReadUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rsa.qa.base.BaseClass;

public class ExcelReadUtil extends BaseClass{
	XSSFWorkbook wb;
	XSSFSheet sh;
	FileInputStream fis;
	static int rowCount=0;
	
	public ExcelReadUtil (){
		super();
		try {
			fis= new FileInputStream(prop.getProperty("excelFilePath"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb= new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getData(String sheetName, int rowNum, int CellNum) {
		sh=wb.getSheet(sheetName);
		String CellString=sh.getRow(rowNum).getCell(CellNum).getStringCellValue();
		return CellString;
	}
	
	public static ArrayList<Object[]> getDataFromExcel() throws IOException
	{		 
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		
		 File src =new  File(prop.getProperty("excelFilePath"));
	        
	       	FileInputStream fis = new FileInputStream(src);
	       	
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        
	        XSSFSheet sheet1= wb.getSheet("Sheet1");
	        
	        DataFormatter formatter = new DataFormatter();
	        
	        rowCount = sheet1.getLastRowNum();
	       
	        for ( int i =1 ;i<= rowCount ;i++)
	        {
	              String title = formatter.formatCellValue(sheet1.getRow(i).getCell(0));
	               Object ob[]= {title};
	              myData.add(ob);
	        }
	        fis.close();
	        return myData;
	}



}
