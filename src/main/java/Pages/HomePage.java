package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
By login_register=By.xpath("//*[text()=' Signup / Login']");
    public void Login_Register(){
        driver.findElement(login_register).click();
    }



}
