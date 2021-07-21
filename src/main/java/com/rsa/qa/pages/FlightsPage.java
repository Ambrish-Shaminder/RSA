package com.rsa.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsa.qa.base.BaseClass;

public class FlightsPage extends BaseClass {   // error says = add constructor coz exception at Base class, default constructor cant handle exception so we need to create a no arg const

	public FlightsPage()  {
		PageFactory.initElements(driver, this);
	}			

	@FindBy (xpath= "//li[@class='selected']")
	WebElement one_way;
		 
	@FindBy (xpath= "//div[@class='pushRight']")
	WebElement book_flight_link;
	
	@FindBy (xpath= "//span[contains(text(),'From')]")
	WebElement from_City;
	
	@FindBy (xpath= "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement enter_from_city;
	
	public String verify_flights_title () {
		return driver.getTitle();
	}
	
	public String validate_bookFlightLink_text() {
		return book_flight_link.getText();
	}

	public void from_City_selection() throws Exception {
		
		//Select select_city = new Select(from_City); 
		//select_city.selectByVisibleText("Chandigarh");
		from_City.click();
		enter_from_city.sendKeys("Chandigarh, India");
		Thread.sleep(2000);
		enter_from_city.sendKeys(Keys.DOWN);
		enter_from_city.sendKeys(Keys.ENTER);
	}

}
