package org.com.login;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstproject {
	public static void main(String[] args) throws InterruptedException, Throwable {
		File f=new File("D:\\sathish\\Launch.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(3);
        int cellType = cell.getCellType();
        
	
		Cell cell3 = row.getCell(0);
		String val1 = cell3.getStringCellValue();
		System.out.println(val1);
	    Cell cell2 = row.getCell(1);
	     String val2 = cell2.getStringCellValue();
	     System.out.println(val2);
	     Cell cell4 = row.getCell(5);
	     String val3 = cell4.getStringCellValue();
	     System.out.println(val3);
	 	
	    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("firstName"));
		txtUsername.sendKeys(val1);
	
		WebElement txtLast = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtLast.sendKeys(val2);
		WebElement txtEmail = driver.findElement(By.id("userEmail"));
		txtEmail.sendKeys(row.getCell(2).getStringCellValue());
		
		WebElement txtPhone = driver.findElement(By.id("userNumber"));
		driver.findElement(By.id("currentAddress")).sendKeys(row.getCell(5).getStringCellValue());
		if(cellType==0) {
			double numericCellValue = cell.getNumericCellValue();
				
			 long l=(long)numericCellValue;
              System.out.println(l);
             String valueOf = String.valueOf(l);
             txtPhone.sendKeys(valueOf);
         
		}
		

		}
	}


