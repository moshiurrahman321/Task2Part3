package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GamePage {
	public WebDriver driver;

	By selectHelp=By.cssSelector("a.help-form__help-button");
	
	
	
	public GamePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Help() {
		return driver.findElement(selectHelp);
	}
	
}
