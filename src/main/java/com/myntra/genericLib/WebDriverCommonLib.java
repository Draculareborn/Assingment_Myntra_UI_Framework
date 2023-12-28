package com.myntra.genericLib;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * This class contains methods related to WebDriver
 * @author Bhaskar
 *
 */
public class WebDriverCommonLib extends BaseTest {
	
	/**
	 * This method is used to get page title
	 * @return String
	 */
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * This method is used to wait for page title
	 * @param title
	 */
	public void waitForPageTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	/**
	 * This method is used to select options using WebElement address and text
	 * @param address
	 * @param text
	 */
	public void selectOptions(WebElement address, String text)
	{
		Select sel = new Select(address);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to select option using WebElement address and value
	 * @param value
	 * @param address
	 */
	public void selectOptions(String value , WebElement address)
	{
		Select sel = new Select(address);
		sel.selectByValue(value);
	}
	
	/**
	 * This method is used to select option using WebElement address and index
	 * @param address
	 * @param index
	 */
	public void selectOptions(WebElement address , int index)
	{
		Select sel = new Select(address);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method is used for verification
	 * @param expected
	 * @param actual
	 * @param message
	 */
	public void verify(String expected , String actual, String message)
	{
		if(expected.equals(actual))
		{
			Reporter.log(message+" is Verified", true);
		}
		else
		{
			Reporter.log(message+" is not Verified", true);
		}
	}
	
	/**
	 * This method is used to switch to open tabs
	 * 
	 * @param element
	 */
	public void switchTab(int index) {
		{
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(w.get(index));
		}
	}
	
	/**
	 * This method is used to close to open tabs
	 * 
	 * @param element
	 */
	public void closeTab(int index) {
		{
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(w.get(index));
			driver.close();
		}
	}

}
