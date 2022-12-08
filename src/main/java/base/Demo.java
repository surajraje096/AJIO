package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JARs\\chromeSelinium\\Chrome107\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[text()=\\\"MEN\\\"]")).click();

	}

}
