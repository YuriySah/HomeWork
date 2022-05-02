package Lesson_14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AndersenPricingTest {

    private WebDriver driver;
    private AndersenPricingPage andersenPricingPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/y.sakh/IdeaProjects/HomeWork/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        andersenPricingPage = PageFactory.initElements(driver, AndersenPricingPage.class);
        andersenPricingPage.open();
    }

    @After
    public void close() {
        driver.quit();
    }

    @Test
    public void openRequestSpecialistsWindowTest() {
        andersenPricingPage.acceptCookies();
        andersenPricingPage.clickOnPriceBtn();
        andersenPricingPage.clickOnRequestSpecialistsBtn();
        andersenPricingPage.checkRequestWindowIsDisplayed();
    }

    @Test
    public void sendEmptyPrisingWindowTest() {
        andersenPricingPage.acceptCookies();
        andersenPricingPage.clickOnPriceBtn();
        andersenPricingPage.clickOnGetPriceBtn();
        andersenPricingPage.clickOnSendBtn();
        andersenPricingPage.checkErrorMessagesIsDisplayed();
    }
}
