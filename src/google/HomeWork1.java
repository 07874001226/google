package google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork1 {

    //public static void main(String[] args) {

    WebDriver driver;

    @Before
    public void browser() {

        String baseUrl = "https://www.google.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void verifyNavigateComputerPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']")).click();
    }

    @Test
    public void verifyNavigateElectronicPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();
    }

    @Test
    public void verifyNavigateApparelPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']")).click();
    }

    @Test
    public void verifyNavigateBookPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']")).click();
    }

    @Test
    public void verifyNavigateJewerlyPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']")).click();
    }

    @Test
    public void verifyNavigateGiftCardsPage() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']")).click();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
