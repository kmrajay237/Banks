package interview;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		String filepath="./files/countries.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator=sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.println(cell);
			}
		}
		workbook.close();
		fis.close();
	}

}
