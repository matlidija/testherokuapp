package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePage extends BaseTest {
    public SecurePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "flash")
    WebElement loggedText;
    @FindBy(xpath = "//h2[contains(text(),\"Secure Area\")]")
    WebElement secureAreaText;
    @FindBy(className = "subheader")
    WebElement welcomeText;
    @FindBy(xpath = "//div[@style=\"text-align: center;\"]")
    WebElement footerText;
    @FindBy(xpath = "//i[@class=\"icon-2x icon-signout\"]")
    WebElement logoutButton;
    @FindBy(className = "close")
    WebElement closeX;
    @FindBy(xpath = "//img[@alt=\"Fork me on GitHub\"]")
    WebElement gitHubLinkSecure;
    @FindBy(xpath = "//div[@class=\"large-4 large-centered columns\"]")
    WebElement seleniumTextSucces;
    @FindBy(linkText = "Elemental Selenium")
    WebElement seleniumLink;

    public String logoutButtonIsColor(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        return logoutButton.getCssValue("background-color");
    }
    public String succesColorBaner(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loggedText));
        return loggedText.getCssValue("background-color");
    }

    public String seleniumLinkIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumLink));
        return seleniumLink.getText();
    }
    public boolean seleniumLinkIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumLink));
        return seleniumLink.isDisplayed();
    }
    public String logoutButtonIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        return logoutButton.getText();
    }

    public boolean logoutButtonIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        return logoutButton.isDisplayed();
    }

    public String seleniumTextSuccesIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumTextSucces));
        return seleniumTextSucces.getText();
    }

    public boolean seleniumLinkSuccesIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(seleniumTextSucces));
        return seleniumTextSucces.isDisplayed();
    }

    public boolean gitHubLinkSecureImgIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(gitHubLinkSecure));
        return gitHubLinkSecure.isDisplayed();
    }

    public void clickCloseX(){
        wdwait.until(ExpectedConditions.elementToBeClickable(closeX));
        closeX.click();
    }

    public void clickLogoutButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

    public boolean footerTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(footerText));
        return footerText.isDisplayed();
    }

    public String footerTextIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(footerText));
        return footerText.getText();
    }


    public boolean welcomeTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(welcomeText));
        return welcomeText.isDisplayed();
    }
    public String welcomeTextIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(welcomeText));
        return welcomeText.getText();
    }

    public boolean secureAreaTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(secureAreaText));
        return secureAreaText.isDisplayed();
    }

    public String secureAreaTextIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(secureAreaText));
        return secureAreaText.getText();
    }

    public boolean loggedTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loggedText));
        return loggedText.isDisplayed();
    }
    public String loggedTextIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loggedText));
        return loggedText.getText();
    }
}
