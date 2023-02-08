package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardPage {
	public WebDriver driver;
	By secondcard=By.xpath("//h2[contains(text(),'This is me')]");
	
	public CardPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement card() {
		return driver.findElement(secondcard);
	}
	
}
