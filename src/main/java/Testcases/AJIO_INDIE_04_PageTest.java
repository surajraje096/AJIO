package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.AJIO_01_Page;
import pages.AJIO_INDIE_04_Page;
import pages.AJIO_KIDS_03_Page;

public class AJIO_INDIE_04_PageTest extends TestBase {

	AJIO_01_Page AJI_01_Page;
	AJIO_INDIE_04_Page AJI_INDIE_04_Page;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() throws IOException {
		inti();
		AJI_01_Page = new AJIO_01_Page();
		AJI_INDIE_04_Page = AJI_01_Page.clickOnINDIE();

		softAssert = new SoftAssert();

	}

	@Test(priority=1)
	public void verifyProduct() {

		boolean flag=AJI_INDIE_04_Page.verifyProduct();
		System.out.println("Account is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
}
