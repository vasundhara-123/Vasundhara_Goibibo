package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.PlatformLocator;

public class TestCase5 extends BaseClass {

	@Test
	public void transport() {

		//PreCondition
		String pnrStatus = "Book Train Tickets | Indian Railways Enquiry & Reservation - Goibibo";
		PlatformLocator transport = new PlatformLocator(driver);

		//Step2:Click on Train Tab
		transport.getTrainButton().click();
		assertEquals(pnrStatus,  transport, "page is not displayed");
		Reporter.log("page is displayed correctly",true);

		//click on platform locator and enter train name and enter station name
		transport.getPlatformLocatorTab().click();
		transport.getTrainNameTextField().sendKeys("Shatabdi Express");
		transport.getChooseStation().sendKeys("abc");

		//click on Search platform button
		transport.getSearchPlatform().click();
		Reporter.log("Platform displayed");
	}



}
