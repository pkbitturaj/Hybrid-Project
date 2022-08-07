package com.ofos.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//initialization
	public HomePage(WebDriver diver ) {
		PageFactory.initElements(diver, this);
	}
	
	//Decleration
	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']/../..//a[text()='Order Now']") 
	private WebElement yorkshireLambPattiesBtn;
	@FindBy(xpath="//a[text()='Lobster Thermidor']/../..//a[text()='Order Now']")
	private WebElement lobsterThermidorBtn;
	@FindBy(xpath="//a[text()='Chicken Madeira']/../..//a[text()='Order Now']")
	private WebElement chickenMadeiraBtn;
	@FindBy(xpath="//a[text()='Stuffed Jacket Potatoes']/../..//a[text()='Order Now']")
	private WebElement stuffedJacketPotatoesBtn;
	@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']/../..//a[text()='Order Now']")
	private WebElement pinkSpaghettiGamberoniBtn;
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']/../..//a[text()='Order Now']")
	private WebElement cheesyMashedPotatoBtn;
	@FindBy(xpath="//a[@class='selected']") 
	private WebElement allFoodLink;
	@FindBy(xpath="//a[text()=' Continental']")
	private WebElement continentalFoodLink;
	@FindBy(xpath="//a[text()=' Italian']")
	private WebElement italianFoodLink;
	@FindBy(xpath="//a[text()=' Chinese']")
	private WebElement chineseFoodLink;
	@FindBy(xpath="//a[text()=' American']")
	private WebElement americanFoodLink;
	@FindBy(xpath="//a[text()='North Street Tavern']")
	private WebElement  selectRestnorthStreetTanern;
	@FindBy(xpath="//a[text()='Eataly']")
	private WebElement selectRestEataly;
	@FindBy(xpath="//a[text()='Nan Xiang Xiao Long Bao']")
	private WebElement selectRestNanXiang;
	@FindBy(xpath="//a[text()='Highlands Bar & Grill']")
	private WebElement selectRestHighlands;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logouLink;
	//home page is complited
	//home page is complited and certified
	//hello
	
	
	
	
}
