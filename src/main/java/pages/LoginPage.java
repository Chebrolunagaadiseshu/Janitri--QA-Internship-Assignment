package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "email")
    WebElement userId;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement loginButton;

    @FindBy(xpath = "//img[@class='passowrd-visible']") // Update if needed
    WebElement eyeIcon;

    @FindBy(xpath = "//p[contains(text(),'Invalid Credentials')]")
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isLoginButtonEnabled() {
        return loginButton.isEnabled();
    }

    public boolean isPasswordMasked() {
        return password.getAttribute("type").equals("password");
    }

    public void togglePasswordVisibility() {
        eyeIcon.click();
    }

    public void enterCredentials(String email, String pwd) {
        userId.sendKeys(email);
        password.sendKeys(pwd);
        loginButton.click();
    }

    public String getErrorMessage() {
    	  

    	    return errorMessage.getText();
    }

    public boolean areAllElementsVisible() {
        return userId.isDisplayed() && password.isDisplayed() &&
               loginButton.isDisplayed() && eyeIcon.isDisplayed();
    }
}
