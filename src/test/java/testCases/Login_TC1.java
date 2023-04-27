package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

public class Login_TC1 extends TestBase {

    @Test()
    public void login_and_logout() throws InterruptedException {
        test = extent.createTest("Login and logout", "Case 1: User needs to verify if he can login and logout")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://demoqa.com/books");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        utils.waitForElementVisible(HomePage.LoginBtn);
        utils.clickOnButton(HomePage.LoginBtn);
        test.log(Status.INFO, "Click on Login Button(Homepage)");
        logger.info("Click on Login Button(Homepage)");

        utils.waitForElementVisible(LoginPage.userName);
        utils.enterText(LoginPage.userName,"username");
        test.log(Status.INFO, "Add username");
        logger.info("Add username");

        utils.waitForElementVisible(LoginPage.password);
        utils.enterText(LoginPage.password,"password");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");

        utils.waitForElementVisible(LoginPage.loginBtn);
        utils.clickOnButton(LoginPage.loginBtn);
        test.log(Status.INFO, "Click on Login Button");
        logger.info("Click on Login Button");

        utils.waitForElementVisible(LogoutPage.logoutBtn);
        utils.clickOnButton(LogoutPage.logoutBtn);
        test.log(Status.INFO, "Click on Logout Button");
        logger.info("Click on Logout Button");


    }
}
