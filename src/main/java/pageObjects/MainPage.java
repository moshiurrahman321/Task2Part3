package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	public WebDriver driver;
	By selectHere=By.xpath("//a[contains(text(),'HERE')]");
	By writePassword=By.cssSelector("input[placeholder ='Choose Password']");
	By writeMail=By.cssSelector("input[placeholder ='Your email']");
	By writeDomain=By.cssSelector("input[placeholder ='Domain']"); 
	By dropdowan=By.xpath("//div[@class='dropdown__opener']");
	
	By 	other=By.xpath("//div[@class='dropdown__list']/div[9]");
			
	
	By selectCheckbox=By.xpath("//span[@class='checkbox__box']");
	
	By clickNext=By.xpath("//a[@class='button--secondary']");
	
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Here() {
		return driver.findElement(selectHere);
	}
	
	public WebElement Password() {
		return driver.findElement(writePassword);
	}
	public WebElement Mail() {
		return driver.findElement(writeMail);
	}
	public WebElement Domain() {
		return driver.findElement(writeDomain);
	}
	public WebElement clickother() {
		return driver.findElement(dropdowan);
	}
	public WebElement selectother() {
		return driver.findElement(other);
	}
	public WebElement Checkbox() {
		return driver.findElement(selectCheckbox);
	}
	public WebElement Next() {
		return driver.findElement(clickNext);
	}
}
