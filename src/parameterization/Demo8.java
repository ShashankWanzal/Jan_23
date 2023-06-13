package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo8 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		
	}
	
}
