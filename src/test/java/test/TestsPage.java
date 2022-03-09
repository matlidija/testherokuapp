package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class TestsPage extends BaseTest {
    LoginPage loginPage;
    SecurePage securePage;
    Utility utility;




    @Before
    public void setUpTest(){

        loginPage = new LoginPage();
        securePage = new SecurePage();
        utility = new Utility();
    }
    //7
    @Test
    public void loginSuccessTest(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.loggedTextIsDisplay());
        Assert.assertEquals("You logged into a secure area!\n" +
                "×", securePage.loggedTextIsGetText());
        Assert.assertTrue(securePage.footerTextIsDisplay());
        Assert.assertEquals("Powered by Elemental Selenium", securePage.footerTextIsGet());

    }
    //8
    @Test
    public void logoutTest(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        securePage.clickLogoutButton();

        Assert.assertTrue(loginPage.logoutTextIsDisplay());
        Assert.assertEquals("You logged out of the secure area!\n" +
                "×", loginPage.logoutTextIsGetText());

    }
    //1
    @Test
    public void emptyUserPass(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //2
    @Test
    public void emptyPassword(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your password is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //3
    @Test
    public void emptyUsername(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //4
    @Test
    public void wrongLoginUser(){
        loginPage.inputUsernameField("Lidija");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //5
    @Test
    public void wrongloginPass(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("123456");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your password is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //6
    @Test
    public void wrongUserPass(){
        loginPage.inputUsernameField("Lidija");
        loginPage.inputPasswordField("Super");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!", loginPage.invalidUsernameTextIsGet());
    }
    //10
    @Test
    public void removeSuccessX(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.loggedTextIsDisplay());
        Assert.assertEquals("You logged into a secure area!\n" +
                "×", securePage.loggedTextIsGetText());
        securePage.clickCloseX();
    }
    //9
    @Test
    public void removeEmptyUserPassMsg(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!\n" +
                "×", loginPage.invalidUsernameTextIsGet());
        securePage.clickCloseX();
    }
    //11
    @Test
    public void removeLogoutMsg(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        securePage.clickLogoutButton();

        Assert.assertTrue(loginPage.logoutTextIsDisplay());
        Assert.assertEquals("You logged out of the secure area!\n" +
                "×", loginPage.logoutTextIsGetText());
        securePage.clickCloseX();

    }
    //12
    @Test
    public void linkSuccesGitHub(){
        Assert.assertTrue(loginPage.gitHubLinkLoginImgIsDisplay());
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.gitHubLinkSecureImgIsDisplay());
    }
    //13
    @Test
    public void linkSelenium(){
        Assert.assertTrue(loginPage.seleniumLinkIsDisplay());
        Assert.assertEquals("Elemental Selenium", loginPage.seleniumLinkIsGet());
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.seleniumLinkIsDisplay());
        Assert.assertEquals("Elemental Selenium", securePage.seleniumLinkIsGet());

    }
    //14
    @Test
    public void linkSuccesSelenium(){
        Assert.assertTrue(loginPage.seleniumLinkLoginIsDisplay());
        Assert.assertEquals("Powered by Elemental Selenium", loginPage.seleniumTextLoginIsText());
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.seleniumLinkSuccesIsDisplay());
        Assert.assertEquals("Powered by Elemental Selenium", securePage.seleniumTextSuccesIsGet());
    }
    //15
    @Test
    public void loginPageText(){
        Assert.assertTrue(loginPage.loginPageTextIsDisplay());
        Assert.assertEquals("Login Page", loginPage.loginPageTextIsGet());
    }
    //16
    @Test
    public void subHeader(){
        Assert.assertTrue(loginPage.subheaderTextIsDisplay());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username" +
                " and SuperSecretPassword! for the password." +
                " If the information is wrong you should see error messages.", loginPage.subheaderTextIsGet());
    }
    //17
    @Test
    public void textLoginButton(){
        Assert.assertTrue(loginPage.loginButtonIsDisplay());
        Assert.assertEquals("Login", loginPage.loginButtonIsGetText());
    }
    //18
    @Test
    public void TextSecureArea(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.secureAreaTextIsDisplay());
        Assert.assertEquals("Secure Area", securePage.secureAreaTextIsGetText());
    }
    //19
    @Test
    public void textWelcomeSecureArea(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.welcomeTextIsDisplay());
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.",
                securePage.welcomeTextIsGetText());
    }
    //20
    @Test
    public void textLogoutButton(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.logoutButtonIsDisplay());
        Assert.assertEquals("Logout", securePage.logoutButtonIsGetText());
    }
    //23
    @Test
    public void emptyUsernameColor(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertEquals(utility.bgColorExpected, loginPage.invalidMsgGetColor());
    }
    //24
    @Test
    public void colorButton(){
        Assert.assertEquals(utility.bgColorButton, loginPage.loginButtonIsColor());
    }
    //21
    @Test
    public void loginSuccessTestColorBg() {
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertEquals(utility.bgColorSucces, securePage.succesColorBaner());
    }
    //22
    @Test
    public void colorLogout(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        securePage.clickLogoutButton();
        Assert.assertEquals(utility.bgColorLogout, loginPage.logoutBgIsColor());
    }
    //24
    @Test
    public void colorLogoutButton(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertEquals(utility.bgColorButton, securePage.logoutButtonIsColor());
    }
}
