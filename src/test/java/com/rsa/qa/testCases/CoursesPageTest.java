package com.rsa.qa.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsa.qa.base.BaseClass;
import com.rsa.qa.pages.CoursesPage;
import com.rsa.qa.pages.HomePage;

public class CoursesPageTest extends BaseClass {
	
	CoursesPage cp;
	HomePage hp;
	
	@BeforeMethod
	public void setup () {
		initialize_driver();
		hp.clickCourses();
	}
	
	@Test
	public void verify_title_coursesPage() {
		String title_coursesPage= driver.getTitle();
		System.out.println(title_coursesPage);
		//assert.assertEquals(title_coursesPage, "");
	}
	

}
