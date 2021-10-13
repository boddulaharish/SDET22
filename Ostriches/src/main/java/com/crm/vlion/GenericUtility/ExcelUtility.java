package com.crm.vlion.GenericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/*
	 * author @ Harish
	 */
	/**
	 * This method used to read data from excel by specifying sheetname, row number and cell number
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return 
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable{
		FileInputStream file=new FileInputStream(IpathConstant.EXCELPATH);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		return cell.getStringCellValue();
		
		
	}
}

