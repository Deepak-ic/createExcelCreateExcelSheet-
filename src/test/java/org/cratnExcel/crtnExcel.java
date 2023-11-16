package org.cratnExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class crtnExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Deepak\\Documents\\cratnExcel\\Excel\\newSheet.xlsx");
		Workbook e = new XSSFWorkbook();
		Sheet mySheet = e.createSheet("Datas");
		Row newRow = mySheet.createRow(0);
		Cell newCell01 = newRow.createCell(0);
		newCell01.setCellValue("Seleinum");
		Cell newCell02 = newRow.createCell(1);
		newCell02.setCellValue("Java");
		Cell newCell03 = newRow.createCell(2);
		newCell03.setCellValue("Data Driven");
		Cell newCell04 = newRow.createCell(3);
		newCell04.setCellValue("POM");
		Row newRow2 = mySheet.createRow(1);
		Cell newCell1 = newRow2.createCell(0);
		newCell1.setCellValue("Appium");
		Cell newCell2 = newRow2.createCell(1);
		newCell2.setCellValue("Cucumber");
		Cell newCell3 = newRow2.createCell(2);
		newCell3.setCellValue("Junit");
		Cell newCell4 = newRow2.createCell(3);
		newCell4.setCellValue("TestNG");
		FileOutputStream fos = new FileOutputStream(f);
		e.write(fos);
		
	}
}
