package com.glushkoproduction.note;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//    @FindBy(xpath = "//*[@id=\"formtest\"]/input[1]")
    @FindBy(xpath = "/html/body/div[5]/form/input[1]")
    private WebElement loginField;

//    @FindBy(xpath = "//*[@id=\"formtest\"]/input[2]")
    @FindBy(xpath = "/html/body/div[5]/form/input[2]")
    private WebElement passwdField;

//    @FindBy(xpath = "//*[@id=\"formtest\"]/button")
    @FindBy(xpath = "/html/body/div[5]/form/button")
    private WebElement loginBtn;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public void clickLoginBtn() {
        loginBtn.click(); }

}
