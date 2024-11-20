package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void setup()
    {

        driver = new ChromeDriver();
        driver.get("https://datamend.ai/login");
        driver.manage().window().maximize();

    }
}
