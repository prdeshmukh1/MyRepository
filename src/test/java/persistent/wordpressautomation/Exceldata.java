package persistent.wordpressautomation;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;





import com.thoughtworks.selenium.webdriven.commands.CreateCookie;

public class Exceldata {
	
  @Test
  public void GetExceldata() throws BiffException, IOException, RowsExceededException, WriteException {
	 
	  
	  Workbook book = Workbook.getWorkbook(new File("./src/test/TestDataFile.xls"));
	  Sheet sheet =book.getSheet("Master");
	  String Title =sheet.getCell(0,1).getContents();
	  System.out.println("Title is :"+Title);
	  
	  System.out.println("====55555555555555=================555555555555555============5555555555555555555555555555==============");
	  book.close();
	  
	  // Writing to excel Sheet
	  WritableWorkbook newbook =Workbook.createWorkbook(new File("./src/test/NewDataFile.xls"));
	  WritableSheet sheet1 =newbook.createSheet("master", 0);
	  Label l1 =new Label(0, 0, "One");
	  sheet1.addCell(l1);
	  newbook.write();
	  newbook.close();
	  
	  
	  // To create a Copy of excel and write a Content.
	  
	  Workbook oldcopy = Workbook.getWorkbook(new File("./src/test/TestDataFile.xls"));
	  WritableWorkbook newcopy =Workbook.createWorkbook(new File("./src/test/NewCopy.xls"),oldcopy);
	  WritableSheet sheet2 =newcopy.getSheet(0);
	  
	  Label l2 = new Label(2,2,"Copy Content");
	  sheet2.addCell(l2);
	  
	  newcopy.write();
	  
	  oldcopy.close();
	  newcopy.close();
	  
  }
}
