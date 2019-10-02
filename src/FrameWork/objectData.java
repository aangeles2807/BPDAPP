package FrameWork;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class objectData {

    public ArrayList ReadExcel(String filePath,String fileName) throws InterruptedException, IOException{

        ArrayList data = new ArrayList<>();
        File file = new File(filePath+"\\"+fileName);
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        Workbook AddCatalog = null;
        //Find the file extension by splitting file name in substring  and getting only extension name
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        //Check condition if the file is a .xls file or .xlsx file
        if(fileExtensionName.equals(".xls")){
            //If it is .xls file then create object of HSSFWorkbook class
            AddCatalog = new HSSFWorkbook(inputStream);
        }
        else if(fileExtensionName.equals(".xlsx")){
            //If it is .xlsx file then create object of XSSFWorkbook class
            AddCatalog = new XSSFWorkbook(inputStream);
        }
        //Read sheet inside the workbook by its name
        Sheet AddCatalogSheet = AddCatalog.getSheetAt(0);
        //Find number of rows in excel file
        int rowcount = AddCatalogSheet.getLastRowNum()- AddCatalogSheet.getFirstRowNum();
        for(int i=1; i<rowcount+1; i++){
            //Create a loop to get the cell values of a row for one iteration
            Row row = AddCatalogSheet.getRow(i);
            List arrName = new ArrayList<>();
            for(int j=0; j<row.getLastCellNum(); j++){
                // Create an object reference of 'Cell' class
                Cell cell = row.getCell(j);
                switch (cell.getCellType())
                {
                    case STRING:
                        // Add all the cell values of a particular row
                        arrName.add(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        // Add all the cell values of a particular row
                        int value = (int) cell.getNumericCellValue();
                        arrName.add(value);
                        break;
                    case BOOLEAN:
                        // Add all the cell values of a particular row
                        arrName.add(cell.getBooleanCellValue());
                        break;
                    default:
                        break;
                }
            }
            data.add(arrName);
        }
        return data;
    }
}
