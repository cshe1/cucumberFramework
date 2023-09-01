package com.beacon.steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class saucedemoStepDef {
    private final WebDriver driver = new ChromeDriver();

    @Given("I am on the SauceDemo page")
    public void sauceDemoPage(){
        driver.get("https://www.saucedemo.com/");
    }

    @And("I see the login screen")
    public void iSeeTheLoginScreen() {
        driver.findElement(By.xpath("//input[@id='user-name']"));
    }

    @Then("I login as standard-user")
    public void iLoginAsStandardUser() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @And("I verify that I am logged in")
    public void iVerifyThatIAmLoggedIn(){
        driver.findElement(By.xpath("//div[@class='app_logo' and text()='Swag Labs']"));
    }

    @Then("the driver should close")
    public void theDriverShouldClose() {
        driver.quit();
    }
}
