package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
import pages.SearchResult;
import setup.DriverSetup;

public class SearchResultValidation {

	static WebDriver driver;
	public String URL = "https://openweathermap.org/";

	@BeforeMethod
	void Openbrowser() {
		driver = DriverSetup.getDriver();
		driver.get(URL);
	}

	@Test
	void verifySearchInvalid() {
		try {
			driver.findElement(Home.searchBox).sendKeys("Invalid data");
			driver.findElement(Home.searchButton).click();
			String NotFoundMsg = driver.findElement(SearchResult.notFound).getText();
			Reporter.log("Search result shows" + NotFoundMsg);
		} catch (Exception e) {
			Reporter.log(e.toString());
		}
	}

	@Test
	void verifySearchvalid() {
		try {
			String sample = "Amravati";
			driver.findElement(Home.searchBox).sendKeys("Amravati");
			driver.findElement(Home.searchButton).click();
			String NotFoundMsg = driver
					.findElement(By
							.xpath("//div[@id='forecast_list_ul']//td[2]//b[1]//a[contains(text(),'" + sample + "')]"))
					.getText();
			Reporter.log("Search result shows" + NotFoundMsg);
		} catch (Exception e) {
			Reporter.log(e.toString());
		}
	}

	@AfterMethod
	void Closer() {
		driver.quit();
	}

}
