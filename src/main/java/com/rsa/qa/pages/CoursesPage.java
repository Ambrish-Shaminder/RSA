package com.rsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsa.qa.base.BaseClass;

public class CoursesPage extends BaseClass {

	public CoursesPage () {
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//a[contains(text(),'Courses')]")
	WebElement coursesLink;

	@FindBy (xpath= "//input[@id='search-courses']")
	WebElement searchBox;

	@FindBy (xpath= "//button[@id='search-course-button']")
	WebElement btn_search;

	@FindBy (xpath="//*[@title='Learn Postman for API Automation Testing with Javascript']")
	WebElement postmanCourseTitle;

	@FindBy (xpath= "//button[@class='btn btn-default btn-lg btn-course-filter dropdown-toggle' and contains(text(),'All')] ")
	WebElement btn_Category;

	@FindBy (xpath= "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement btn_Author;

	@FindBy (xpath="//h2[contains(text(),'AdminUser')]")
	WebElement hdr_adminUser;

	@FindBy (xpath="//a[@href='/courses/author/1093849']")
	WebElement link_adminUser;

	public String verify_coursePage_Title() {
		return driver.getTitle();
	}

	public void searchPostmanCourse(){
		searchBox.click();
		searchBox.sendKeys("postman");
		btn_search.click();
	}

	public String Postman_course_title() {
		return postmanCourseTitle.getText();
	}

	public void click_category_All() {
		btn_Category.click();
	}

	public void click_author_AdminUser() {
		btn_Author.click();
		link_adminUser.click();

	}

	public String header_adminUser() {
		return hdr_adminUser.getText();
	}

}
