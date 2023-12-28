package com.myntra.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * This class contains elements and methods to handle the Home Furnishings Page
 * @author Bhaskar Singh
 *
 */

public class MyntraHomeFurnishingsPage {
	
	@FindBy(xpath="//span[text()='Categories']/following-sibling::div[@class='filter-search-filterSearchBox']") private WebElement categoriesSearchIcon;
	@FindBy(xpath="//span[text()='Categories']/following-sibling::div[@class='filter-search-filterSearchBox filter-search-expanded']/input[@type='text']") private WebElement categoriesSearchBox;
	@FindBy(xpath="//input[@value='Bath Towels']/following-sibling::div[@class='common-checkboxIndicator']") private WebElement categoriesCheckbox;
	@FindBy(xpath="//span[text()='Brand']/following-sibling::div[@class='filter-search-filterSearchBox']") private WebElement brandSearchIcon;
	@FindBy(xpath="//span[text()='Brand']/following-sibling::div[@class='filter-search-filterSearchBox filter-search-expanded']/input[@type='text']") private WebElement brandSearchBox;
	@FindBy(xpath="//input[@value='Gulaab Jaipur']/following-sibling::div[@class='common-checkboxIndicator']") private WebElement brandCheckbox;
	@FindBy(xpath="//div[@class='product-productMetaInfo']//h3[@class='product-brand']") private List<WebElement> visibleBrands;
	@FindBy(xpath="(//div[@class='product-productMetaInfo']//h4[@class='product-product'])[1]") private WebElement firstProduct;
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']") private WebElement searchBox;
	@FindBy(xpath="//a[@class='desktop-submit']") private WebElement clickSubmit;
	
	public MyntraHomeFurnishingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is used to click on categories search icon
	 */
	public void clickCategoriesSearchIcon()
	{
		categoriesSearchIcon.click();
		Reporter.log("Categories search icon clicked", true);
	}
	
	/**
	 * This method is used to enter category in search box
	 */
	public void sendCategories(String category)
	{
		categoriesSearchBox.sendKeys(category);
		Reporter.log("Search input for categories sent", true);
	}
	
	/**
	 * This method is used to click on category check box
	 */
	public void clickCategoriesCheckbox()
	{
		categoriesCheckbox.click();
		Reporter.log("Category checkbox selected", true);
	}
	
	/**
	 * This method is used to click on brand search icon
	 */
	public void clickBrandSearchIcon()
	{
		brandSearchIcon.click();
		Reporter.log("Brand search icon clicked", true);
	}
	
	/**
	 * This method is used to enter brand in search box
	 */
	public void sendBrand(String brand)
	{
		brandSearchBox.sendKeys(brand);
		Reporter.log("Search input for brand sent", true);
	}
	
	/**
	 * This method is used to click on brand check box
	 */
	public void clickBrandCheckbox()
	{
		brandCheckbox.click();
		Reporter.log("Brand checkbox selected", true);
	}
					
	/**
	 * This method is used to validate expected brand and actual brand
	 */
	public void validateBrands()
	{
		int totalBrands = visibleBrands.size();
		for(int i=0; i<totalBrands; i++)
		{
			String oneBrand = visibleBrands.get(i).getText();
			Assert.assertEquals(oneBrand, "Gulaab Jaipur", "Brand name incorrect -> " + (i+1));
		}
		Reporter.log("Brand name verified", true);
	}
	
	/**
	 * This method is used to click of first product from filtered brand
	 */
	public void clickFirstProduct()
	{
		firstProduct.click();
		Reporter.log("Clicked on first product", true);
	}
	
	/**
	 * This method is used to enter product search box
	 */
	public void sendInputSearch(String searchInput)
	{
		searchBox.sendKeys(searchInput);
		Reporter.log("Search input for search box sent", true);
	}
	
	/**
	 * This method is used to click search submit
	 */
	public void clickSearchSubmit()
	{
		clickSubmit.click();
		Reporter.log("Search input submitted", true);
	}


}
