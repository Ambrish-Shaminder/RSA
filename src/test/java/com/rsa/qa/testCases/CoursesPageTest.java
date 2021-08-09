package com.rsa.qa.testCases;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rsa.qa.base.BaseClass;
import com.rsa.qa.pages.CoursesPage;
import com.rsa.qa.pages.HomePage;

import ExcelReadUtil.ExcelReadUtil;

public class CoursesPageTest extends BaseClass {

	CoursesPage cp;
	HomePage hp;

	@BeforeMethod
	public void setup () {
		initialize_driver();
		hp= new HomePage();
		cp=new CoursesPage();
		hp.clickCourses();
	}

	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException
	{

		ArrayList<Object[]> testData = ExcelReadUtil.getDataFromExcel();
		return testData.iterator();
	}


	@Test(priority=1, dataProvider="getTestData")
	public void verify_title_coursesPage(String title) {
		String coursePageTitle= cp.verify_coursePage_Title();
		Assert.assertEquals(coursePageTitle, title);
	}

	@Test
	public void verify_search_for_postman_course() {
		cp.searchPostmanCourse();
		System.out.println(cp.Postman_course_title());
		Assert.assertEquals(cp.Postman_course_title(), "Learn Postman for API Automation Testing with Javascript");
	}

	@Test
	public void verify_courses_on_clicking_AdminUser() throws InterruptedException {
		cp.click_category_All();
		cp.click_author_AdminUser();
		Assert.assertEquals(cp.header_adminUser(), "AdminUser");
	}
	//test for git
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
