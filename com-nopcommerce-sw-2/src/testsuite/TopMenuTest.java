package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

// 4. Write down the following test into ‘TopMenuTest’ class
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    //Method
    public void userShouldNavigateToComputerPageSuccessfully() {
        //* click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[@href='/computers']")).click();
        //* Verify the text ‘Computers’
        String actualText = "Computers";
        String expectedText = driver.findElement(By.xpath("//a[@href='/computers']")).getText();
        Assert.assertEquals("We are not on computers", actualText, expectedText);

    }

    @Test
// Method
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //* click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        //* Verify the text ‘Electronics’
        String actualText = "Electronics";
        String expectedText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).getText();
        Assert.assertEquals("We are not on Electronics", actualText, expectedText);

    }

    @Test
    // Method
    public void userShouldNavigateToApparelPageSuccessfully() {
        //* click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
       //* Verify the text ‘Apparel’
        String actualText = "Apparel";
        String expectedText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).getText();
        Assert.assertEquals("We are not on Apparel", actualText, expectedText);
    }

    @Test
    // Method
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //* click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //* Verify the text ‘Digital downloads’
        String actualText = "Digital downloads";
        String expectedText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("We are not on Digital downloads", actualText, expectedText);

    }

    @Test
    // Method
    public void userShouldNavigateToBooksPageSuccessfully()  {
        //* click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //* Verify the text ‘Books’
        String actualText = "Books";
        String expectedText = driver.findElement(By.xpath(" //ul[@class='top-menu notmobile']//a[text()='Books ']")).getText();
        Assert.assertEquals("We are not on Books", actualText, expectedText);

    }
    @Test
    // Method
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException {
        //* click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //* Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath(" //a[text()='Jewelry ']")).getText();
        Assert.assertEquals("We are not on Jewelry", actualText, expectedText);
 Thread.sleep(5000);

    }
    @Test
    //Method
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException {
        //* click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //* Verify the text ‘Gift Cards’

        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("We are not on Gift Cards", actualText, expectedText);
        Thread.sleep(5000);
    }

    @After
    public void closeDown() {
        closeBrowser();

    }
    }




