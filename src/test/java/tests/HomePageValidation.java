package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import pages.Home;
import setup.DriverSetup;

public class HomePageValidation {
	static WebDriver driver;
	public String URL = "https://openweathermap.org/";

	@BeforeClass
	void Openbrowser() {
		driver = DriverSetup.getDriver();
		driver.get(URL);
	}

	@Test
	void VerifyHomePage() {
		try {
			if (driver.findElement(Home.searchBox).isDisplayed()) {
				Reporter.log("Search Box is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.searchButton).isDisplayed()) {
				Reporter.log("Search Button is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.AboutCompany).isDisplayed()) {
				Reporter.log("About Company Link is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.signIn).isDisplayed()) {
				Reporter.log("Sign IN Button is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.signUp).isDisplayed()) {
				Reporter.log("Sign UP Button is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.header).isDisplayed()) {
				Assert.assertEquals(driver.findElement(Home.header).getText(),
						"Current weather and forecasts in your city");
				Reporter.log("Header is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.supportCentre).isDisplayed()) {
				Assert.assertEquals(driver.findElement(Home.supportCentre).getText(), "Support Center");
				Reporter.log("Support Centre is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

		try {
			if (driver.findElement(Home.guid).isDisplayed()) {
				Assert.assertEquals(driver.findElement(Home.guid).getText(), "Guide");
				Reporter.log("Guid is present ");
			}
		} catch (Exception e) {
			Reporter.log(e.toString());
		}

	}

	@AfterClass
	void Closer() {
		driver.quit();
	}

}
