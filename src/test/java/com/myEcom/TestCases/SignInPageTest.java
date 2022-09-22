package com.myEcom.TestCases;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myEcom.Base.BaseClass;
import com.myEcom.Pom.IndexPagePom;
import com.myEcom.Pom.SignInPagePom;
import com.myEcom.Utility.ExcelSheetHandle;

public class SignInPageTest extends BaseClass {
	
	ExcelSheetHandle data = new ExcelSheetHandle();
	IndexPagePom indexPagePom;
	SignInPagePom signInPagePom;
	
	@BeforeMethod
	public void setUp()
	{
		loadAppication();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void clickOnEmailTest() // samalvaishu
	{
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignIn();
		
		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmail();
	}
	@Test
	public void clickOnEmailButtonTest()
	{
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignIn();
		
		
		signInPagePom=new SignInPagePom();
		signInPagePom.clickOnEmailButton();
		
	//	String url=driver.getCurrentUrl();
	//	Assert.assertEquals(url,"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		// New comment by pritam to check push pull.
		//hi this is my change
		//change by poonam
	}
	
	@Test
	public void login() throws FileNotFoundException, InterruptedException// abc@
	{
		Sheet sh = data.getSheet(data.getExcelFile(), "login");
		Map<String, Object> logindata = data.getExcelSheetData(sh);
		indexPagePom = new IndexPagePom();
		signInPagePom = indexPagePom.clickOnSignIn();
		signInPagePom.setLoginText((String)logindata.get("username"), (String)logindata.get("password"));
		Thread.sleep(3000);

	}
	@Test
	public void singUp() throws FileNotFoundException, InterruptedException //abc@
	{
		Sheet sh=data.getSheet(data.getExcelFile(), "signup");
		String signupmail=data.getSingleStringValue(sh,1,0);
		indexPagePom=new IndexPagePom();
		signInPagePom=indexPagePom.clickOnSignIn();
		signInPagePom.setCreateAccountEmail(signupmail);
		Thread.sleep(3000);
		
		
	}
	
}
