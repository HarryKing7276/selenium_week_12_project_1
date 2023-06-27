package testsuite;
/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 2. userShouldLoginSuccessfullyWithValidCredentials
     * click on the ‘Login’ link
     * Enter valid username
     * Enter valid password
     * Click on ‘LOGIN’ button
     * Verify the ‘Log out’ text is display
     */


    @Test
// Method
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Login’ link
        driver.findElement(By.xpath("//a [@class='ico-login']")).click();
        // Verify the text ‘Welcome, Please Sign In!'
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("Navigated to login page", expectedText, actualText);

    }

    @Test
    // Method
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        // * click on the ‘Login’ link
        driver.findElement(By.xpath("//a [@class='ico-login']")).click();
        //* Enter valid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Primetime@gmail.com");
        // * Enter valid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prime123");
        // * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//div[@class='buttons']//button[@type='submit']")).click();
        //* Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("We are not on logout", expectedText, actualText);
        System.out.println("We are on logout successfully");
        Thread.sleep(5000);
    }

    @Test
    // Method
    public void verifyTheErrorMessage() {
        //* click on the ‘Login’ link
        driver.findElement(By.xpath("//a [@class='ico-login']")).click();
        //* Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("PPrimetime@gmail.com");
        //* Enter invalid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("PPrime123");
        //* Click on Login button
        driver.findElement(By.xpath("//div[@class='buttons']//button[@type='submit']")).click();
        //* Verify the error message ‘Login was unsuccessful.
        // *Please correct the errors and try again. No customer account found’
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("We are not get error message correctly", expectedText, actualText);

        System.out.println("We are on Error message successfully");
    }

    @After
    public void closeDown() {
        closeBrowser();
    }
}
