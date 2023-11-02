package com.beacon.steps;

import com.beacon.pages.sdHome;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class saucedemoStepDef {
    private final WebDriver driver = new ChromeDriver();

    @Given("I am on the SauceDemo page")
    public void sauceDemoPage(){
        driver.get(sdHome.SD_URL);
    }

    @And("I see the login screen")
    public void iSeeTheLoginScreen() {
        driver.findElement(By.xpath(sdHome.SD_USERNAME_FIELD));
    }

    @Then("I login as standard-user")
    public void iLoginAsStandardUser() {
        driver.findElement(By.xpath(sdHome.SD_USERNAME_FIELD)).sendKeys(sdHome.SD_VALID_USER);
        driver.findElement(By.xpath(sdHome.SD_PWD_FIELD)).sendKeys(sdHome.SD_VALID_PWD);
        driver.findElement(By.xpath(sdHome.SD_LOGIN_BUTTON)).click();
    }

    @And("I verify that I am logged in")
    public void iVerifyThatIAmLoggedIn(){
        driver.findElement(By.xpath(sdHome.SD_SWAG_LOGO));
    }

    @Then("the driver should close")
    public void theDriverShouldClose() {
        driver.quit();
    }

    @Given("I am on the inventory page")
    public void iAmOnTheInventoryPage() {
        String url = driver.getTitle();
    }

    @Then("I login as invalid user")
    public void iLoginAsInvalidUser() {
        driver.findElement(By.xpath(sdHome.SD_USERNAME_FIELD)).sendKeys(sdHome.SD_INVALID_USER);
        driver.findElement(By.xpath(sdHome.SD_PWD_FIELD)).sendKeys(sdHome.SD_VALID_PWD);
        driver.findElement(By.xpath(sdHome.SD_LOGIN_BUTTON)).click();
    }

    @And("I verify the invalid user error")
    public void iVerifyTheInvalidUserError() {
        Assert.assertTrue(driver.findElement(By.xpath(sdHome.SD_INVALID_ERROR)).isDisplayed());
    }

    @Then("I login as locked out user")
    public void iLoginAsLockedOutUser() {
        driver.findElement(By.xpath(sdHome.SD_USERNAME_FIELD)).sendKeys(sdHome.SD_LOCKED_USER);
        driver.findElement(By.xpath(sdHome.SD_PWD_FIELD)).sendKeys(sdHome.SD_VALID_PWD);
        driver.findElement(By.xpath(sdHome.SD_LOGIN_BUTTON)).click();
    }

    @And("I verify the locked out user error")
    public void iVerifyTheLockedOutUserError() {
        Assert.assertTrue(driver.findElement(By.xpath(sdHome.SD_LOCKED_ERROR)).isDisplayed());
    }
}
