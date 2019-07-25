package pages;

import org.openqa.selenium.By;

public class SearchResult {

	public static final By notFound=By.xpath("//div[@id='forecast_list_ul']//div");
	public static final By result=By.xpath("//div[@id='forecast_list_ul']//td[2]//b[1]//a[contains(text(),'Amravati')]");
	
	
}
