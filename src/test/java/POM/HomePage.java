package POM;

import org.junit.Assert;
import org.openqa.selenium.By;

import BasePackage.BaseClass;

public class HomePage extends BaseClass {
	
	public static final By homeTitle=By.xpath("//title[contains(text(),'Online Shopping site in India: ')]");
	public static String hTitle="";
	
	public String getTitle() {
		hTitle=driver.findElement(homeTitle).getText();
		return hTitle;
	}
	

	
	public Boolean verifyTitle(String t) {
		if(t.contains(getTitle()))
			return true;
		else
		return false;
	}
	
	


}
