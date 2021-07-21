package ExcelReadUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rsa.qa.base.BaseClass;

public class ExcelReadUtil extends BaseClass{
	XSSFWorkbook wb;
	XSSFSheet sh;
	FileInputStream fis;
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



}
