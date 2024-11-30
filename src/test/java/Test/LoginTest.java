package Test;

import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage;

    @DataProvider(name = "login-data")
    public Object[][]loginData(){
     return new Object[][] {
             {"esraa@gmail.com","123456789"}
        };
    }
@Test(dataProvider = "login-data")
    public void Test(String E,String P) throws InterruptedException {
        loginPage=new LoginPage(driver);
    homePage.Login_Register();
    Thread.sleep(3000);
    driver.manage().window().fullscreen();
    loginPage.loginToYourAccount(E,P);
}





}
