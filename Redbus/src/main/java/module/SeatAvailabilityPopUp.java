package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatAvailabilityPopUp {
	@FindBy (xpath="//div[text()='Got It']")
	private WebElement gotIt;
	
	//constructor
	
	public SeatAvailabilityPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public void clickSeatAvailabilityPopUp()
	{
		gotIt.click();
	}


}



