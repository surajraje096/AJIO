package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;

public class AJIO_MEN_01_Page extends TestBase{
	
	
	public AJIO_MEN_01_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = XPath.MENjaket)
	public WebElement MENjaket;
	
		

	public boolean  verifyProduct() throws InterruptedException {
	
		/*List<WebElement> Menproductlist =driver.findElements(By.xpath("MENpro"));
	int Product = Menproductlist.size();
	WebElement SingleProduct = Menproductlist.get(5);
	System.out.println("MenProduct = " + Product);
	Assert.assertTrue(SingleProduct.isDisplayed());	*/	
		WebElement element = driver.findElement(By.xpath("MENpro"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		
		MENjaket.click();
		return false;
		
	}

}
