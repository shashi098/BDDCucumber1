package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;


public class LoginStepDefinition {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver;
	
	@Given("then user opens the browser and enters the url")
	public void then_user_opens_the_browser_and_enters_the_url() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable--notifications");
		
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.ubuy.co.in/");
		
	}
	
	

	@Given("the user mouse hover to account")
	public void the_user_mouse_hover_to_account() {
		
        Actions ac = new Actions(driver);
		
		WebElement account = driver.findElement(By.xpath("//abbr[text()='Account']"));
		ac.moveToElement(account).perform();
		
	}

	@Given("click on sign in button")
	public void click_on_sign_in_button() {
		
		WebElement signin = driver.findElement(By.xpath("//abbr[text()='Account']/following::a[.=' Sign in']"));
		
		signin.click();
		
	}

	@Then("he land Customer login page")
	public void he_land_Customer_login_page() {
	   
	}
	
	//

//	@Then("user enters the valid username and password")
//	public void user_enters_the_valid_username_and_password() {
//		
//		WebElement username = driver.findElement(By.xpath("//input[@name='login[username]']"));
//		username.sendKeys("sk724677@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
//		password.sendKeys("shashi098");
//		
//	  
//	}
	
	@Then("user enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String string, String string2) {
		WebElement username = driver.findElement(By.xpath("//input[@name='login[username]']"));
		username.sendKeys(string);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
		password.sendKeys(string2);
	   
	}


	@Then("click on Login Button")
	public void click_on_Login_Button() {
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		
	}

	@Then("User dashboard page with username Should be displayed")
	public void user_dashboard_page_with_username_Should_be_displayed() {
		
		
		WebElement name = driver.findElement(By.xpath("//abbr[text()='SHASHI KUM.,']"));
		
		String actual = name.getText().substring(0, 6);
		System.out.println(actual);
		
		String expected="SHASHI";
		Assert.assertEquals(actual, expected);
		System.out.println("pass");
		
	}

	@Then("close the brower")
	public void close_the_brower() {
		
		driver.close();
	   
	}
	
//	@Then("user enters the invalid username and password")
//	public void user_enters_the_invalid_username_and_password() {
//		WebElement username = driver.findElement(By.xpath("//input[@name='login[username]']"));
//		username.sendKeys("sk24677@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
//		password.sendKeys("shashi");
//	    
//	}
	
	
	@Then("user enters the invalid {string} and {string}")
	public void user_enters_the_invalid_and(String string, String string2) {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='login[username]']"));
		username.sendKeys(string);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
		password.sendKeys(string2);
	    
	}
	
	
	@Then("Invalid credential must be displayed")
	public void invalid_credential_must_be_displayed() {
		
		WebElement error = driver.findElement(By.xpath("//span[text()='Invalid email or password.']"));
	   
		System.out.println(error.isDisplayed());
		
	}
	
	

@Then("select search box and search for product")
public void select_search_box_and_search_for_product(DataTable dt) {
	List<List<String>> table = dt.asLists();
	
     driver.findElement(By.xpath("//input[@name='q']")).sendKeys(table.get(3).get(0),Keys.ENTER);
   
}





	


}
