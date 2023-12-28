package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * This class contains web element of Bag page and their handler methods
 * @author Bhaskar
 *
 */
public class BagPage {
	
	@FindBy(xpath="//a[text()='Kids Red Printed 150 GSM Bath Towel']") private WebElement productNameBag;
	@FindBy(xpath="//div[@class='itemComponents-base-invisibleBackDrop']") private WebElement okGotIt;
	@FindBy(xpath="//button[text()='REMOVE']") private WebElement removeBtn;
	@FindBy(xpath="//button[@class='inlinebuttonV2-base-actionButton ' and text()='REMOVE']") private WebElement removeBtnDialog;
	@FindBy(xpath="//div[@class='emptyCart-base-emptyText' and text()='Hey, it feels so light!']") private WebElement emptyBag;
	
	
	public BagPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * This method is used to click on Ok, Got it
	 */
	public void clickOkGotIt()
	{
		okGotIt.click();
		Reporter.log("Ok, Got it clicked", true);
	}
	
	/**
	 * This method is used to validate same product in card page and bag page
	 */
	public void validateProductInBag()
	{
			String productInBag = productNameBag.getText();
			Assert.assertEquals(productInBag, "Kids Red Printed 150 GSM Bath Towel", "Product not present in Bag");
			Reporter.log("Product present in bag verified", true);
	}
	
	/**
	 * This method is used to click on remove button on bag page
	 */
	public void clickRemoveButton()
	{
		removeBtn.click();
		Reporter.log("Remove button on bag page clicked", true);
	}
	
	/**
	 * This method is used to click on remove button on dialog box
	 */
	public void clickRemoveButtonDialog()
	{
		removeBtnDialog.click();
		Reporter.log("Remove button on dialog clicked", true);
	}
	
	/**
	 * This method is used to validate bag is empty
	 */
	public void validateEmptyBag()
	{
			String emptyBagName = emptyBag.getText();
			Assert.assertEquals(emptyBagName, "Hey, it feels so light!", "Bag is not empty");
			Reporter.log("Bag is empty verified", true);
	}

}
