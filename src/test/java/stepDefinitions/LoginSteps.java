package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver d;
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {

		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com");
		//throw new io.cucumber.java.PendingException();
	}
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() throws InterruptedException {
//		d.manage().window().maximize();
//		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(3000);
		//throw new io.cucumber.java.PendingException();
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		//throw new io.cucumber.java.PendingException();
	}
	
		
		@Then("I should be redirected to the dashboard")
		public void i_should_be_redirected_to_the_dashboard() {
		    // Write code here that turns the phrase above into concrete actions
			
			System.out.println(d.getCurrentUrl());
			String actual = d.getCurrentUrl();
			String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			Assert.assertEquals(actual, expected);
//		    throw new io.cucumber.java.PendingException();
		}
//		throw new io.cucumber.java.PendingException();
	

	@After
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		d.quit();
	}
}
		
	
