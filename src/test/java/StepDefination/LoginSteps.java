package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	WebDriver driver =Hooks.driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}
	@When("user enter username and password")
	public void user_enter_username_and_password() throws Exception {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("visual_user");
		Thread.sleep(2000);
	   
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws Exception {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	    
	}
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    	}
}
