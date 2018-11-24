package com.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	@Given("^open facebook page$")
	public void openfacebookpage(){
		System.setProperty("webdriver.chrome.driver","G:\\Radicals\\jars\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("^I enter Login name$")
	public void i_enter_Login_name() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver","G:\\Radicals\\jars\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextBOx=driver.findElement(By.xpath("//input[@name='email']"));
		Actions myAction=new Actions(driver);
		
		Actions obj=myAction.moveToElement(emailTextBOx).click().keyDown(Keys.SHIFT).sendKeys("selenium");
		//Actions obj=myAction.moveToElement(emailTextBOx).click().keyDown(Keys.SHIFT).keyDown(Keys.DELETE).sendKeys("selenium");
		
		
		obj.build().perform();
		
	}

	@Then("^I verify textbox value$")
	public void i_verify_textbox_value() throws Throwable {
	  
		
		
	}


}
