package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    //Login to your account................................
    By emailAddress = By.name("email");
    By Password = By.name("password");
    By loginBtn = By.xpath("//*[text()='Login']");

    //For entering Datalogin ......................................
    public void loginToYourAccount(String email, String password) {
        driver.findElement(emailAddress).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

}



















