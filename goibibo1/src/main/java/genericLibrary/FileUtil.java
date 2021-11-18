package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtil {

	public static String excelData(String sheet,int rownum,int cellnum) throws IOException  {
		FileInputStream fis=new FileInputStream(new File("./Resource/goibibo.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);

		String data = workbook.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}

	public static String[][] readMultipleDataFromExcel(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[][] excelData(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
