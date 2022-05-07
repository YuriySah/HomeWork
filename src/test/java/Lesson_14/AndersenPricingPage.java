package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class AndersenPricingPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement getPriceBtn;
    private WebElement sendBtn;
    private WebElement requestSpecialistsBtn;
    private WebElement priceBtn;
    private WebElement emailErrorMessage;
    private WebElement phoneNumberErrorMessage;
    private WebElement requestWindow;
    private WebElement acceptCookiesBtn;
    private Actions actions;

    public AndersenPricingPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
    }

    public void clickOnPriceBtn() {
        priceBtn = driver.findElement(By.cssSelector("[class=\"button-module--button--P1TTA button-module--sizeSM--CuRl3 button-module--theme-header-transparent--a9CXO\"]"));
        priceBtn.click();
    }

    public void open() {
        driver.get("https://andersenlab.com/");
        wait.until(visibilityOfElementLocated(By.id("intro")));
    }

    public void acceptCookies() {
        acceptCookiesBtn = driver.findElement(By.cssSelector("[class=\"button-module--button--P1TTA button-module--sizeSM--CuRl3 CookiesPolicy-module--button--JZrW1\"]"));
        acceptCookiesBtn.click();
    }

    public void clickOnRequestSpecialistsBtn() {
        wait.until(visibilityOfElementLocated(By.cssSelector("[class=\"TitleWith-module--container--EFW0t\"]")));
        requestSpecialistsBtn = driver.findElement(By.cssSelector("[class=\"TitleWith-module--buttonText--3jDEo\"]"));
        actions.moveToElement(requestSpecialistsBtn);
        actions.perform();
        requestSpecialistsBtn.click();
    }

    public void clickOnGetPriceBtn() {
        wait.until(visibilityOfElementLocated(By.cssSelector("[class=\"button-module--button--P1TTA\"]")));
        getPriceBtn = driver.findElement(By.cssSelector("[class=\"button-module--button--P1TTA\"]"));
        actions.moveToElement(getPriceBtn);
        actions.perform();
        getPriceBtn.click();
    }

    public void clickOnSendBtn() {
        wait.until(visibilityOfElementLocated(By.cssSelector("[class=\"button-module--button--P1TTA button-module--sizeMD--QGOCN button-module--fullWidthMobile--NWml4\"]")));
        sendBtn = driver.findElement(By.cssSelector("[class=\"button-module--button--P1TTA button-module--sizeMD--QGOCN button-module--fullWidthMobile--NWml4\"]"));
        sendBtn.click();
    }

    public void checkRequestWindowIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"requestConsultation-module--container--XPfof\"]")));
        requestWindow = driver.findElement(By.cssSelector("[class=\"requestConsultation-module--container--XPfof\"]"));
        assertTrue(requestWindow.isDisplayed());
    }

    public void checkErrorMessagesIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Please, enter your corporate email')]")));
        emailErrorMessage = driver.findElement(By.xpath("//*[contains(text(), 'Please, enter your corporate email')]"));
        phoneNumberErrorMessage = driver.findElement(By.xpath("//*[contains(text(), 'Please, enter your phone number')]"));
        assertTrue(emailErrorMessage.isDisplayed());
        assertTrue(phoneNumberErrorMessage.isDisplayed());
    }
}
