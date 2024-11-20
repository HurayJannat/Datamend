package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class DashboardPage {

    @FindBy(xpath = "//button[contains(@class, 'text-xs sm:text-base') and text()='Test']")
    public WebElement dropdownButton;



    public DashboardPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}
