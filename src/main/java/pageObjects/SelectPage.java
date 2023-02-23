package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPage {
	public WebDriver driver;
	By selectHere=By.xpath("//a[contains(text(),'HERE')]");
	public SelectPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Here() {
		return driver.findElement(selectHere);
	}
}
