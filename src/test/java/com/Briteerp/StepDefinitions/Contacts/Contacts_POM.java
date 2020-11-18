package com.Briteerp.StepDefinitions.Contacts;

import com.Briteerp.Pages.ContactsPage;
import com.Briteerp.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Contacts_POM {
    ContactsPage contactsPage = new ContactsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @Given("I am in the contact function page")
    public void i_am_in_the_contact_function_page() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(5000);
        actions.moveToElement(contactsPage.contactTab).click().perform();
        Thread.sleep(3000);

    }

    @Given("I click on the create button")
    public void i_click_on_the_create_button() {
        contactsPage.setCreatebutton();

    }
    @Given("the user provides the required information")
    public void the_user_provides_the_required_information(Map<String, String> form) throws InterruptedException {

        Thread.sleep(3000);
          contactsPage.nameField.sendKeys(form.get("name"));
          contactsPage.streetField.sendKeys(form.get("Street"));
          contactsPage.cityField.sendKeys(form.get("City"));
          contactsPage.stateDropDown.sendKeys(form.get("State")+Keys.ENTER);
          contactsPage.zipCodeField.sendKeys(form.get("Zip"));
          contactsPage.countryDropDown.sendKeys(form.get("Country"));
          contactsPage.tINField.sendKeys(form.get("TIN"));
          contactsPage.tagDropDown.sendKeys(form.get("Tags"));


          contactsPage.positionField.click();
          Thread.sleep(3000);
            contactsPage.createTag.click();
            contactsPage.positionField.sendKeys(form.get("Job Position"));
            contactsPage.phoneNumber.sendKeys(form.get("Phone"));



    }
    @Then("I should be able to add new contact")
    public void i_should_be_able_to_add_new_contact() {
        contactsPage.setSaveButton();

    }
}
