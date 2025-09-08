package tests;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class OrangeHRMTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void endToEndTest() throws InterruptedException {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        // Navigate PIM → Leave → My Info
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        Thread.sleep(2000);

        // Logout
        driver.findElement(By.className("oxd-userdropdown-tab")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
