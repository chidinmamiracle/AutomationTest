package assertation_webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import verification_Of_Url.Tc_001_Verify_Url;

public class Tc_001_Login {
	WebDriver driver;
	
	@BeforeMethod
	public void startBRowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void facebookLogin() {
		driver.findElement(By.name("email")).sendKeys("pasmiracle");
		//driver.findElement(By.id("pass")).sendKeys("miracle");
		//Assert.assertTrue(Tc_001_Verify_Url.verifyUrl(driver, "https://www.facebook.com/"),"[error, does not match with the expected url]");
		//Assert.assertTrue(Tc_001_Verify_Url.pageTile(driver, "Facebook - log in or sign up"), "[Error,This pageTitle does not match]");//This is a hard assrtion type
	   // Assert.assertTrue(Tc_001_Verify_Url.validatElementExistOrNot(driver, "//button[@type='submit']"),"[Error element selected]");//This is assertion for elements
	   // Assert.assertTrue(Tc_001_Verify_Url.validateElemntExist(driver, "id","email"),"[Error --Element Not Fond Exception]");
	   // Assert.assertTrue(Tc_001_Verify_Url.validateTexExistOrNot(driver, "name", "login", "Log In"), "[Error -- exception not found]");
	   // Assert.assertEquals(Tc_001_Verify_Url.ValidateTextExistAndReturnEquals(driver, "name", "login"), "Log In".concat("[Error --- Not matching]"));
	    ///Assert.assertEquals(Tc_001_Verify_Url.ValidateTextExistAndReturnEquals(driver, "xpath", "//buton[@type='submit']"), "", "[Error --failure]");
	    //Assert.assertTrue(Tc_001_Verify_Url.validateTextExistOnPage(driver, "Connect with friends and the world around you on Facebook.")," [Error --- Not matching]");
	   // Assert.assertTrue(Tc_001_Verify_Url.validateAttribute(driver, "id", "pass", "aria-label", "Password"), "[Error --Attribute failed]");
	    //Assert.assertTrue(Tc_001_Verify_Url.validateElementVisibility(driver, "name", "email"),"[Error -- Element not seen]");
	    
	    //Calling the hard assertion first with an error,which will stop executing
	    Assert.assertTrue(Tc_001_Verify_Url.typeOfAssertionHard(driver, "id", "email1"), "[Error -- Element not found]");
	    //driver.findElement(By.id("pass")).sendKeys("miracle");
	    
	    
	    //Calling the Soft assertion which will still execute all testcase even when the text fails. 
	    SoftAssert assertion = new SoftAssert();
	    assertion.assertTrue(Tc_001_Verify_Url.typeOfAssertionSoft(driver, "name", "email1"), "[Error -- Element not located]");
	    driver.findElement(By.id("pass")).sendKeys("miracle");
	    
	    assertion.assertAll();
	}
	@AfterMethod
	public void closerbrowser() {
		//driver.close();
	}

}
