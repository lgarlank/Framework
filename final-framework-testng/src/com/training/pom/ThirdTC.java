package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ThirdTC {
private WebDriver driver; 
	
	public ThirdTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='New Launch ']")
	private WebElement ApartmentTab; 
	

	
	@FindBy(id="keyword_search")
	private WebElement address;
	
	@FindBy(name="_property_type")
	private WebElement propertytype; 
	
	@FindBy(xpath="//*[@id='realteo-search-form']/div[2]/div[2]/div/div/ul/li[2]")
	private WebElement taxregion; 

	

	@FindBy(xpath="//*[@class='button fullwidth']")
	private WebElement Search; 
	

	
	public void ApartmentTab(){
		Actions mh = new Actions(driver);
		mh.moveToElement(ApartmentTab).click().build().perform();	
	}
	

	public void address(String address) throws AWTException, InterruptedException {
		this.address.sendKeys(address);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	public void propertytype() {
		System.out.println("Select status is : " +propertytype.isEnabled());
		driver.findElement(By.xpath("//*[@id='_property_type_chosen']/a/span")).click();
		System.out.println(" selectable value is : " + driver.findElement(By.xpath("//*[@id='_property_type_chosen']/a/span")).getText());
		driver.findElement(By.xpath("//*[@id='_property_type_chosen']/div/ul/li[3]")).click();
			
//		dropdown1.selectByVisibleText("Plots");	
	}
	
	public void taxregion() {
		driver.findElement(By.xpath("//*[@id='realteo-search-form']/div[2]/div[2]/div")).click();
		this.taxregion.click();
	}
	
	
	public void Search() {
		this.Search.click();
	}
	
}