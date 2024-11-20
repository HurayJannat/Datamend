package testrunner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.Setup;
import utils.Utils;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class DashboardPageRunner extends Setup {

    @BeforeTest
    public void login() {
        LoginPage login = new LoginPage(driver);
        login.doLogin("yixafap163@nozamas.com", "12345678");

    }

    @Test
    public void selectPlans() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        DashboardPage dashboard = new DashboardPage(driver);
        WebElement dropdown = dashboard.dropdownButton;
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        dropdown.click();

        driver.findElement(By.xpath("//a[contains(@href, 'https://datamend.ai/manage-plans') and contains(text(), 'Manage Plans')]")).click();

        WebElement manageSubscriptionHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[text()='Manage Subscription']")));
        Utils.scrollVertically(2000,driver);
        Thread.sleep(2000);

        WebElement getStartedLink = driver.findElement(By.xpath("//a[@href='https://datamend.ai/subscribe?name=trial&type=monthly' and text()='Get Started']"));
        getStartedLink.click();


        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure card payment input frame']")));
        driver.switchTo().frame(iframe);

        Thread.sleep(3000);

        WebElement cardInput = driver.findElement(By.name("cardnumber"));
        cardInput.sendKeys("555555555555444492612312345");

        driver.switchTo().defaultContent();


        WebElement payButton = driver.findElement(By.xpath(".//button[contains(text(), 'Pay')]"));
        payButton.click();

        Thread.sleep(3000);


        dropdown.click();

        driver.findElement(By.xpath("//a[contains(@href, 'https://datamend.ai/manage-plans') and contains(text(), 'Home')]")).click();


        Thread.sleep(3000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'user_21_db')]")));
        element.click();


        Thread.sleep(3000);
        WebElement button = driver.findElement(By.cssSelector("button svg[fill='#17A2B8'].lucide.lucide-play"));
        button.click();

        Thread.sleep(3000);
        WebElement inputField = driver.findElement(By.xpath("//input[@value='']"));

        for (int i = 0; i < 100; i++) {
            // Clear the input field before sending the query each time

            // Send the query
            Thread.sleep(3000);
            inputField.sendKeys("SELECT years, car_model FROM cars");

            // Wait for a moment before clicking the query button
            Thread.sleep(3000);

            // Click the query button (SVG button)
            WebElement queryButton = driver.findElement(By.cssSelector("svg.lucide-circle-arrow-up"));
            queryButton.click();

            // Optional: Add a short delay between iterations to avoid overloading the server
            Thread.sleep(1000);
            System.out.println(i);// 1-second delay between queries
        }
    }


}

