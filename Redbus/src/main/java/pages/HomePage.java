package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath="//input[@id='src']")
	private WebElement fromTextBox;
	
	@FindBy (xpath="//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']")
	private List<WebElement> listOfFromTextBox;
	
	@FindBy (xpath="//input[@id='dest']")
	private WebElement toTextBox;
	
	@FindBy (xpath="//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']")
	private List<WebElement> listOfToTextBox ;
	
	@FindBy (xpath="//span[text()='Date']")
	private WebElement dateButton;
	
	@FindBy (xpath="(//div[@style='flex-grow: 1; cursor: pointer;'])[2]")
	private WebElement arrowButtonOnDate;
	
	@FindBy (xpath="//span[text()='17']")
	private WebElement selectDate;
	
	@FindBy (xpath="//button[@id='search_button']")
	private WebElement searchBussesButton ;
	
	
	
	
	
	//cunstructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Methods
	public void sendValueInFromTextBox(String sorce)
	{
		fromTextBox.sendKeys(sorce);
	}
	
	public void selectOptionFromListOfFromTextBox()
	{
		for(int i=0; i<listOfFromTextBox.size(); i++)
	    {
	    	String result = listOfFromTextBox.get(i).getText();
	    	if(result.contains("Railway Station"))
	    	{
	    		listOfFromTextBox.get(i).click();
	    		break;
	    	}
	    }
	}
	
	public void sendValueIntoToTextBox(String destination)
	{
		toTextBox.sendKeys(destination);
	}
	
	public void selectOptionFromListOfToTextBox()
	{
		for(int i=0; i<listOfToTextBox.size(); i++)
		{
			String result= listOfToTextBox.get(i).getText();
			if(result.equals("Dadar"))
			{
				listOfToTextBox.get(i).click();
				break;
			}
		}
	}
	
	public void clickOnDateButton()
	{
		dateButton.click();
	}
	
	public void clickOnArrowInDate()
	{
		arrowButtonOnDate.click();
		arrowButtonOnDate.click();
	}
	
	public void selectDate()
	{
		selectDate.click();
	}
	
	public void clickOnSearchBussesButton()
	{
		searchBussesButton.click();
	}
	
}
