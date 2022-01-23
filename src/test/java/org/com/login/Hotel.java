package org.com.login;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hotel extends BaseClassLearning {
	
	@Test(dataProvider = "sampledata")
	private void tc1(String username,String password,String index,String index1,String index2,String index3,String index4,
			String index5,String index6,String index7,String firstname,String lastname,String address,
			String card,String index8,String index9,String index10,String index11) throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/index.php");
		WebElement txtuser = findLocators("id", "username");
		WebElement txtpass = findLocators("id", "password");
		giveText(txtuser, username);
		giveText(txtpass, password);
		findLocators("id", "login").click();
		WebElement findLocators = findLocators("id", "location");
		selectClass1(findLocators, index);
		WebElement findLocators1 = findLocators("id", "hotels");
		selectClass1(findLocators1, index1);
		WebElement findLocators2 = findLocators("id", "room_type");
		selectClass1(findLocators2, index2);
		WebElement findLocators3 = findLocators("id", "room_nos");
		selectClass1(findLocators3, index3);
		WebElement findLocators4 = findLocators("id", "datepick_in");
		findLocators4.clear();
		giveText(findLocators4, index4);
		WebElement findLocators5 = findLocators("id", "datepick_out");
		findLocators5.clear();
		giveText(findLocators5, index5);
		WebElement findLocators6 = findLocators("id", "adult_room");
		selectClass1(findLocators6, index6);
		WebElement findLocators7 = findLocators("id", "child_room");
		selectClass1(findLocators7, index7);
		Thread.sleep(3000);
		findLocators("id", "Submit").click();
		findLocators("id", "radiobutton_0").click();	
		findLocators("id", "continue").click();
		WebElement findLocators8 = findLocators("id", "first_name");
		giveText(findLocators8, firstname);
		WebElement findLocators9 = findLocators("id", "last_name");
		giveText(findLocators9, lastname);
		WebElement findLocators10 = findLocators("id", "address");
		giveText(findLocators10, address);
		WebElement findLocators11 = findLocators("id", "cc_num");
		giveText(findLocators11, card);
		WebElement findLocators12 = findLocators("id", "cc_type");
		selectClass1(findLocators12, index8);
		WebElement findLocators13 = findLocators("id", "cc_exp_month");
		selectClass1(findLocators13, index9);
		WebElement findLocators14 = findLocators("id", "cc_exp_year");
		selectClass1(findLocators14, index10);
		WebElement findLocators15 = findLocators("id", "cc_cvv");
        giveText(findLocators15, index11);
        WebElement findLocators16 = findLocators("id", "book_now");
        findLocators16.click();
        Thread.sleep(5000);
      WebElement findLocators17 = findLocators("id", "order_no");
      String attribute = findLocators17.getAttribute("value");
      System.out.println(attribute);
		
    
	}
	@DataProvider(name="sampledata")
	private Object[][] tc2() throws Exception {
		return new Object[][] {
			{excelInput(0, 0),excelInput(0, 1),excelInput(0, 2),excelInput(0, 3),excelInput(0, 4),
				excelInput(0, 5),excelInput(0, 6),excelInput(0, 7),excelInput(0, 8),
				excelInput(0, 9),excelInput(1, 0),excelInput(1, 1),excelInput(1, 2),excelInput(1, 3),
				excelInput(1, 4),excelInput(1, 5),excelInput(1, 6),excelInput(1, 7)
					}
			
		};
	}

}
