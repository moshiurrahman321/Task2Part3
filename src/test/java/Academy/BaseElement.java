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
import pageObjects.SelectPage;
import resources.BaseForm;


public class BaseElement extends BaseForm{	
	

	
	
	@Test
	public void Helpform() throws InterruptedException {
		InitializeDriver();
		driver.manage().window().maximize();
	    Assert.assertTrue(true, "Main page is open");
	    SelectPage sp=new SelectPage(driver);
	    sp.Here().click();
	   
	    GamePage gp=new GamePage(driver);
        gp.Help().click();
		
		
		
	}
	
	@Test
	public void Timer() throws InterruptedException {
	
		InitializeDriver();
		driver.manage().window().maximize();
		SelectPage sp=new SelectPage(driver);
		 sp.Here().click();
	     
	     
	     
	}
	@Test
	public void ValidPassword() throws InterruptedException {
		InitializeDriver();
		SelectPage sp=new SelectPage(driver);
		sp.Here().click();
		MainPage mp=new MainPage(driver);
		 
		 mp.Password().clear();
	     mp.Password().sendKeys("M03150421096mА̀ ");
	     mp.Mail().clear();
	     mp.Mail().sendKeys("mrrahman84");
	     mp.Domain().clear();
	     mp.Domain().sendKeys("gmail");
	     
	     mp.clickother().click();
	    
	     Thread.sleep(3000);
	     mp.selectother().click();
	        
	     mp.Checkbox().click();
	     mp.Next().click();
	     Thread.sleep(5000);
		
	}
	@Parameters({"password"})
	@Test
	public void InvalidPassword(String password) throws InterruptedException {
		InitializeDriver();
		SelectPage sp=new SelectPage(driver);
		sp.Here().click();
		 MainPage mp=new MainPage(driver);
		 
		 mp.Password().clear();
	     mp.Password().sendKeys(password);
	     System.out.print(""+password);
	     
	     mp.Mail().clear();
	     mp.Mail().sendKeys("mrrahman84");
	     
	     mp.Domain().clear();
	     mp.Domain().sendKeys("gmail");
	    
	     mp.clickother().click();
	    
	     
	     mp.selectother().click();
	        
	     mp.Checkbox().click();
	     mp.Next().click();
	     CardPage cp=new CardPage(driver);
	     Assert.assertEquals(cp.card().getText(),"This is me");
	     
	}
		
}
