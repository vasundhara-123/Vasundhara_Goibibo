package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainPage {

	public TrainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[text()='From']/..//input[@placeholder='Select Station / City Name']")
	private  WebElement fromStation;

	@FindBy(xpath="//span[text()='Bangalore City Junction']")
	private WebElement stationName;

	public WebElement getStationName() {
		return stationName;
	}


	@FindBy(xpath="//p[text()='To']/..//input[@placeholder='Select Station / City Name']")
	private WebElement toStation;

	@FindBy(xpath="//span[text()='Mumbai Cst Railway Station']")
	private WebElement toStationName;

	public WebElement getToStationName() {
		return toStationName;
	}


	@FindBy(xpath="//p[@class='widgetInput width100 textInput width100']")
	private WebElement selectDate;

	public WebElement getFromStation() {
		return fromStation;
	}

	public WebElement getToStation() {
		return toStation;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}



	@FindBy(xpath="//span[@aria-label='Next Month']") 
	private WebElement nextMonth;

	@FindBy(xpath="//div[text()='8']") 
	private WebElement enterDate;


	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getEnterDate() {
		return enterDate;
	}

	@FindBy(xpath="//button[text()='Search Trains']") 
	private WebElement searchTrainButton;


	public WebElement getSearchTrainButton() {
		return searchTrainButton;
	}
}
