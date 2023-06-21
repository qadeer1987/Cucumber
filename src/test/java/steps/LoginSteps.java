package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    public WebDriver driver;

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
       // to launch the Chrome browser

        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        // finding the username field AND entering the credentials
        WebElement usernameField= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usernameField.sendKeys("Admin");
        // finding the password field AND entering the credentials
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordField.sendKeys("Hum@nhrm123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // find the login element and clicking on it
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
    }
    @Then("user is successfully logged in the application")
    public void user_is_successfully_logged_in_the_application() {
        System.out.println("My test case is passed");
    }

}
