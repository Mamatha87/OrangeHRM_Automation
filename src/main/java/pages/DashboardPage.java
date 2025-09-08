package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    By pimModule = By.id("menu_pim_viewPimModule");
    By leaveModule = By.id("menu_leave_viewLeaveModule");
    By myInfoModule = By.id("menu_pim_viewMyDetails");
    By welcome = By.id("welcome");
    By logout = By.linkText("Logout");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToPIM() {
        wait.until(ExpectedConditions.elementToBeClickable(pimModule)).click();
    }

    public void goToLeave() {
        wait.until(ExpectedConditions.elementToBeClickable(leaveModule)).click();
    }

    public void goToMyInfo() {
        wait.until(ExpectedConditions.elementToBeClickable(myInfoModule)).click();
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(welcome)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
    }
}
