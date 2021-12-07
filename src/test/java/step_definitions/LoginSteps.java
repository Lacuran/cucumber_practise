package step_definitions;

import driver.BaseAbstractTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class LoginSteps extends BaseAbstractTest {


    @Given("User is on Application Home Page")
    public void userIsOnApplicationHomePage() {
        getDriver().navigateToUrl("http://the-internet.herokuapp.com/");
        getDriver().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("Application Page Title is The Internet")
    public void applicationPageTitleIsTheInternet() {
        String actualTitle = getDriver().getDriver().getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("User clicks on Form Authentication")
    public void userClicksOnSignInButton() {
        String xpath = "//*[text()='Form Authentication']";
        WebElement logInButton = getDriver().getElement(By.xpath(xpath));
        logInButton.click();
    }

    @Then("User enters username and password")
    public void userEntersUsernameAndPassword() {
        String username = "tomsmith";
        String userxpath = "//*[@name='username']";
        String password = "SuperSecretPassword!";
        String passxpath = "//*[@name='password']";
        WebElement userInput = getDriver().getElement(By.xpath(userxpath));
        WebElement passInput = getDriver().getElement(By.xpath(passxpath));

        userInput.sendKeys(username);
        passInput.sendKeys(password);

    }

    @And("User clicks on Login Button")
    public void userClicksOnLoginButton() {
        String xpath = "//*[@*='submit']";
        WebElement loginButton = getDriver().getElement(By.xpath(xpath));
        loginButton.click();
    }

    @When("Application Alert is present")
    public void userNavigateToUserProfilePage() {
        String xpath = "//*[@id='flash']";
        WebElement loginMessage = getDriver().getElement(By.xpath(xpath));
        boolean expectedSuccessfulLoginMessage = loginMessage.isDisplayed();
        Assert.assertTrue(expectedSuccessfulLoginMessage);
    }

    @Then("User clicks Logout button")
    public void userClicksLogoutButton() {
        String xpath = "//*[@class='button secondary radius']";
        WebElement logoutButton = getDriver().getElement(By.xpath(xpath));
        logoutButton.click();
    }

    @And("Application Logout Alert is present")
    public void applicationLogoutAlertIsPresent() {
        String xpath = "//*[@id='flash']";
        WebElement logoutMessage = getDriver().getElement(By.xpath(xpath));
        boolean expectedSuccessfulLoginMessage = logoutMessage.isDisplayed();
        Assert.assertTrue(expectedSuccessfulLoginMessage);
    }

}
