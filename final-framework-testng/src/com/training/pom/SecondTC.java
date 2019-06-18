package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondTC {
private WebDriver driver; 
	
	public SecondTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='New Launch ']")
	private WebElement ApartmentTab; 
	
	@FindBy(xpath="//*[@id='wpmm-megamenu']//*[text()='Donec quis']")
	private WebElement DonecQs; 
	
	@FindBy(name="amount")
	private WebElement amount; 
	
	@FindBy(id="downpayment")
	private WebElement downpayment;
	
	@FindBy(id="years")
	private WebElement loanTerm; 
	
	@FindBy(id="interest")
	private WebElement interestrate; 
	
	@FindBy(xpath ="//*[@class='button calc-button']")
	private WebElement Calculate; 
	
	public void ApartmentTab(){
		Actions mh = new Actions(driver);
		mh.moveToElement(ApartmentTab).build().perform();	
	}
	
	public void DonecQs() {
		this.DonecQs.click(); 
	}
	public void amount(String amount) {
		this.amount.sendKeys(amount);
	}
	public void downpayment(String downpayment) {
		this.downpayment.sendKeys(downpayment);
	}
	
	public void loanTerm(String loanTerm) {
		this.loanTerm.sendKeys(loanTerm);
	}
	
	public void interestrate(String interestrate) {
		this.interestrate.sendKeys(interestrate);
	}
	
	public void Calculate() {
		this.Calculate.click();
	}
	
}
