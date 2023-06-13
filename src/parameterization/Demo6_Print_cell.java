package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo6_Print_cell 
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		int rowno = sheet.getLastRowNum();
		
		System.out.println(rowno);
		
		for(int i=0;i<=rowno;i++)
		{
			
			
			String value = sheet.getRow(i).getCell(0).getStringCellValue();  
			
			System.out.println(value);
			
		}
		
	}
	
}
