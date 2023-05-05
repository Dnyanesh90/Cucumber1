package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoGuru99 {
	WebDriver driver;
	@Given("open the Guru99 url")
	public void open_the_guru99_url() {
//		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");	    
	}

	@When("enter the valid first name and last name and phone and email")
	public void enter_the_valid_first_name_and_last_name_and_phone_and_email() {
	    driver.findElement(By.name("firstName")).sendKeys("DNYANESHWAR");
	    driver.findElement(By.name("lastName")).sendKeys("KADAM");
	    driver.findElement(By.name("phone")).sendKeys("7507847874");
	    driver.findElement(By.name("userName")).sendKeys("Dnyanesh1990");
	}

	@When("enter the valid address and city and state and postal code and country")
	public void enter_the_valid_address_and_city_and_state_and_postal_code_and_country() {
		driver.findElement(By.name("address1")).sendKeys("AP ATNOOR TAL JALKOT DIST LATUR");
		driver.findElement(By.name("city")).sendKeys("LATUR");
		driver.findElement(By.name("state")).sendKeys("MAHARASHTRA");
		driver.findElement(By.name("postalCode")).sendKeys("413532");
		WebElement wb=driver.findElement(By.name("country"));
		Select sel =new Select(wb);
		sel.selectByVisibleText("INDIA");
		WebElement abc =sel.getFirstSelectedOption();
		String a=abc.getText();
		System.out.println(a);
	}

	@When("enter valid username and password and confpassword")
	public void enter_valid_username_and_password_and_confpassword() {
	    
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("email")).sendKeys("kadamdnyana@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dk@7798913075");
		driver.findElement(By.name("confirmPassword")).sendKeys("Dk@7798913075");
	    driver.findElement(By.name("submit")).click();
	}

}
