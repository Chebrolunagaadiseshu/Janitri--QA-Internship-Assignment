package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        LoginPage login = new LoginPage(driver);
        Assert.assertFalse(login.isLoginButtonEnabled());
    }

    @Test
    public void testPasswordMaskedbutton() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isPasswordMasked());
        login.togglePasswordVisibility();
        Assert.assertFalse(login.isPasswordMasked());
    }

    @Test
    public void testInvalidLoginShowErrorMsg() throws InterruptedException {
    
        LoginPage login = new LoginPage(driver);
        login.enterCredentials("abc@abc.com", "invalidpass");
        Thread.sleep(3000);
        String errorText = login.getErrorMessage();
        Assert.assertTrue(errorText.toLowerCase().contains("invalid"));
        System.out.println(errorText);
    }

    @Test
    public void testElementsPresence() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.areAllElementsVisible());
    }
}
