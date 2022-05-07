package Lesson_9_12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BBCAuthorizationTest {

    private WebDriver driver;
    private BBCMainPage bbcMainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/y.sakh/IdeaProjects/HomeWork/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        bbcMainPage = PageFactory.initElements(driver, BBCMainPage.class);
        bbcMainPage.open();
    }

    @After
    public void close() {
        driver.quit();
    }

    @Test
    public void authorizationTest() {
        bbcMainPage.clickOnSignInBtn();
        bbcMainPage.setUserEmail();
        bbcMainPage.setUserPassword(validPassword);
        bbcMainPage.clickOnSubmitBtn();
        bbcMainPage.checkLoginWasSuccessful();
    }

    @Test
    public void invalidPasswordTest() {
        bbcMainPage.clickOnSignInBtn();
        bbcMainPage.setUserEmail();
        bbcMainPage.setUserPassword(invalidPassword);
        bbcMainPage.clickOnSubmitBtn();
        bbcMainPage.checkPasswordMessageIsDisplayed();
    }

    private final String validPassword = "123qweasd";
    private final String invalidPassword = "11111qqq";
}
