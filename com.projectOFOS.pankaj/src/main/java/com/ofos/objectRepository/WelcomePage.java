package com.ofos.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
//initialization
	public WelcomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//decleration
	@FindBy(xpath="//a[text()='Home ']") private WebElement homeLink;
	@FindBy(xpath="//a[text()='Restaurants ']") private WebElement restaurnentLink;
	@FindBy(xpath="//a[text()='Login']") private WebElement loginLink;
	@FindBy(xpath="//a[text()='Register']") private WebElement registerLink;
	
	//Utilization
	public WebElement getHomeLink() {
		return homeLink;
	}
	public WebElement getRestaurnentLink() {
		return restaurnentLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	
	
}
