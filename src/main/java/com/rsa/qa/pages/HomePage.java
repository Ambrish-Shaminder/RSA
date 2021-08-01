package com.rsa.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsa.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage()  {
	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[contains(text(),'Courses')]")
	WebElement coursesLink;

	public void clickCourses() {
		coursesLink.click();		
	}
		
		
//	@FindBy(xpath="//ul[@class='makeFlex font12']//li[@class='menu_Flights']")
//	WebElement flights_header;
	
//	@FindBy(xpath="//ul[@class='makeFlex font12']//li[@class='menu_Hotels']")
//	WebElement Hotel_header;
//	
//	@FindBy (xpath= "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/p[1]")
//	WebElement btn_signin;
//	
//	@FindBy (xpath = "//a[@data-cy='mmtLogo']")
//	WebElement mmt_logo;
//	
//	@FindBy (xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/p[2]")
//	WebElement btn_currency;
//	
//	@FindBy (xpath= "//*[@class='chNavText darkGreyText']")
//	List<WebElement> header_elements;						//imp to remember , why List , why not arrayList, List is an interface?
//	
//	public FlightsPage click_flights() {
//		flights_header.click();
//		return new FlightsPage();
//	}
//	
////	public SignIn click_btn_signIn() {
////		btn_signin.click();
////		return new SignIn();
////	}
//	
//	public HomePage click_mmt_logo() {
//		
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		 executor.executeScript("arguments[0].click();",mmt_logo );
//		
//		//mmt_logo.click();
//		return new HomePage();
//	}
//	
//	public String click_btn_currency() {
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		 executor.executeScript("arguments[0].click();",btn_currency );
//		System.out.println(btn_currency.getText());
//		return btn_currency.getText();
//	}
//	
//	public List<String> validate_header_elements() {
//		List<String> al= new ArrayList<String>();
//		for (WebElement e:header_elements) {
//			al.add(e.getText().toString());
//		}
//		
//		System.out.println(al.toString());
//		
//		return al;
	}
	

