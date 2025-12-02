package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	private static String filePath = "./testData/Test1.xlsx";
	private static Workbook book;

	public static void main(String[] args) {
		
	
		
		try {
			FileInputStream fp = new FileInputStream(filePath);
			book = WorkbookFactory.create(fp);
			Sheet sheet = book.getSheet("userDetails");
			System.out.println(sheet.getLastRowNum());
			System.out.println(sheet.getRow(0).getLastCellNum());
//			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i =0;i<sheet.getLastRowNum();i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					System.out.println(sheet.getRow(i).getCell(j).toString()); 
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
