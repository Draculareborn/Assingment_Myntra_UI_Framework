package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


/**
 * This class contains elements and methods to handle the Gulaab Jaipur Product Page
 * @author Bhaskar Singh
 *
 */
public class GulaabJaipurProductPage {
	
	@FindBy(xpath="//h1[text()='Blue Printed 150 GSM Organic cotton Bath Towel']") private WebElement productName;
	@FindBy(xpath="//span[text()='WISHLIST']") private WebElement wishlistButton;
	@FindBy(xpath="//div[@class='welcome-header' and text()='Login ']") private WebElement loginPage;
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']") private WebElement addToBagButton;
	@FindBy(xpath="//span[text()='Bag']") private WebElement bagIcon;
	
	
	
	public GulaabJaipurProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is used to click on wishlist button
	 */
	public void clickWishlistButton()
	{
		wishlistButton.click();
		Reporter.log("Wishlist button clicked", true);
	}
		
	/**
	 * This method is used to validate login page displayed
	 */
	public void validateLoginPage()
	{
			String pageNameActual = loginPage.getText();
			Assert.assertEquals(pageNameActual, "Login or Signup", "Login Page not Displayed");
			Reporter.log("Login Page verified", true);
	}
	
	/**
	 * This method is used to click on Add to Bag button
	 */
	public void clickAddToBagButton()
	{
		addToBagButton.click();
		Reporter.log("Add to bag button clicked", true);
	}
	
	/**
	 * This method is used to click on Bag Icon
	 */
	public void clickOnBagIcon()
	{
		bagIcon.click();
		Reporter.log("Bag icon clicked", true);
	}
	
	/**
	 * This method is used to validate same product name in product page as entered in search
	 */
	public void validateProductName()
	{
			String productNameProductPage = productName.getText();
			Assert.assertEquals(productNameProductPage, "Blue Printed 150 GSM Organic cotton Bath Towel", "Product not same");
			Reporter.log("Product name is same verified", true);
	}
	
	
	
}
