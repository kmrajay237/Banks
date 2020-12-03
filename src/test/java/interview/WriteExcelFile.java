package interview;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Student");
		Map<String, String> data=new HashMap<String, String>();
		data.put("101", "John");
		data.put("102", "Doe");
		data.put("103", "Steve");
		data.put("104", "Smith");
		data.put("105", "Warner");
		int rownum=0;
		for (Map.Entry<String, String>entry:data.entrySet()) {
			XSSFRow row = sheet.createRow(rownum++);
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
		}
		FileOutputStream fos=new FileOutputStream(new File("./files/Student.xlsx"));
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Done");
		
	}

}
