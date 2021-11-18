package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlatformLocator {

	public PlatformLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Trains") 
	private WebElement trainButton;


	public WebElement getTrainButton() { 
		return trainButton; 
	}


	@FindBy(xpath="//span[text()='Platform Locator']")
	private WebElement platformLocatorTab;

	@FindBy(xpath="//input[@class='inputBox1 xs:w-full']")
	private WebElement trainNameTextField;

	@FindBy(xpath="//input[@placeholder='Choose your station']")
	private WebElement chooseStation;

	@FindBy(xpath="//input[@value='Search Platform']")
	private WebElement searchPlatform;

	public WebElement getPlatformLocatorTab() {
		return platformLocatorTab;
	}

	public WebElement getTrainNameTextField() {
		return trainNameTextField;
	}

	public WebElement getChooseStation() {
		return chooseStation;
	}

	public WebElement getSearchPlatform() {
		return searchPlatform;
	}
}
