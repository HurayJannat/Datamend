package testrunner;

import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

public class LoginTestRunner extends Setup {

    @Test
    public void login()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin("shaheenmediusware@gmail.com", "12345678");

    }
}
