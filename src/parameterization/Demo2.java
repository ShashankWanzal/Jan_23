package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		//Step 1
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		
		double value = sheet.getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(value);
		
		
		
		
		
	}
	
}
