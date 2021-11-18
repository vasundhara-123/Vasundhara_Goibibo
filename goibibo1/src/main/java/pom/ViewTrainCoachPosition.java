package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTrainCoachPosition {

	public ViewTrainCoachPosition(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Trains']") 
	  private WebElement trainButton;
	  
	  public WebElement getTrainButton1() { 
		  return trainButton; 
		  }
	
	@FindBy(xpath="//span[text()='View train coach position ']")
	private WebElement viewtrainCoachPositionTab;
	
	@FindBy(xpath="//input[@class='payformFeildWrap inputMedium']")
	private WebElement trainNoTextField;
	
	@FindBy(xpath="//button[text()='CHECK COACH POSITION']")
	private WebElement coachPosition;

	public WebElement getViewtrainCoachPositionTab() {
		return viewtrainCoachPositionTab;
	}

	public WebElement getTrainNoTextField() {
		return trainNoTextField;
	}

	public WebElement getCoachPosition() {
		return coachPosition;
	}

	public WebElement getTrainButton() {
		// TODO Auto-generated method stub
		return null;
	}
}
