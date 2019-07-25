package pages;

import org.openqa.selenium.By;

public class Home {
	public static final By signIn=By.xpath("//div[@class='mini-navbar mini-navbar-dark']//a[contains(text(),'Sign In')]");
	public static final By signUp=By.xpath("//div[@class='mini-navbar mini-navbar-dark']//a[contains(text(),'Sign Up')]");
	public static final By signUp2=By.partialLinkText("Sign Up");
	public static final By supportCentre=By.xpath("//div[@class='mini-navbar mini-navbar-dark']//a//span[.='Support Center']");
	public static final By termsCondition=By.xpath("//a[.='Terms and conditions of sale']");
	public static final By AboutCompany=By.xpath("//a[.='About company']");
	public static final By searchBox=By.xpath("//form[@id='searchform']//input[@id='q']");
	public static final By searchButton=By.xpath("//form[@id='searchform']//input[@id='q']//following::button[1]");
	public static final By copyRights=By.xpath("//span[@id='template-current-year']");
	public static final By temperatureUnitmetric=By.xpath("//span[@id='metric']");
	public static final By temperatureUnitimperial=By.xpath("//span[@id='imperial']");
	public static final By guid=By.xpath("//a[.='Guide']");
	public static final By privacy=By.xpath("//a[.='Privacy policy']");
	public static final By subscription=By.xpath("");
	public static final By header=By.xpath("//h2[.='Current weather and forecasts in your city']");
	
	

}
