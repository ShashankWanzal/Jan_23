package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class Demo10_printdata_usingcelltype 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
	
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		//String cell , Numeric Cell , Boolean cell
		
		
		CellType ct = sheet.getRow(1).getCell(0).getCellType();
		
		
		System.out.println("cell type=> "+ ct);
		
		
		if(ct==CellType.NUMERIC)
		{
			
			
		System.out.println(sheet.getRow(1).getCell(0).getNumericCellValue());
	
		}
		
		else if(ct==CellType.STRING)
		{
			
			System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
			
		}
		
		else if(ct==CellType.BOOLEAN)
		{
			
			System.out.println(sheet.getRow(1).getCell(0).getBooleanCellValue());
			
		}
		
		
		
		
		
		
	}
	
}
