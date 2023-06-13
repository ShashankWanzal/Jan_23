package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo7_print_alldata
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\Jan Batch\\Jan_Batch.xlsx");
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		for(int i=0;i<=sheet.getLastRowNum();i++)  
		{
			
			for(int j=0;j<=sheet.getRow(i).getLastCellNum()-1;j++)
			{
				
				
				Cell info = sheet.getRow(i).getCell(j);
				
				CellType ct = info.getCellType();
				
				if(ct==CellType.NUMERIC)
				{
					
					double value = info.getNumericCellValue();
					System.out.print(value+" ");
			
				}
				
				else if(ct==CellType.STRING)
				{
					
					String value = info.getStringCellValue();
					System.out.print(value+" ");
					
				}
				
				else if(ct==CellType.BOOLEAN)
				{
					
					boolean value = info.getBooleanCellValue();
					System.out.print(value+" ");
					
				}
				
		
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
	}
	
	
}
