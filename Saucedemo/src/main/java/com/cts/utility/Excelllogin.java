package com.cts.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelllogin {

//To read and return username
	public String excel_Username(int a) throws IOException {

		FileInputStream fil = new FileInputStream(new File("src/test/resources/Details.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("login1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(0);
		String username1 = cell.getStringCellValue();

		return username1;
	}

	// TO read and return password
	public String excel_Password(int b) throws IOException {

		FileInputStream fil = new FileInputStream(new File("src/test/resources/Details.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("login1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(b);
		XSSFCell cell1 = row.getCell(1);
		String password1 = cell1.getStringCellValue();

		return password1;
	}

}
