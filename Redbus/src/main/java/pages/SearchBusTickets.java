package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBusTickets {
	
	@FindBy (xpath="(//div[@class='button view-seats fr'])[1]")
	private WebElement viewSeatsButton;
	
	
	//Cunstructor
	public SearchBusTickets(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Methods
	public void clickOnViewSeatsButton()
	{
		viewSeatsButton.click();
	}

}
