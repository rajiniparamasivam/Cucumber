package com.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableStepdef {

	WebDriver driver;
	
	@Given("User is on the page")
	public void user_is_on_the_page() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	}
	@When("User enter the Search product")
	public void user_enter_the_search_product(io.cucumber.datatable.DataTable dataTable) {
		List<String> emp = dataTable.asList();
		String string = emp.get(1);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(string,Keys.ENTER);
		
	}
	



}
