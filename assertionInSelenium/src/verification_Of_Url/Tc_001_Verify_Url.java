package verification_Of_Url;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Tc_001_Verify_Url {
	/*So far so good there are two types of assertion, which include,hard and soft assertion
	IN case of the  HARD assertion,element will stop executing once the assertion fails
	While in case of the SOFT Assertion element will still execute even if it fails,T o use the soft assertion you have to create an objecct for it
	And for it to display all the failured element you have to call the object you created dot(.assertAll) Is examples below */
	 
	
	public static boolean typeOfAssertionHard(WebDriver driver,String locType,String locValue) {
		boolean result = false;
		try
	{
		   if (locType.equalsIgnoreCase("id")) 
		   {
			driver.findElement(By.id(locValue));
			
		   }
		  result = true;
	     }catch (Exception e) {
		
	     }return result;
	
   }		
	
	public static boolean typeOfAssertionSoft(WebDriver driver,String locType,String locValue) {
		boolean result = false;
		try 
		{
		    if (locType.equalsIgnoreCase("name")) 
		    {
			driver.findElement(By.id(locValue));
		    }
			 result = true;
		
	       }catch (Exception e) {
		  
	      }  return result;
	}		
	
	
	public static boolean validateElementVisibility(WebDriver driver, String locType,String locValue) {
		boolean result = true;
		try
		{
			if (locType.equalsIgnoreCase("xpath")) 
			{
				result=driver.findElement(By.xpath(locValue)).isDisplayed();// Method is also applicable when you want to check if the element isEnabled or isSelected
			}else if (locType.equalsIgnoreCase("id")) 
			{
				result=driver.findElement(By.id(locValue)).isDisplayed();
				
			}else if (locType.equalsIgnoreCase("name")) 
			{
				result=driver.findElement(By.name(locValue)).isDisplayed();
			}	
			result=true;
		} catch (Exception e) {
		}
		return result;
	}
	
	public static boolean validateAttribute(WebDriver driver, String locType, String locValue, String attributeName,String expValue) {
		boolean result = false;
		String value = "";
	 try 
	 {  
			  if (locType.equalsIgnoreCase("xpath")) 
			  {
				    value = driver.findElement(By.xpath(locValue)).getAttribute(attributeName);
				
			   }else if (locType.equalsIgnoreCase("id")) 
			   {
				       value = driver.findElement(By.id(locValue)).getAttribute(attributeName); 
				
			   }else if (locType.equalsIgnoreCase("name"))
			   {
				      value = driver.findElement(By.name(locValue)).getAttribute(attributeName);
			 }
			  if (value.equalsIgnoreCase(expValue)) 
			  {
				result=true;
			}
		 } catch (Exception e) {
	}
		return result;
	}
	
	
	public static boolean validateTextExistOnPage(WebDriver driver, String expText) {
		boolean result = false;
		if (driver.getPageSource().contains(expText)) {
			result = true;
		}
		return result;
		
	}
	
	
	public static String ValidateTextExistAndReturnEquals(WebDriver driver,String locType,String locValue) {
		String actResult = "";
	try {
			if (locType.equalsIgnoreCase("xpath")) {
				actResult=driver.findElement(By.xpath(locValue)).getText();
				
			}else if (locType.equalsIgnoreCase("id")) {
				actResult = driver.findElement(By.id(locValue)).getText();
				
			}else if (locType.equalsIgnoreCase("name")) {
				actResult = driver.findElement(By.name(locValue)).getText();
			}
			
	   } catch (Exception e) {
	}
		return actResult;
	}
	
	
	               //////OR
	
	
	public static boolean validateTexExistOrNot(WebDriver driver,String locType,String locValue, String expText) {
		boolean result = false;
		String actualText = "";
		try
		{
		     if (locType.equalsIgnoreCase("xpath"))
		     {
			  actualText = driver.findElement(By.xpath(locValue)).getText();
			
		     }else if (locType.equalsIgnoreCase("id")) 
		     {
			 actualText = driver.findElement(By.id(locValue)).getText();
			
		     }else if (locType.equalsIgnoreCase("name")) 
		     {
			 actualText = driver.findElement(By.name(locValue)).getText();
		     }
		     if (actualText.equals(expText)) 
		     {
			
	   }
		  result= true;
		
		}catch (Exception e) {
			
		}
		 return result;
		}
		
	public static boolean validateElemntExistAllElementLocator(WebDriver drive, String locType, String locValue) {//This approach is use to check if element exist or not and is applicable for all the element
		boolean result = false;
		try 
		{ 
			if (locType.equalsIgnoreCase("xpath")) 
			{
				drive.findElement(By.xpath(locValue));
			
			}else if (locType.equalsIgnoreCase("id"))
			{
				drive.findElement(By.id(locValue));
				
			}else if (locType.equalsIgnoreCase("name"))
			{
				drive.findElement(By.name(locValue));
			}
			result = true;
		} catch (Exception e) {
			
		}
		return result;
		
	}
	
	public static boolean validatElementExistOrNotByXpath(WebDriver driver,String xpath) { 
		
		boolean result = false;
		try
		{
			driver.findElement(By.xpath(xpath));
			result=true;
		} catch (Exception e) 
		{
		
		}
		return result;
	}
	
	public static boolean verifyUrl(WebDriver driver,String expURL) {
		boolean result = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			
			result=true;
			
		}
		return result;	
	}
	
	public static boolean pageTile(WebDriver driver,String expPageTile) {
		boolean result = false;
		if (driver.getTitle().equalsIgnoreCase(expPageTile))
		{
			
			result= true;
			
		}
		return result;
		
	}

}
