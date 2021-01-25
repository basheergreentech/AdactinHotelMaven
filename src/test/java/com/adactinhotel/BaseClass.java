package com.adactinhotel;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	//BaseClass
	public static WebDriver driver;
	public static Select s;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AtoA\\eclipse-workspace\\AdactinHotelMaven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {driver.get(url);}
	public static void txtSendKeys(WebElement e, String value) {e.sendKeys(value);}
	public static void btnClick(WebElement e) {e.click();}
	public static void quitBrowser() {driver.quit();}
	public static void selectOption(WebElement e, String value) {
		e.click();
		s = new Select(e);
		List<WebElement> li = s.getOptions();
		for (int i = 0; i < li.size(); i++) {
			String scheck = li.get(i).getText();
			if(scheck.equals(value))
			{
				String text = li.get(i).getText();
				System.out.println(text);
				s.selectByVisibleText(text);
			}
		}
		
	}
}

