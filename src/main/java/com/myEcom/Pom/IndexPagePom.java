package com.myEcom.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myEcom.Base.BaseClass;

public class IndexPagePom extends BaseClass
{
	public IndexPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(xpath= "//a[@class='login']")
	WebElement signin;
	
	@FindBy(id="search_query_top")
	WebElement searchProductbox;
	
	@FindBy(xpath="//div[@class=\'header_user_info\']")
	WebElement searchButton;
	
	//@FindBy(xpath="//div[@class=\'header_user_info\']")
	//WebElement signInButton;
	
	
	
	public boolean validateLogo()
	{
		if(logo.isDisplayed())
		{
			System.out.println("logo displayed");
			System.out.println("trying git code......");
			System.out.println("getting in");
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getTitleOfPage()
	{
		String getTitle= driver.getTitle();
		return getTitle;
	}
	
	public SignInPagePom clickOnSignIn()
	{
		signin.click();
	    return new SignInPagePom();
		
	}
	public String setSearchText()
	{
		searchProductbox.sendKeys("t-shirts");
		System.out.println("in getSearchText,,");
		return null;
		
	}
	public ProductListingPom clickOnSearch()
	{
		searchButton.click();
		return new ProductListingPom();
		
	}
	public ProductListingPom clickOnSignInButton()
	{
		signin.click();
		return new ProductListingPom();
		
	}
	
	
	/*
	public String getPageHeading()
	{
		String PageHeading=signInPageHeading.getText();
		return pageHeading;
	}*/
	

}
