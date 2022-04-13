package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IDExample {
	@Test
	public void IdDemo() {
		
		System.setProperty("webdriver.ie.driver", "E:\\DXC Selenium Automation\\Locators in Selenium3\\SeleniumBrowserJars\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("rajat");
		driver.findElement(By.id("input-password")).sendKeys("rajatraj123");
	}

}
