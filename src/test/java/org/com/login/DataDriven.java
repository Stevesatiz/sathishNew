package org.com.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
	
	File f=new File("D:\\sathish\\Launch.xlsx");
	
	FileInputStream stream=new FileInputStream(f);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement phone = driver.findElement(By.id("userNumber"));
	WebElement txtUsername = driver.findElement(By.id("firstName"));

	Workbook book=new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j <row.getPhysicalNumberOfCells()	 ; j++) {
			Cell cell = row.getCell(j);
			String stringCellValue2 = cell.getStringCellValue();
			
			//determine the type
			int cellType = cell.getCellType();
			if (cellType==1) {
			        String stringCellValue = cell.getStringCellValue();
			        System.out.print(stringCellValue+"\t");	
			        txtUsername.sendKeys(stringCellValue);
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("MMM/dd/yyyy");
				String format = s.format(dateCellValue);
				System.out.print(format);
				
			} 
			else {
				double numericCellValue = cell.getNumericCellValue();
				//type convertion
				long l=(long)numericCellValue;
				System.out.print(l+"\t");
				String valueOf = String.valueOf(l);
				phone.sendKeys(valueOf);
				
			}
			
		}
		System.out.println();
	}
	

		
	}

	
}
