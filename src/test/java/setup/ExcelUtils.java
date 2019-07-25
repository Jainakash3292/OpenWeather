package setup;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
//
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell cell_1;
	//private static Cell cell_1;

	private static XSSFRow Row;
	private static FileInputStream excelFile;
	private static String filePath;

	//This method is used to set the File path and to open the Excel file
	public static void setExcelFile() throws Exception {

		try {
			String workingDir = System.getProperty

					("user.dir");
			filePath = workingDir+File.separator

					+"src"+File.separator+"item_details.xlsx";
			excelFile = new FileInputStream(filePath);
			ExcelWBook = new XSSFWorkbook(excelFile);
			ExcelWSheet = ExcelWBook.getSheet("item_detail");

		} catch (Exception e){
			e.printStackTrace();

		}

	}

	//This method is used to read the test data from the Excel cell, in this we are passing parameters as Row number and Column number and return the cell value

	public static String getCellData(int RowNum, int ColNum) throws Exception{
		// fill the code
		
		try{
			Row = ExcelWSheet.getRow(RowNum);
			cell_1 = Row.getCell(ColNum);

  			//String CellData = cell_1.getStringCellValue();

  			return cell_1.getStringCellValue();

  			}catch (Exception e){
e.printStackTrace();
				return"";

  			}

    }
	}







