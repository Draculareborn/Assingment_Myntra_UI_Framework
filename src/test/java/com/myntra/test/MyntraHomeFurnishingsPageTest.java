package com.myntra.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genericLib.BaseTest;
import com.myntra.genericLib.FileLib;
import com.myntra.genericLib.WebDriverCommonLib;
import com.myntra.pages.BagPage;
import com.myntra.pages.GulaabJaipurProductPage;
import com.myntra.pages.MyntraHomeFurnishingsPage;

@Listeners(com.myntra.genericLib.MyListener.class)
public class MyntraHomeFurnishingsPageTest extends BaseTest {
	
	
	@Test(priority=1 ,description = "Test for appling catgories and brand", enabled = true)
	public void filtersTest() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		MyntraHomeFurnishingsPage mhfp = new MyntraHomeFurnishingsPage(driver);
		
		//Validate Home Furnishings Page
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home Furnishings", 1, 0), wlib.getPageTitle(), "Home Furnishings Page");
		
		//Click category search icon
		mhfp.clickCategoriesSearchIcon();
		
		//Send category Bath Towels
		mhfp.sendCategories("Bath Towels");
		
		//Click Bath Towels checkbox
		mhfp.clickCategoriesCheckbox();
		
		//Click brand search icon
		mhfp.clickBrandSearchIcon();
		
		//Send brand Gulaab Jaipur
		mhfp.sendBrand("Gulaab Jaipur");
		
		//Click Gulaab Jaipur checkbox
		mhfp.clickBrandCheckbox();
		
		Thread.sleep(2000);
		
		//Validate displayed brand
		mhfp.validateBrands();
		
