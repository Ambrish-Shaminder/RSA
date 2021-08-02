package com.rsa.qa.testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsa.qa.base.BaseClass;
import com.rsa.qa.pages.HomePage;

import ExcelReadUtil.ExcelReadUtil;

public class HomePageTest extends BaseClass{
	HomePage hp;
	ExcelReadUtil er;

	Logger l1=Logger.getLogger(HomePageTest.class);

	@BeforeMethod
	public void setup() {
		initialize_driver();
		hp=new HomePage();
		er= new ExcelReadUtil();
	}

	@Test
	public void validate_header_elements_test() {
		l1.info("****************************** Starting test cases execution  *****************************************");
//		//hp.click_btn_currency();
//		List<String> al1=hp.validate_header_elements();
//		StringBuilder strbl=new StringBuilder();
//		for(String str: al1)
//		{
//			strbl.append(str);
//
//			  strbl.append(", ");
//
//		}
//
//		String str=strbl.toString();
//
//		Assert.assertEquals(er.getData("Sheet1",1,0), str);

		//Utility.takeSnapShot(driver, "C:\\Users\\ambri\\OneDrive\\Desktop\\ScrShots\\1.png");
		driver.close();
	}






}
