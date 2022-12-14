package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

import config.XPath;

import util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static EventFiringWebDriver eventFiringWebDriver;
	public static WebEventListener webEventListener;
//	public Logger log = Logger.getLogger("Google assignment");
	private static final String ResultSet = null;

	public static Properties pro;

	public TestBase() {
		pro = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"D:\\SpringBoot API Projects\\AJIO_Pom_Project\\src\\main\\java\\config\\config.properties");
			pro.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void inti() throws IOException {
		String browsername = XPath.browser;
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JARs\\chromeSelinium\\Chrome107\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARs\\chromeSelinium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;

		driver.get(XPath.url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Alert alert = driver.switchTo().alert(); // switch to alert

			String alertMessage= driver.switchTo().alert().getText(); // capture alert message

			System.out.println(alertMessage); // Print Alert Message
			Thread.sleep(5000);
			alert.accept();
		}catch (Exception e) {
			System.out.println("Alert Accepted");
		}
			
		}

	

	public void inti1() {
		String browsername = XPath.browser;
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JARs\\chromeSelinium\\Internet Explorer jar\\new\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARs\\chromeSelinium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;
	}

	


	public boolean isAvailable(WebElement element) {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			return true;
		} catch (Throwable t) {
			return false;
		}
		}

	public static boolean getTC(String testcase) throws IOException {

		boolean d = true;
		FileInputStream fis = new FileInputStream(
				"D:\\SpringBoot API Projects\\Assignment__GOOGLE__POM\\src\\main\\java\\config\\Suite.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Suite");
		int row = 0;
		for (Row r : sheet) {
			row++;
		}

		for (int i = 1; i < row; i++) {
			Row r = sheet.getRow(i);
			Cell c1 = r.getCell(0);

			String s1 = c1.getStringCellValue();

			if (s1.equalsIgnoreCase(testcase)) {
				Cell c2 = r.getCell(1);
				String s2 = c2.getStringCellValue();

				if (s2.equalsIgnoreCase("Yes")) {
					d = true;
				} else {
					d = false;
				}
			}

		}
		return d;

	}

}