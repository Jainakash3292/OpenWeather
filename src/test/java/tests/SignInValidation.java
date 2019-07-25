package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Home;
//DemoUser
import pages.SignIn;
import setup.DriverSetup;

public class SignInValidation {

	static WebDriver driver;
	public String URL = "https://openweathermap.org/";

	@BeforeMethod
	void Openbrowser() {
		driver = DriverSetup.getDriver();
		driver.get(URL);
	}

	@Test
	void VerifySignInN() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);

			driver.findElement(Home.signIn).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(SignIn.userName));
			driver.findElement(SignIn.userName).sendKeys("DemoUser@gmail.com");
			driver.findElement(SignIn.password).sendKeys("DemoUser");
			driver.findElement(SignIn.submit).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(SignIn.SuccessSignIn));
			String title = "Signed in successfully.";
			Assert.assertEquals(title, driver.findElement(SignIn.SuccessSignIn).getText());
			Reporter.log(driver.findElement(SignIn.SuccessSignIn).getText());

		} catch (Exception e) {
			Reporter.log(e.toString());
		}
	}

	@AfterMethod
	void Closer() {
		driver.quit();
	}

}
