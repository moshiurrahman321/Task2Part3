package Academy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.CardPage;
import pageObjects.GamePage;
import pageObjects.MainPage;
import resources.BaseForm;


public class BaseElement extends BaseForm{	
	private static final String password = null;
	static String baseurl="https://userinyerface.com/";	
	@BeforeTest
	public void InitializedDriver() {
		driver.get(baseurl);
	}
	
	
	@Test(priority=1)
	public void Helpform() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
	    Assert.assertTrue(true, "Main page is open");
	    MainPage mp=new MainPage(driver);
	    mp.Here().click();
	    Thread.sleep(3000);
	    Assert.assertEquals(driver.getTitle(),"User Inyerface - A worst-practice UI experiment");
	    GamePage gp=new GamePage(driver);
        gp.Help().click();
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=2)
	public void Timer() throws InterruptedException {
	
		driver.get(baseurl);
		driver.manage().window().maximize();
		MainPage mp=new MainPage(driver);
		 mp.Here().click();
	     Thread.sleep(3000);
	     
	     
	}
	@Test(priority=3)
	public void ValidPassword() throws InterruptedException {
		driver.get(baseurl);
		MainPage mp=new MainPage(driver);
		 mp.Here().click();
		 mp.Password().clear();
	     mp.Password().sendKeys("M03150421096mА̀ ");
	     mp.Mail().clear();
	     mp.Mail().sendKeys("mrrahman84");
	     mp.Domain().clear();
	     mp.Domain().sendKeys("gmail");
	     Thread.sleep(3000);
	     mp.clickother().click();
	    
	     Thread.sleep(3000);
	     mp.selectother().click();
	        
	     mp.Checkbox().click();
	     mp.Next().click();
	     Thread.sleep(5000);
		
	}
	@Parameters({"password"})
	@Test(priority=4)
	public void InvalidPassword(String password) throws InterruptedException {
		 driver.get(baseurl);
		 MainPage mp=new MainPage(driver);
		 mp.Here().click();
		 mp.Password().clear();
	     mp.Password().sendKeys(password);
	     System.out.print(""+password);
	     Thread.sleep(5000);
	     mp.Mail().clear();
	     mp.Mail().sendKeys("mrrahman84");
	     
	     mp.Domain().clear();
	     mp.Domain().sendKeys("gmail");
	     Thread.sleep(3000);
	     mp.clickother().click();
	    
	     Thread.sleep(3000);
	     mp.selectother().click();
	        
	     mp.Checkbox().click();
	     mp.Next().click();
	     CardPage cp=new CardPage(driver);
	     Assert.assertEquals(cp.card().getText(),"This is me");
	     Thread.sleep(3000);
	}
	
	
	@AfterTest
	 public void teardown() {
	 	driver.close();
	 	//driver=null;
	 }
	
	
}
