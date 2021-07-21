package com.rsa.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.rsa.qa.base.BaseClass;
import com.rsa.qa.pages.FlightsPage;
import com.rsa.qa.pages.HomePage;

class FlightsPageTest extends BaseClass{

	FlightsPage fp;
	HomePage hp;
	
			
	@BeforeMethod 
	public void setup() {
		initialize_driver();
		
		
	}

	@Test (priority=1)
	public void click_btn_login_test() throws Exception {
	//	hp.click_btn_login();
		Thread.sleep(10000);
	}
	
	@Test (priority=2)
	public void verify_flights_title_test() {
		//fp=hp.click_flights();
		//hp.click_flights();
		
		String fp_Title= fp.verify_flights_title();
		Assert.assertEquals(fp_Title, "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip", "The Title of Flights Page does not match");
	}
	
	@Test (priority= 3)
	public void from_City_selection_test() throws Exception {
		hp.click_mmt_logo();
		fp.from_City_selection();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
