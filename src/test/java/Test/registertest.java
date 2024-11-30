package Test;

import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registertest extends BaseTest{
    RegisterPage registerPage;
    @DataProvider(name = "register-data")
    public Object[][]loginData(){
        return new Object[][] {
                {"esraa","esraa1k33489@gmail.com"},

        };
    }
    @DataProvider(name = "createAccount-data")
    public Object[][]CaccountData(){
        return new Object[][] {
                {"123456789","esraa","shaker","aurasystem"
                        ,"cairo/october","cairo/15street",
                        "egypt","cairo","egypt","123456","01012131415"}

        };
    }
    @Test(dataProvider = "register-data")

    public void Testregister(String N,String E) throws InterruptedException {
        registerPage=new RegisterPage(driver);
        homePage.Login_Register();
        registerPage.Register(N,E);

    }

    @Test(dataProvider = "createAccount-data",dependsOnMethods = "Testregister")

    public void TestAccount(String password,String fname,String lname ,String company
            ,String address1,String address2,String country
            ,String city,String state,String zcode,String mobilenum) throws InterruptedException {

        registerPage=new RegisterPage(driver);
        registerPage.AccountInf(password,fname,lname,company
                ,address1,address2,country,city,state,zcode,mobilenum);
        registerPage.verifycreated();
        registerPage.DeleteAccountlnk();



   }


}
