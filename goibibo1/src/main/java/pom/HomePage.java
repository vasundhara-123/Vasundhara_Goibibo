package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Trains") 
	private WebElement trainButton;


	public WebElement getTrainButton() { 
		return trainButton; 
	}


}
