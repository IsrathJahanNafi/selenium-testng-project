import org.testng.annotations.Test;

public class TestRunner extends Setup {
    @Test
    public void doLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin", "admin123");
    }
}
