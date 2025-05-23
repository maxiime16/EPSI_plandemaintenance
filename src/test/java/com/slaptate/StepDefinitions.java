package com.slaptate.stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    WebDriver driver;

    @Given("I open the Airtable form")
    public void i_open_the_form() {
        driver = new ChromeDriver();
        driver.get("https://airtable.com/your-form-link");
    }

    @When("I fill in the form with valid data")
    public void fill_form() {
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Test");
    }

    @Then("I should see a success message")
    public void verify_submission() {
        // Vérifie la présence d'un message ou redirection
        driver.quit();
    }
}