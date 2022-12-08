package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;

public class AJIO_KIDS_03_Page extends TestBase{

	public AJIO_KIDS_03_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = XPath.KIDSpro)
	public WebElement KIDSpro;
	
		

	public boolean verifyProduct() {
	
		List<WebElement> KIDSproproductlist =driver.findElements(By.xpath("KIDSpro"));
	String Product = KIDSproproductlist.get(0).getText();
	WebElement SingleProduct = KIDSproproductlist.get(0);
	System.out.println("KIDSproProduct = " + Product);
	Assert.assertTrue(SingleProduct.isDisplayed());		
		return false;
	}
}
