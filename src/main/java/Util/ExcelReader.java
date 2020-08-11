package Util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public String path;
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	public ExcelReader(String path) {
		this.path = path;
		try {
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
		// Method to call the value
		public String [][]getAllData(String sheetName){
		// For Sheet
		int index = workbook.getSheetIndex(sheetName);
		int col_Num = 0;
		sheet = workbook.getSheetAt(index);
		int rowcount =sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		String [][] data=new String[rowcount-1][colcount];
		for (int i = 1; i <rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}

}
		return data;}
		
		
		}