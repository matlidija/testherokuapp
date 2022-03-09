package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(xpath = "//i[@class=\"fa fa-2x fa-sign-in\"]")
    WebElement loginButton;
    @FindBy(id = "flash")
    WebElement invalidUsernameText;
    @FindBy(id = "flash")
    WebElement logoutText;
    @FindBy(xpath = "//img[@src=\"/img/forkme_right_green_007200.png\"]")
    WebElement gitHubLinkLogin;
    @FindBy(xpath = "//div[@class=\"large-4 large-centered columns\"]")
    WebElement seleniumTextLogin;
    @FindBy(xpath = "//h2[contains(text(),\"Login Page\")]")
    WebElement loginPageText;
    @FindBy(className = "subheader")
    WebElement subheaderText;
    @FindBy(linkText = "Elemental Selenium")
    WebElement seleniumLink;
    @FindBy(xpath = "//button[@class=\"radius\"]")
    WebElement loginBgColorButton;


    public String logoutBgIsColor(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutText));
        return logoutText.getCssValue("background-color");
    }

    public String loginButtonIsColor(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginBgColorButton));
        return loginBgColorButton.getCssValue("background-color");
    }

    public String invalidMsgGetColor(){
        wdwait.until(ExpectedConditions.elementToBeClickable(invalidUsernameText));
        return invalidUsernameText.getCssValue("background-color");
    }

    public void clickGitHubLinkLogin(){
        wdwait.until(ExpectedConditions.elementToBeClickable(gitHubLinkLogin));
        gitHubLinkLogin.click();
    }
    public String seleniumLinkIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumLink));
        return seleniumLink.getText();
    }

    public boolean seleniumLinkIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumLink));
        return seleniumLink.isDisplayed();
    }

    public String loginButtonIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
        return loginButton.getText();
    }

    public boolean loginButtonIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
        return loginButton.isDisplayed();
    }

    public String subheaderTextIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(subheaderText));
        return subheaderText.getText();
    }

    public boolean subheaderTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(subheaderText));
        return subheaderText.isDisplayed();
    }


    public String loginPageTextIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginPageText));
        return loginPageText.getText();
    }

    public boolean loginPageTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginPageText));
        return loginPageText.isDisplayed();
    }

    public String seleniumTextLoginIsText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumTextLogin));
        return seleniumTextLogin.getText();
    }

    public boolean seleniumLinkLoginIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumTextLogin));
        return seleniumTextLogin.isDisplayed();
    }

    public String gitHubLinkLoginIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(gitHubLinkLogin));
        return gitHubLinkLogin.getText();
    }

    public boolean gitHubLinkLoginImgIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(gitHubLinkLogin));
        return gitHubLinkLogin.isDisplayed();
    }
    public boolean logoutTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutText));
        return logoutText.isDisplayed();
    }

    public String logoutTextIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutText));
        return logoutText.getText();
    }

    public boolean invalidUsernameTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(invalidUsernameText));
        return invalidUsernameText.isDisplayed();
    }

    public String invalidUsernameTextIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(invalidUsernameText));
        return invalidUsernameText.getText();
    }

    public void clickLoginButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void inputUsernameField(String username){
        wdwait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void inputPasswordField(String password){
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);

    }

}
