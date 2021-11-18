package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainStatus {

	public TrainStatus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Hotels']/../..//a[text()='Trains']")
	private WebElement trainButton;

	@FindBy(xpath="//span[text()='Live train status']")
	private WebElement liveTrainStatusTab;

	@FindBy(xpath="//input[@role='combobox']")
	private WebElement enterTrainNameorNumber;

	@FindBy(xpath="//button[text()='Check live train status']")
	private WebElement checkLiveTrainStatusButton;

	public WebElement getTrainButton() {
		return trainButton;
	}

	public WebElement getLiveTrainStatusTab() {
		return liveTrainStatusTab;
	}

	public WebElement getEnterTrainNameorNumber() {
		return enterTrainNameorNumber;
	}

	public WebElement getCheckLiveTrainStatusButton() {
		return checkLiveTrainStatusButton;
	}



}
