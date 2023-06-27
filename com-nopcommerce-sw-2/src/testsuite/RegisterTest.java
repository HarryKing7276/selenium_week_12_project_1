package testsuite;
//  5. Write down the following test into ‘RegisterTest’ class

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //Method
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //* click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //* Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    // Method
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        //* click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //* Select gender radio button
        driver.findElement(By.xpath("//input[@type='radio'and @value='M']")).click();
        //* Enter First name
        driver.findElement(By.xpath("//input[@type='text'][@id='FirstName']")).sendKeys("Prime Patel");
        //* Enter Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Tutor");
        //* Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        //* Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        //* Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2000");
//* Enter Email address
        driver.findElement(By.xpath("//input[@type='email'][@id='Email']")).sendKeys("Primetime@gmail.com");
//* Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prime123");
//* Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Prime123");
//* Click on REGISTER button
        driver.findElement(By.xpath("//button[@type='submit'][@id='register-button']")).click();

        //Verify the text 'Your registration completed'
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();

        Assert.assertEquals("not on required page", actualText, expectedText);


        Thread.sleep(5000);

    }

    @After
    public void closeDown() {
        //  closeBrowser();
    }

}
