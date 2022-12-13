package writeData_intoExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws IOException {

		
		
		
		File myFile=new File("C:\\Users\\Administrator\\.ApachePoi\\MyExcel.xlsx");	
		
		FileInputStream fis=new FileInputStream(myFile);
		
		XSSFWorkbook wB=new XSSFWorkbook(fis);
		
		System.out.println(wB);
		System.out.println("---------------");
		
		XSSFSheet sh1= wB.getSheetAt(1);
		
		String value = sh1.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
		
		
		
		
	}

}
