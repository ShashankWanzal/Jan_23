package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5_Print_row
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
	
		short cellno = sheet.getRow(0).getLastCellNum();
		
		System.out.println(cellno);
		
		for(int i=0;i<=cellno-1;i++)   //6-1  5
		{
			
			
			String value = sheet.getRow(0).getCell(i).getStringCellValue();
			
			System.out.println(value);
			
		}
		
		
		
	}
	
	
}
