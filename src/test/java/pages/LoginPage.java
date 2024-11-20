package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class LoginPage {



    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement btnSubmit;


    public void doLogin(String email, String password)
    {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmit.click();
    }


    public LoginPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

}
