package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTicketPage {

	public BookTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='CBE LTT SPL']/../../..//span[text()='Recommended']")
	private WebElement ticketBooking;

	public WebElement getTicketBooking() {
		return ticketBooking;
	}
	
}
