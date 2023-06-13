package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo11 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
	
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		//String cell , Numeric Cell , Boolean cell
		
		
		
		Cell info = sheet.getRow(0).getCell(0);
		
		CellType ct = info.getCellType();
		
		
		
		if(ct==CellType.NUMERIC)
		{
			
			double value = info.getNumericCellValue();
			System.out.println("Numeric cell"+value);
	
		}
		
		else if(ct==CellType.STRING)
		{
			
			String value = info.getStringCellValue();
			System.out.println("String cell "+value);
			
		}
		
		else if(ct==CellType.BOOLEAN)
		{
			
			boolean value = info.getBooleanCellValue();
			System.out.println("boolean cell "+value);
			
		}
		
		
		
		
		
		
		
		
	}
	
}
