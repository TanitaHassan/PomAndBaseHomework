package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public String filePath;
	public String sheetName;
	
	
	public ExcelReader(String filePath, String sheetName) {
		
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}
	public String getStringCellValue(int rowNum,int columnNum) {
		String celldata=null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook registrationBook=new XSSFWorkbook(fis); //formula to memorise
			Sheet sheet=registrationBook.getSheet(sheetName);
			Row row=sheet.getRow(rowNum);
			Cell coloumn= row.getCell(columnNum);
			celldata=coloumn.getStringCellValue();
			System.out.println(celldata);
			registrationBook.close();
			fis.close();
			
			
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return celldata;
	}
	
	public double getNumericValue(int rowNum,int columnNum) {
		double celldata=0.0;
		try {
			FileInputStream fis=new FileInputStream(filePath);
			Workbook registrationBook=new XSSFWorkbook(fis);
			Sheet sheet=registrationBook.getSheet(sheetName);
			Row row=sheet.getRow(rowNum);
			Cell column=row.getCell(columnNum);
			celldata=column.getNumericCellValue();
			System.out.println(celldata);
			registrationBook.close();
			fis.close();
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return celldata;
	}
	public static void main(String[] args) {
		String file="src/test/resources/registration.xlsx";
		ExcelReader er=new ExcelReader(file,"Sheet1");
		er.getStringCellValue(1, 0);
		er.getStringCellValue(0, 0);
		er.getStringCellValue(0, 2);
		
		ExcelReader er1 =new ExcelReader(file,"Sheet3");
		er1.getNumericValue(1, 0);
		er1.getNumericValue(1, 1);
		
		
	}
	
		
		
		
		
	

}
