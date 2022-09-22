package com.myEcom.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myEcom.Base.BaseClass;

public class SignInPagePom extends BaseClass {
	public SignInPagePom()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailTextBox;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium exclusive']")
	WebElement createButton;	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement loginEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signInReg;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createAccEmail;
	
	@FindBy(xpath="//h1[@text()='Authentication']")
	WebElement signInPageHeading;
	
	
	public String getPageHeading1()
	{
		String pageHeading=signInPageHeading.getText();
		return getPageHeading();
	}
	public void setCreateAccounEmail(String email)
	{
		emailTextBox.sendKeys(email);
		
	}
	public void clickOnEmail()
	{
		emailTextBox.sendKeys("samalvaishu1823@gmail.com");
	}
	public void clickOnEmailButton()
	{
		createButton.click();	
		
	}
	
	public void setLoginText(String username,String password)
	{
		loginEmail.sendKeys(username);
		loginPassword.sendKeys(password);
		
	}
	

	public String getPageHeading() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCreateAccountEmail(String signupmail) {
		
		// TODO Auto-generated method stub
		
	}

}
