import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void invalidLoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("wrong_user", "wrong_pass");
        Assert.assertTrue(driver.getPageSource().contains("Epic sadface"));
    }
}
