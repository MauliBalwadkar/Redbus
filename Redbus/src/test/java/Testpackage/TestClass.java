package Testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import module.SeatAvailabilityPopUp;
import pages.HomePage;
import pages.SearchBusTickets;

public class TestClass {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		
		HomePage _homePage = new HomePage(driver);
		
		_homePage.sendValueInFromTextBox("pune");
		_homePage.selectOptionFromListOfFromTextBox();
		_homePage.sendValueIntoToTextBox("mumbai");
		_homePage.selectOptionFromListOfToTextBox();
		_homePage.clickOnDateButton();
		_homePage.clickOnArrowInDate();
		_homePage.selectDate();
		_homePage.clickOnSearchBussesButton();
		
		
//		SeatAvailabilityPopUp _seatAvailabilityPopUp = new SeatAvailabilityPopUp(driver); 
//		_seatAvailabilityPopUp.clickSeatAvailabilityPopUp();
		
		
		SearchBusTickets _searchBusTickets = new SearchBusTickets(driver);
		 _searchBusTickets.clickOnViewSeatsButton();
		
		
	}

}
