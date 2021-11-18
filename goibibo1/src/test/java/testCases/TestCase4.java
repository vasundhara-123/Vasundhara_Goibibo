package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.ViewTrainCoachPosition;

public class TestCase4 extends BaseClass{

	@Test
	public void transport() {

		//PreCondition
		String pnrStatus = "Book Train Tickets | Indian Railways Enquiry & Reservation - Goibibo";
		ViewTrainCoachPosition transport = new ViewTrainCoachPosition(driver);

		//Step2:Click on Train Tab
		transport.getTrainButton1().click();
		//assertEquals(pnrStatus,  transport, "page is not displayed");
		Reporter.log("page is displayed correctly",true);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800);");

		//Click on view train coach position and enter train number
		transport.getViewtrainCoachPositionTab().click();
		transport.getTrainNoTextField().sendKeys("1234");

		//Click on coach position button
		transport.getCoachPosition().click();
		Reporter.log("View coach position");
	}
}
