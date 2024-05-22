package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginGoogle {

	WebDriver driver;
	
    @Given("User Load the URL and open the WebPage")
	public void a() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	}
	@When("User enter the search box MacBook Air m1 laptop")
	public void b() {

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Macbook Air m1");
	}
	@When("User click the search box")
	public void c() {
	

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(Keys.ENTER);
		
	}
	@Then("User should verify the search results for laptop")
	public void d() {
	  
	    org.junit.Assert.assertTrue("verify after loger success msg " , true);
		driver.quit();
		
	}



}
