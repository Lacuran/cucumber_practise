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

public class ButtonSteps extends BaseAbstractTest {
    @Given("User is on Application Web Page")
    public void userIsOnApplicationWebPage() {
        getDriver().navigateToUrl("http://the-internet.herokuapp.com/");
        getDriver().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("App Page Title is The Internet")
    public void appPageTitleIsTheInternet() {
        String actualTitle = getDriver().getDriver().getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("User clicks on Add or Remove Elements on HomePage")
    public void userClicksOnAddRemoveElementsOnHomePage() {
        String xpath = "//*[text()='Add/Remove Elements']";
        WebElement addRemovePage = getDriver().getElement(By.xpath(xpath));
        addRemovePage.click();
    }

    @Then("User clicks on Add element")
    public void userClicksOnAddElement() {
        String xpath = "//*[text()='Add Element']";
        WebElement addElementButton = getDriver().getElement(By.xpath(xpath));
        addElementButton.click();
    }

    @And("Delete button is present")
    public void deleteButtonIsPresent() {
        String deleteButtonXpath = "//button[@class='added-manually']";
        WebElement deleteButton = getDriver().getElement(By.xpath(deleteButtonXpath));


    }

    @Given("User is on App Home Page")
    public void userIsOnAppHomePage() {
        getDriver().navigateToUrl("http://the-internet.herokuapp.com/");
        getDriver().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("Web Page Title is The Internet")
    public void webPageTitleIsTheInternet() {
        String actualTitle = getDriver().getDriver().getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("User clicks on delete button")
    public void userClicksOnDeleteButton() {
        String deleteButtonXpath = "//button[@class='added-manually']";
        WebElement deleteButton = getDriver().getElement(By.xpath(deleteButtonXpath));
        deleteButton.click();
    }

    @And("Delete button is absent")
    public void deleteButtonIsAbsent() {
        String deleteButtonXpath = "//*[text()='Delete']";
        //WebElement deleteButton = getDriver().getElement(By.xpath(deleteButtonXpath));
    }
}
