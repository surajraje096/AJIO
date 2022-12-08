package Testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.AJIO_01_Page;


public class AJIO_01_PageTest extends TestBase {

	AJIO_01_Page AJIO_01_Page;
	public SoftAssert softAssert;
	public Logger log = LogManager.getLogger(AJIO_01_PageTest.class);


	@BeforeMethod
	public void setUp() throws IOException {
		inti();
		AJIO_01_Page = new AJIO_01_Page();
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void verifySearchBox() {
		boolean flag = AJIO_01_Page.verifyAJIOlogo();
		log.getLogger("gunret log");
		log.getLogger("suraj login ");
		log.debug("get log");
		log.debug("veryfi search box");
		log.info("search box");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void verifySearchbtn() {
		boolean flag = AJIO_01_Page.verifySearchBox();
		log.debug("Suraj Testing");
		log.debug("veryfi search btn");
		log.info("search btn");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void verifySearchluckybtn() {
		boolean flag = AJIO_01_Page.verifysignbtn();
		log.debug("veryfi lucky btn");
		log.info("lucky btn");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
