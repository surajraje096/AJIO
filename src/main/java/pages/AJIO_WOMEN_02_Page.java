package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;

public class AJIO_WOMEN_02_Page extends TestBase{
	public AJIO_WOMEN_02_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = XPath.WOMENpro)
	public WebElement WOMENpro;
	
		

	public boolean verifyProduct() {
	
		List<WebElement> WOMENproductlist =driver.findElements(By.xpath("WOMENpro"));
	String Product = WOMENproductlist.get(0).getText();
	WebElement SingleProduct = WOMENproductlist.get(0);
	System.out.println("WOMENProduct = " + Product);
	Assert.assertTrue(SingleProduct.isDisplayed());		
		return false;
	}

}

