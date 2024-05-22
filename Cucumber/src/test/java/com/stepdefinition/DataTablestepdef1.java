package com.stepdefinition;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTablestepdef1 {

	WebDriver driver;
	
	@Given("User is on amazon page")
	public void user_is_on_amazon_page() {
		System.setProperty("Webdriver.chrome.driver", "Users/raj/Downloads/chromedriver-mac-x64-2/chromedriver ");
	  //  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	

	@When("User enter the Search product for amazon page")
	public void user_enter_the_search_product_for_amazon_page(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    Map<String, String> m = dataTable.asMap();
	    String string = m.get("Tv");
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchBox.sendKeys(string,Keys.ENTER);
	}
	

	@Then("User should verifying search product")
	public void user_should_verifying_search_product() {
	   
	}











}
