package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectPNRStatus {

	public selectPNRStatus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//a[text()='Trains']") 
	  private WebElement trainButton;
	  
	  public WebElement getTrainButton() { 
		  return trainButton; 
		  }

	@FindBy(xpath="//span[text()='PNR Status']")
	private WebElement PNRstatusTab;
	
	@FindBy(xpath="//input[@name='pnr_code']")
	private WebElement EnterPNRNumbertextfield;
	
	@FindBy(xpath="//button[text()='Check PNR Status']")
	private WebElement checkPNRStatusButton;

	public WebElement getPNRstatusTab() {
		return PNRstatusTab;
	}

	public WebElement getEnterPNRNumbertextfield() {
		return EnterPNRNumbertextfield;
	}

	public WebElement getCheckPNRStatusButton() {
		return checkPNRStatusButton;
	}
}
