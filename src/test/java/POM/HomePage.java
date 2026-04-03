package POM;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.BaseClass;

public class HomePage extends BaseClass {
	
	public static final By homeTitle=By.xpath("//title[contains(text(),'Online Shopping site in India: ')]");
	public static String hTitle="";
	
	public String getTitle() {
		try {
		hTitle=driver.findElement(homeTitle).getText();
		return hTitle;
		}catch(Exception e) {
			Assert.fail("Failed to get the title of the page");
		}
		return null;
	}
	

	
	public Boolean verifyTitle(String t) {
		
		try {
		if(t.contains(getTitle()))
			return true;
		}catch(Exception e) {
			Assert.assertFalse("The title verification failed",false);
		}
		return false;
	}
	
	public static final By pincode=By.xpath("//span[@id='glow-ingress-line2']");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void clickPinCode() {	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(pincode))).click();
	}
	
	public static final By chooseLocation=By.xpath("//h4[text()='Choose your location']");
	public void verifyChooseYourLocation() {
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(driver.findElement(chooseLocation)));
		if(ele.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	
	public void clickLocation(String loc) {
		By clickLocation=By.xpath("//input[contains(@aria-label,'"+loc+"')]");
		driver.findElement(clickLocation).click();	
	}
	
	public void verifyLocation(String pin) {
		String pincodeLoc=driver.findElement(pincode).getText();
		if(pincodeLoc.contains(pin))
			Assert.assertTrue(true);
	}
	
	
	
	
	public static final By updatepincode=By.xpath("//input[@id='GLUXZipUpdateInput']");
	public void enterPincode(String code) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(updatepincode))).click();
		driver.findElement(updatepincode).sendKeys(code);
	
		
	}
	
	public static final By hApplyButton=By.xpath("//span[text()='Apply']/preceding-sibling::input");
	
	public void clickApply() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(hApplyButton))).click();
	
	}
	

}
