import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "oxd-input ")
    List<WebElement> txtCreds;
    @FindBy(css = "[type=submit]")
    WebElement btnSubmit;

    public LoginPage(WebDriver driver ){
        PageFactory.initElements(driver,this);

    }
    public void doLogin(String Username,String Password){
        txtCreds.get(0).sendKeys(Username);
        txtCreds.get(1).sendKeys(Password);
        btnSubmit.click();
    }



}