		//Close tab
		wlib.closeTab(0);
			
	}
	
	@Test(priority=2 ,description = "Test for login page displayed when clicked on whishlist for not signed in user", enabled = true)
	public void wishlistTest() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		MyntraHomeFurnishingsPage mhfp = new MyntraHomeFurnishingsPage(driver);
		GulaabJaipurProductPage gjpp = new GulaabJaipurProductPage(driver);
		
		
		//Validate Home Furnishings Page
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home Furnishings", 1, 0), wlib.getPageTitle(), "Home Furnishings Page");
		
		//Click category search icon
		mhfp.clickCategoriesSearchIcon();
		
		//Send category Bath Towels
		mhfp.sendCategories("Bath Towels");
		
		//Click Bath Towels checkbox
		mhfp.clickCategoriesCheckbox();
		
		//Click brand search icon
		mhfp.clickBrandSearchIcon();
		
		//Send brand Gulaab Jaipur
		mhfp.sendBrand("Gulaab Jaipur");
		
		//Click Gulaab Jaipur checkbox
		mhfp.clickBrandCheckbox();
		
		Thread.sleep(2000);
		
		//Click first product from filtered product
		mhfp.clickFirstProduct();
		
		//Switch to product page tab
		wlib.switchTab(1);
		
		//Click on Wishlist button
		gjpp.clickWishlistButton();
		
		//Validate Login page displayed as user not logged in
		gjpp.validateLoginPage();
		
		//Close product page tab
		wlib.closeTab(1);
		
		//Switch back to Home Furnishing page
		wlib.switchTab(0);
		
		Thread.sleep(2000);
		//Close tab
		wlib.closeTab(0);
	}
	
	@Test(priority=3 ,description = "Test for adding product to bag", enabled = true)
	public void bagTest() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		MyntraHomeFurnishingsPage mhfp = new MyntraHomeFurnishingsPage(driver);
		GulaabJaipurProductPage gjpp = new GulaabJaipurProductPage(driver);
		BagPage bp = new BagPage(driver);
		
		//Validate Home Furnishings Page
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home Furnishings", 1, 0), wlib.getPageTitle(), "Home Furnishings Page");
		
		//Click category search icon
		mhfp.clickCategoriesSearchIcon();
		
		//Send category Bath Towels
		mhfp.sendCategories("Bath Towels");
		
		//Click Bath Towels checkbox
		mhfp.clickCategoriesCheckbox();
		
		//Click brand search icon
		mhfp.clickBrandSearchIcon();
		
		//Send brand Gulaab Jaipur
		mhfp.sendBrand("Gulaab Jaipur");
		
		//Click Gulaab Jaipur checkbox
		mhfp.clickBrandCheckbox();
		
		Thread.sleep(2000);
		
		//Click first product from filtered product
		mhfp.clickFirstProduct();
		
		//Switch to product page tab
		wlib.switchTab(1);
		
		//Click on Add to Bag button
		gjpp.clickAddToBagButton();
		
		//Click on Bag Icon
		gjpp.clickOnBagIcon();
		
		//Click ok got it
		bp.clickOkGotIt();
		
		Thread.sleep(2000);
		//Verify product in Bag
		bp.validateProductInBag();
		
		//To close current tab
		wlib.closeTab(1);
		
		//To switch back to parent tab and close tab
		wlib.switchTab(0);
		
		Thread.sleep(2000);
		//Close tab
		wlib.closeTab(0);
	}
	
	@Test(priority=4 ,description = "Test for removing product from bag", enabled = true)
	public void removeProductTest() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		MyntraHomeFurnishingsPage mhfp = new MyntraHomeFurnishingsPage(driver);
		GulaabJaipurProductPage gjpp = new GulaabJaipurProductPage(driver);
		BagPage bp = new BagPage(driver);
		
		//Validate Home Furnishings Page
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home Furnishings", 1, 0), wlib.getPageTitle(), "Home Furnishings Page");
		
		//Click category search icon
		mhfp.clickCategoriesSearchIcon();
		
		//Send category Bath Towels
		mhfp.sendCategories("Bath Towels");
		
		Thread.sleep(1000);
		//Click Bath Towels checkbox
		mhfp.clickCategoriesCheckbox();
		
		//Click brand search icon
		mhfp.clickBrandSearchIcon();
		
		//Send brand Gulaab Jaipur
		mhfp.sendBrand("Gulaab Jaipur");
		
		//Click Gulaab Jaipur checkbox
		mhfp.clickBrandCheckbox();
		
		Thread.sleep(2000);
		
		//Click first product from filtered product
		mhfp.clickFirstProduct();
		
		//Switch to product page tab
		wlib.switchTab(1);
		
		//Click on Add to Bag button
		gjpp.clickAddToBagButton();
		
		//Click on Bag Icon
		gjpp.clickOnBagIcon();
		
		//Click ok got it
		bp.clickOkGotIt();
		
		Thread.sleep(2000);
		//Verify product in Bag
		bp.validateProductInBag();
		
		//Click remove button on bag page
		bp.clickRemoveButton();
		
		//Click remove button on dialog box
		bp.clickRemoveButtonDialog();
		
		//Validate product removed from bag and bag is empty
		bp.validateEmptyBag();
		
		//To close current tab
		wlib.closeTab(1);
				
		//To switch back to parent tab and close tab
		wlib.switchTab(0);
				
		Thread.sleep(2000);
		//Close tab
		wlib.closeTab(0);
		
	}
	
	@Test(priority=5 ,description = "Test for search box on home furnishing page", enabled = true)
	public void searchboxTest() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		MyntraHomeFurnishingsPage mhfp = new MyntraHomeFurnishingsPage(driver);
		GulaabJaipurProductPage gjpp = new GulaabJaipurProductPage(driver);
		
		
		//Validate Home Furnishings Page
		wlib.verify(flib.getCellData(EXCEL_PATH, "Verify Home Furnishings", 1, 0), wlib.getPageTitle(), "Home Furnishings Page");
		
		//Send search input "Gulaab Jaipur Blue Printed 150 GSM Organic cotton Bath Towel"
		mhfp.sendInputSearch("Gulaab Jaipur Blue Printed 150 GSM Organic cotton Bath Towel");
		
		//Click search
		mhfp.clickSearchSubmit();
		
		//Click on product displayed
		mhfp.clickFirstProduct();
		
		//Switch to product page tab
		wlib.switchTab(1);
		
		Thread.sleep(1000);
		//Validate product name
		gjpp.validateProductName();
		
		//To close current tab
		wlib.closeTab(1);
						
		//To switch back to parent tab and close tab
		wlib.switchTab(0);
						
		Thread.sleep(2000);
		//Close tab
		wlib.closeTab(0);
	}

}
