package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;

public class AJIO_01_Page extends TestBase {

	public AJIO_01_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = XPath.signbtn)
	public WebElement sign;

	@FindBy(xpath = XPath.searchAJIO)
	public WebElement searchAJIO;

	@FindBy(xpath = XPath.logo)
	public WebElement logo;

	@FindBy(xpath = XPath.MEN)
	public WebElement MEN;
	
	@FindBy(xpath = XPath.MENjaket)
	public WebElement MENjaket;

	@FindBy(xpath = XPath.WOMEN)
	public WebElement WOMEN;

	@FindBy(xpath = XPath.KIDS)
	public WebElement KIDS;

	@FindBy(xpath = XPath.INDIE)
	public WebElement INDIE;

	@FindBy(xpath = XPath.HOME_AND_KITCHEN)
	public WebElement HOME_AND_KITCHEN;

	public boolean verifyAJIOlogo() {
		Assert.assertTrue(logo.isDisplayed());
		return true;

	}

	public boolean verifySearchBox() {
		Assert.assertTrue(searchAJIO.isDisplayed());
		return true;
	}

	public boolean verifysignbtn() {
		Assert.assertTrue(sign.isDisplayed());
		return true;
	}

	public AJIO_MEN_01_Page clickOnMEN() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(MEN);
		Thread.sleep(5000);

		MENjaket.click();
		Thread.sleep(5000);

		return new AJIO_MEN_01_Page();
	}

	public AJIO_WOMEN_02_Page clickOnWOMEN() {

		WOMEN.click();

		return new AJIO_WOMEN_02_Page();
	}

	public AJIO_KIDS_03_Page clickOnKIDS() {

		KIDS.click();

		return new AJIO_KIDS_03_Page();
	}

	public AJIO_INDIE_04_Page clickOnINDIE() {

		INDIE.click();

		return new AJIO_INDIE_04_Page();
	}
	
	public AJIO_HOME_AND_KITCHEN_05_Page clickOnHOME_AND_KITCHEN() {

		HOME_AND_KITCHEN.click();

		return new AJIO_HOME_AND_KITCHEN_05_Page();
	}
	

}
