package com.rsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsa.qa.base.BaseClass;

public class CoursesPage extends BaseClass {
	
	CoursesPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//a[contains(text(),'Courses')]")
	WebElement coursesLink;
	
	@FindBy (xpath= "//label[contains(text(),'Find a product')]")
	WebElement searchBox;
	
	@FindBy (xpath= "//button[@id='search-course-button']")
	WebElement btn_search;
	
	@FindBy (xpath="//*[@title='Learn Postman for API Automation Testing with Javascript']")
	WebElement postmanCourseTitle;
	
	void searchPostmanCourse(){
		searchBox.sendKeys("postman");
		btn_search.click();		
	}
	
	
	
	
	
	

}
