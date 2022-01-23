package org.com.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassLearning {
public static WebDriver driver;

	public static void browserLaunch(String url) {
      WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
      driver.get(url);
      
	}
	public WebElement findLocators(String locatorType, String value) {
		if (locatorType.equals("id")) {
			WebElement findElement = driver.findElement(By.id(value));
			return findElement;	
		}
		else if (locatorType.equals("name")) {
			WebElement findElement = driver.findElement(By.name(value));
			return findElement;
		}
		else {
		WebElement findElement = driver.findElement(By.xpath(value));
          return findElement;
		}
	}
	public void giveText(WebElement element, String text) {
      element.sendKeys(text);	
	}
   public void mouseOverAction(WebElement element) {
    Actions a=new Actions(driver);
    a.moveToElement(element).perform();
	}
   public void doubleclic(WebElement element) {
      Actions a=new Actions(driver);
      a.doubleClick(element).perform();
	}
	public void contextClick(WebElement element) {
      Actions a=new Actions(driver);
      a.contextClick(element).perform();
	}
	public void dragDrop(WebElement element,WebElement element1) {
      Actions a=new Actions(driver);
      a.dragAndDrop(element, element1).perform();
      
	}
	public void clickandHold(WebElement element, WebElement element1) {
      Actions a=new Actions(driver);
      a.clickAndHold(element).moveToElement(element1).release().perform();
	}
	public void robot() throws AWTException {
     
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
		 r.keyRelease(KeyEvent.VK_X);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	}
	 public void robot1() throws Exception {

		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	}
	 public void alertAction() {
 
    	   Alert a=driver.switchTo().alert();
    	   a.accept();
	}
       public void alert2() {

		 Alert a=driver.switchTo().alert();
		 a.dismiss();
	}
       public void selectClass1(WebElement element,String index) {
		Select s=new Select(element);
		int parse=Integer.parseInt(index);
		s.selectByIndex(parse);
	}
       public void selectClass(WebElement element,int value) {
    	   Select s=new Select(element);
    	   s.selectByIndex(value);
	}
	 public void scroll() {

		 JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("window.scrollBy(0, 5000)");
          
	 }
	 public void scroll1(WebElement element) {
      JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	 public void scroll2(WebElement element) {
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

	 public String excelReading(String path, String sheetName, int rowNo, int cellNo) throws IOException   {

		File f=new File(path);
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
				return stringCellValue;					
				}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
			String format = s.format(dateCellValue);
			return format;
			
		}
		
		
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	
		}
	 public String excelInput(int rowNo,int cellNo) throws Exception {
		 File f=new File("D:\\success.xlsx");
			FileInputStream stream=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(stream);
			Sheet sheet = w.getSheet("test1");
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
					return stringCellValue;					
					}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
				String format = s.format(dateCellValue);
				return format;
				
			}
			
			
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l=(long)numericCellValue;
				String valueOf = String.valueOf(l);
				return valueOf;
			}

	}
	public void excelWrite(String path,String sheetName, int rowNo, int cellNo, String value) throws IOException {
       File f=new File(path);
       Workbook w=new XSSFWorkbook();
       Sheet sheet = w.createSheet(sheetName);
       Row row = sheet.createRow(rowNo);
       Cell cell = row.createCell(cellNo);
       cell.setCellValue(value);
  
       FileOutputStream stream=new FileOutputStream(f);
       w.write(stream);
       	
	}
	}
	 

	 

