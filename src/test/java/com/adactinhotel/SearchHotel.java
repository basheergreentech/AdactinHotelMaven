package com.adactinhotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchHotel extends BaseClass {
	public SearchHotel() {PageFactory.initElements(driver, this);}
	@FindBy(id = "location")
	private WebElement dpLocation;
	@FindBy(id = "hotels")
	private WebElement dpHotels;
	@FindBy(id = "room_type")
	private WebElement dpRoom;
	@FindBy(id = "room_nos")
	private WebElement dpRooms;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement dpAdultRoom;
	@FindBy(id = "child_room")
	private WebElement dpChildRoom;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(id="//*[@id='select_form']/table/tbody/tr")
	private WebElement tableList;
	public WebElement getTableList() {return tableList;}
	public WebElement getBtnSubmit() {return btnSubmit;}
	public WebElement getDpChildRoom() {return dpChildRoom;}
	public WebElement getDpAdultRoom() {return dpAdultRoom;}
	public WebElement getCheckOutDate() {return checkOutDate;}
	public WebElement getCheckInDate() {return checkInDate;}
	public WebElement getDpRooms() {return dpRooms;}
	public WebElement getDpRoom() {return dpRoom;}
	public WebElement getDpLocation() {return dpLocation;}
	public WebElement getDpHotels() {return dpHotels;}

}
