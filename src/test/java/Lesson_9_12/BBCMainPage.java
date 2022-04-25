package Lesson_9_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BBCMainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "idcta-username")
    WebElement signInBtn;

    @FindBy (id = "user-identifier-input")
    WebElement userEmail;

    @FindBy (id = "password-input")
    WebElement userPassword;

    @FindBy (id = "submit-button")
    WebElement submitBtn;

    @FindBy (id = "form-message-password")
    WebElement passwordMessage;

    public BBCMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
    }

    public void open() {
        driver.get("https://www.bbc.com/");
    }

    public void clickOnSignInBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idcta-username")));
        signInBtn.click();
    }

    public void setUserEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-identifier-input")));
        userEmail.sendKeys("sah.yuriy@gmail.com");
    }

    public void setUserPassword(String password) {
        userPassword.sendKeys(password);
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

    public void checkLoginWasSuccessful(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idcta-username")));
        assertTrue(signInBtn.getText().equals("Your account"));
    }

    public void checkPasswordMessageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-message-password")));
        assertTrue(passwordMessage.getText().equals("Uh oh, that password doesn’t match that account. Please try again."));
    }
}
