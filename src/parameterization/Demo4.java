package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet3");
		
		 Row row=sheet.getRow(3);
		 
		 short cellsize = row.getLastCellNum();
		 
		
		 System.out.println(cellsize+1);
		 
		 for(int i=0;i<=sheet.getRow(3).getFirstCellNum()-1;i++)
		 {
		boolean value = sheet.getRow(3).getCell(i).getBooleanCellValue();
			 
		System.out.println(value+" ");
		 }
		
		
	}
	
}
