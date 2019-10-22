import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	static File f;
	static FileInputStream fis;
	static XSSFWorkbook w;
	static Sheet s;
	static Row row;
	static Cell cell;
	
	public static void main(String[] args) throws IOException {
	
		f= new File("D://Desktop/Input.xlsx");
		fis= new FileInputStream(f);
		w =new XSSFWorkbook(fis);
		s= w.getSheet("Inputs");
		int rows= s.getLastRowNum()-s.getFirstRowNum();
		
		for(int i=0; i<rows; i++) {
			row=s.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {
				
				cell= row.getCell(j);
				String cellvalue =cell.getStringCellValue();
				System.out.println(cellvalue);
			}
			
		}
		
	}

}
