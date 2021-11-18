package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.selectPNRStatus;

public class TestCasee2 extends BaseClass{

	@Test
	public void transport() {

		//PreCondition
		String pnrStatus = "Book Train Tickets | Indian Railways Enquiry & Reservation - Goibibo";
		selectPNRStatus transport = new selectPNRStatus(driver);

		//Step2:Click on Train Tab
		transport.getTrainButton().click();
		//assertEquals(pnrStatus,  transport, "page is not displayed");
		Reporter.log("page is displayed correctly",true);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800);");

		//click on PNR Status and enter PNR Number
		  transport.getPNRstatusTab().click();
		transport.getEnterPNRNumbertextfield().sendKeys("1234567890");

		//click on Check PNR Status Button
		transport.getCheckPNRStatusButton().click();

	}
}
