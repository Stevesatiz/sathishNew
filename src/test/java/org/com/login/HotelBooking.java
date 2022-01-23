package org.com.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class HotelBooking extends BaseClassLearning {
	public static void main(String[] args) throws Exception {
		BaseClassLearning b=new BaseClassLearning();
		b.browserLaunch("https://adactinhotelapp.com/");
		b.driver.manage().window().maximize();
		String excelReading = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 0, 0);
        WebElement findLocators = b.findLocators("id","username");
        b.giveText(findLocators, excelReading);
		String excelReading2 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 0, 1);
		WebElement findLocators2 = b.findLocators("id", "password");
		b.giveText(findLocators2, excelReading2);
		Thread.sleep(2000);
		WebElement findLocators3 = b.findLocators("id", "login");
		findLocators3.click();
		
		String excelReading3 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 0);
		WebElement findLocators4 = b.findLocators("name", "location");
		findLocators4.click();
		b.giveText(findLocators4, excelReading3);
	    b.robot1();
         
		String excelReading4 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 1);
		WebElement findLocators5 = b.findLocators("name", "hotels");
		findLocators5.click();
		b.giveText(findLocators5, excelReading4);
		b.robot1();
		
		String excelReading5 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 2);
		WebElement findLocators6 = b.findLocators("name", "room_type");
		findLocators6.click();
		b.giveText(findLocators6, excelReading5);
		b.robot1();
		
		String excelReading6 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 3);
		WebElement findLocators7 = b.findLocators("name", "room_nos");
		findLocators7.click();
		b.giveText(findLocators7, excelReading6);
		b.robot1();
		
		String excelReading7 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 4);
		WebElement findLocators8 = b.findLocators("id", "datepick_in");
		findLocators8.clear();
		b.giveText(findLocators8, excelReading7);
		
		String excelReading8 = b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 5);
		WebElement findLocators9 = b.findLocators("id", "datepick_out");
		findLocators9.clear();
		b.giveText(findLocators9, excelReading8);
		
		String excelReading9= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 6);
		WebElement findLocators10 = b.findLocators("name", "adult_room");
		findLocators10.click();
		b.giveText(findLocators10, excelReading9);
		b.robot1();
		
		String excelReading10= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 1, 7);
		WebElement findLocators11 = b.findLocators("name", "child_room");
		findLocators11.click();
		b.giveText(findLocators11, excelReading10);
		b.robot1();
		
		WebElement findLocators12 = b.findLocators("id", "Submit");
		findLocators12.click();
		
		WebElement findLocators13 = b.findLocators("name", "radiobutton_0");
		findLocators13.click();
		
		WebElement findLocators14 = b.findLocators("name", "continue");
		findLocators14.click();
		
		String excelReading11= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 2, 0);
		WebElement findLocators15 = b.findLocators("id","first_name");
		b.giveText(findLocators15, excelReading11);
		
		String excelReading12= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 2, 1);
		WebElement findLocators16 = b.findLocators("id","last_name");
		b.giveText(findLocators16, excelReading12);
		
		String excelReading13= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 2, 2);
		WebElement findLocators17 = b.findLocators("id","address");
		b.giveText(findLocators17, excelReading13);
		
		String excelReading14= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 2, 3);
		WebElement findLocators18 = b.findLocators("id","cc_num");
		b.giveText(findLocators18, excelReading14);
	
		WebElement findLocators19 = b.findLocators("name", "cc_type");
	      b.selectClass(findLocators19, 2);
	
		WebElement findLocators21 = b.findLocators("name", "cc_exp_month");
		b.selectClass(findLocators21, 10);
		WebElement findLocators22 = b.findLocators("name", "cc_exp_year");
		b.selectClass(findLocators22, 12);
				
		String excelReading18= b.excelReading("D:\\Hotel.xlsx", "Sheet1", 2, 7);
		WebElement findLocators23 = b.findLocators("xpath","//input[@name='cc_cvv']");
        b.giveText(findLocators23, excelReading18);
        
        WebElement findLocators24 = b.findLocators("name", "book_now");
        findLocators24.click();
        Thread.sleep(5000);
        WebElement findLocators20 = b.findLocators("id", "order_no");
         String attribute = findLocators20.getAttribute("value");
         System.out.println(attribute);
         
       //  b.excelWrite("D:\\success.xlsx", "test1", 0, 0, attribute);        
      b.driver.close();
		
	}

}
