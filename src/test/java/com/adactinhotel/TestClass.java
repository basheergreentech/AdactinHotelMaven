package com.adactinhotel;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	public static LoginPage l;
	public static SearchHotel sh;
	@BeforeClass
	private void beforeClass() { launchBrowser(); }
	@BeforeMethod
	private void beforeMethod() {
		if (l == null) {l = new LoginPage();}
		if (sh == null) {sh = new SearchHotel();}
		Date d = new Date(); System.out.println(d);
	}
	@Test(priority=1)
	private void testLogin() {
		launchUrl("http://adactinhotelapp.com/index.php");
		txtSendKeys(l.getTxtUserName(), "basheergreentech");txtSendKeys(l.getTxtPassword(), "Green@123");
		btnClick(l.getBtnLogin()); System.out.println("TestLogin Done");
	}
	@Test(priority=2)
	private void testSearchHotel() {
		selectOption(sh.getDpLocation(), "London");	selectOption(sh.getDpHotels(),"Hotel Sunshine");
		selectOption(sh.getDpRoom(),"Super Deluxe"); selectOption(sh.getDpRooms(),"2 - Two");
		txtSendKeys(sh.getCheckInDate(),"11/01/2021"); txtSendKeys(sh.getCheckOutDate(),"12/01/2021");
		selectOption(sh.getDpAdultRoom(),"1 - One"); selectOption(sh.getDpChildRoom(),"3 - Three");
		btnClick(sh.getBtnSubmit()); System.out.println("TestSearchHotel Done");
	}
	@AfterMethod
	private void afterMethod() {
		Date d = new Date(); System.out.println(d);	System.out.println("----------------------");
	}
	@AfterClass
	private void afterClass() throws InterruptedException {
		Thread.sleep(4000); quitBrowser();
	}
}
