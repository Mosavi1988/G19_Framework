package com.Briteerp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends TestBasePage{

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[4]/a/span")
    public WebElement contactTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    private  WebElement createbutton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;

    @FindBy(name = "street")
    public WebElement streetField;

    @FindBy(name = "city")
    public WebElement cityField;

    @FindBy(id = "o_field_input_344")
    public WebElement stateDropDown;

//    @FindBy(xpath = "//a[.='Aveiro']")
//    public WebElement statedSelected;

    @FindBy(id = "o_field_input_345")
    public WebElement zipCodeField;

    @FindBy(id = "o_field_input_346")
    public WebElement countryDropDown;

    @FindBy(id = "o_field_input_347")
    public WebElement tINField;

    @FindBy(id = "o_field_input_348")
    public WebElement tagDropDown;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createTag;

    @FindBy(id = "o_field_input_349")
    public WebElement positionField;

    @FindBy(id = "o_field_input_350")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[@accesskey='s']")
    private WebElement saveButton;








    public void setCreatebutton(){
        createbutton.click();
    }

    public void setSaveButton(){
        saveButton.click();
    }


}
