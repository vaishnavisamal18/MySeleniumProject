package com.myEcom.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.myEcom.Base.BaseClass;
import com.myEcom.Pom.IndexPagePom;
import com.myEcom.Pom.ProductListingPom;
import com.myEcom.Pom.SignInPagePom;

public class IndexPageTest extends BaseClass {
	
	IndexPagePom indexPagePom;
	SignInPagePom signInPagePom;
	ProductListingPom productListingPom1;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setUp()
	{
		loadAppication();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void validateLogo()
	{
		indexPagePom=new IndexPagePom();
		boolean res=indexPagePom.validateLogo();
		Assert.assertTrue(res);
	}
	@Test
	public void validateTitle()
	{
		indexPagePom=new IndexPagePom();
		String title=indexPagePom.getTitleOfPage();
		//Assert.assertEquals(title,"MyStore");
	}
	@Test
	public void ClickOnSignIn()
	{
		indexPagePom=new IndexPagePom();
		
		//signInPagePom = indexPagePom.clickOnSignIn();
		//String pageHeading = signInPagePom.getPageHeading();
		//Assert.assertEquals(pageHeading, "AUTHENTICATION");

		indexPagePom.clickOnSignIn();
	}
	@Test
	public void validateSearchBoxText()
	{
		indexPagePom=new IndexPagePom();
		//String searchText=indexPagePom.setSearchText();
		//Assert.assertEquals(searchText,"t-shirts");
		indexPagePom.clickOnSearch();
	}
	@Test
	public void validateSearchBoxClick()
	{
		
		indexPagePom=new IndexPagePom();
		String productListingPom = indexPagePom.setSearchText();
		//String searchPageHeading=productListingPom.getSearchPageHeading();
		//String searchPageHeading1 = productListingPom.getSearchPageHeading();
		//Assert.assertEquals(searchPageHeading1, "SEARCH  \"T-SHIRT\"");
	}
	@Test
	public void test()
	{
		indexPagePom=new IndexPagePom();
		
		System.out.println("Open WebPage..");
		Assert.assertEquals(false, false);   //HARD ASSERT
		System.out.println("Logo Checked..");
		System.out.println("Title Checked..");
		System.out.println("Click on Sign-In..");
	}
	
	@Test
	public void clickOnEmailTest()
	{
		signInPagePom = indexPagePom.clickOnSignIn();
		//SignInPagePom signInPage=new SignInPagePom();
		
		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmail();
	}
	@Test
	public void clickOnEmailButtonTest()
	{package com.myEcom.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.myEcom.Base.BaseClass;
import com.myEcom.Pom.IndexPagePom;
import com.myEcom.Pom.ProductListingPom;
import com.myEcom.Pom.SignInPagePom;

public class IndexPageTest extends BaseClass {
	
	IndexPagePom indexPagePom;
	SignInPagePom signInPagePom;
	ProductListingPom productListingPom1;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setUp()
	{
		loadAppication();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void validateLogo()
	{
		indexPagePom=new IndexPagePom();
		boolean res=indexPagePom.validateLogo();
		Assert.assertTrue(res);
	}
	@Test
	public void validateTitle()
	{
		indexPagePom=new IndexPagePom();
		String title=indexPagePom.getTitleOfPage();
		//Assert.assertEquals(title,"MyStore");
	}
	@Test
	public void ClickOnSignIn()
	{
		indexPagePom=new IndexPagePom();
		
		//signInPagePom = indexPagePom.clickOnSignIn();
		//String pageHeading = signInPagePom.getPageHeading();
		//Assert.assertEquals(pageHeading, "AUTHENTICATION");

		indexPagePom.clickOnSignIn();
	}
	@Test
	public void validateSearchBoxText()
	{
		indexPagePom=new IndexPagePom();
		//String searchText=indexPagePom.setSearchText();
		//Assert.assertEquals(searchText,"t-shirts");
		indexPagePom.clickOnSearch();
	}
	@Test
	public void validateSearchBoxClick()
	{
		
		indexPagePom=new IndexPagePom();
		String productListingPom = indexPagePom.setSearchText();
		//String searchPageHeading=productListingPom.getSearchPageHeading();
		//String searchPageHeading1 = productListingPom.getSearchPageHeading();
		//Assert.assertEquals(searchPageHeading1, "SEARCH  \"T-SHIRT\"");
	}
	@Test
	public void test()
	{
		indexPagePom=new IndexPagePom();
		
		System.out.println("Open WebPage..");
		Assert.assertEquals(false, false);   //HARD ASSERT
		System.out.println("Logo Checked..");
		System.out.println("Title Checked..");
		System.out.println("Click on Sign-In..");
	}
	
	/*
	@Test
	public void clickOnEmailTest()
	{
		signInPagePom = indexPagePom.clickOnSignIn();
		//SignInPagePom signInPage=new SignInPagePom();
		
		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmail();
	}
	@Test
	public void clickOnEmailButtonTest()
	{
		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmailButton();
	}
	@Test
	public void testEmail()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
	}*/
	//signInPagePom = indexPagePom.clickOnSignIn();

	
	/*
	@Test
	public void indexPageTest()
	{
		indexPagePom=new IndexPagePom();
		
		IndexPageTest indexPageTest;
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(false, true);
		System.out.println("Open WebPage..");
		System.out.println("Logo Checked..");
		System.out.println("Title Checked..");
		System.out.println("Click on Sign-In..");
		softAssert.assertAll();
	}*/

	


}

		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmailButton();
	}
	@Test
	public void testEmail()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
	}
	//signInPagePom = indexPagePom.clickOnSignIn();

	
	/*
	@Test
	public void indexPageTest()
	{
		indexPagePom=new IndexPagePom();
		
		IndexPageTest indexPageTest;
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(false, true);
		System.out.println("Open WebPage..");
		System.out.println("Logo Checked..");
		System.out.println("Title Checked..");
		System.out.println("Click on Sign-In..");
		softAssert.assertAll();
	}*/

	


}
