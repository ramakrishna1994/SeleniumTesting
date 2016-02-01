package Libraries;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Objects.*;
import TestData.ReadExcel;

public class FormLogin {
	

	public static void loginForm(String testCaseName) throws Exception
	{
		
		HashMap<String,String> objectsRepo=PageObjects.loginObjects();
		HashMap<String,String> dataRepo = ReadExcel.getDataMap(Properties.loginFilePath, testCaseName);
		
		String userNameObj = objectsRepo.get("userName").toString();
		String userNamedata = dataRepo.get("userName").toString();
		CharSequence userName = userNamedata;
		
		String passwordObj = objectsRepo.get("password").toString();
		String passwordData = dataRepo.get("password").toString();
		CharSequence password = passwordData;
		
		String loginObj = objectsRepo.get("login").toString();
		String expectedMessage = dataRepo.get("message").toString();
		
		System.setProperty(Properties.chromeDriver, Properties.chromeDriverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get(Properties.URL);
		Thread.sleep(2000);
	    driver.findElement(By.id(userNameObj)).sendKeys(userName);
	    driver.findElement(By.id(passwordObj)).sendKeys(password);;
	    driver.findElement(By.xpath(loginObj)).click();
	    Thread.sleep(5000);
	 

	    boolean messageExists = driver.getPageSource().contains(expectedMessage);
	  
	    System.out.println(messageExists);
	    Assert.assertEquals(true, messageExists);
	    driver.close();
		
	}	

}		
	

