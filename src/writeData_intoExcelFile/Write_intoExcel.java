package writeData_intoExcelFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_intoExcel {

	public static void main(String[] args) throws IOException {

		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
		XSSFSheet sheet1= workbook.createSheet("Sheet6");
		
		Row r0=sheet1.createRow(0);
		Cell c0=r0.createCell(0);
		c0.setCellValue("Shraddha");
		
//------------------------------------------------------------------
		Row r1=sheet1.createRow(1);
		Cell cell=r1.createCell(0);
		cell.setCellValue("Yadav");
		
		
		//File f=new File("C:\\Users\\Administrator\\.ApachePoi\\Demo.xlsx");
		
		File f=new File("C:\\Users\\Administrator\\eclipse-workspace\\SelePractice\\src\\data\\TestData.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		workbook.write(fos);
		
		fos.close();
		
		workbook.close();
		
		System.out.println("File is written successfully!");
		
		
	}

}
