package pages;

import org.openqa.selenium.By;

public class SignIn {

	public static final By userName=By.xpath("(//input[@id='user_email'])[1]");
	public static final By password=By.xpath("(//input[@id='user_password'])[1]");
	//public static final By confirmPassword=By.xpath("//input[@id='user_password_confirmation']");
	public static final By submit=By.xpath("(//input[@name='commit'])[1]");
//	public static final By Year =By.xpath("//input[@id='agreement_is_age_confirmed']");
//	public static final By privacy =By.xpath("//input[@id='agreement_is_accepted']");
//	public static final By captcha =By.xpath("//span[@id='recaptcha-anchor']//div[1]");
//	public static final By mailme=By.xpath("//input[@id='mailing_news']");
	
//	public static final By email=By.xpath("//input[@id='user_email']");
	
	public static final By SuccessSignIn=By.xpath("//div[@class='panel panel-green']//div[2]");
	
	
}
