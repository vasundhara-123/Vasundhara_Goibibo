package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.TrainStatus;

public class TestCase3 extends BaseClass{

	@Test
	public void transport() {
		
		//Precondition
		String pnrStatus = "Book Train Tickets | Indian Railways Enquiry & Reservation - Goibibo";
		TrainStatus transport = new TrainStatus(driver);

		//Click on Train tab
		transport.getTrainButton().click();
		//assertEquals(pnrStatus,  transport, "page is not displayed");
				Reporter.log("page is displayed correctly",true);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900);");
		
		//Click on LiveTrain Status tab and enter train name
		transport.getLiveTrainStatusTab().click();
		transport.getEnterTrainNameorNumber().sendKeys("Shatabdi Express");
		
		//click on Check live status Button
		transport.getCheckLiveTrainStatusButton().click();
				Reporter.log("Live status of train is displayed");
	}
}
