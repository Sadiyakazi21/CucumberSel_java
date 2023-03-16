package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class greenCartStepDefination {
public WebDriver driver;
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/home/sadiya/Downloads/chromedriver"); 
		driver=new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@type='search'")).sendKeys(shortName);
	   String productName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	   System.out.print(productName+"kkkk");
	}
	@Then("user serched for same shortname in offer page to check if the product exits")
	public void user_serched_for_same_shortname_in_offer_page_to_check_if_the_product_exits() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    driver.findElement(By.linkText("Top Deals")).click();
	}
}
