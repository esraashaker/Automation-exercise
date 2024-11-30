package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    protected WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //New User Signup!.....................................
    By name= By.name("name");
    By email= By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]");
    By signUpBtn= By.xpath("//*[text()='Signup']");


    //ENTER ACCOUNT INFORMATION..........................


    By title=By.id("id_gender2");
 //   By nName=By.id("name");
  //  By eEmail=By.id("email");
    By pPassword=By.id("password");
    By days=By.id("days");
    By months=By.id("months");
    By years=By.id("years");
    By newsletter=By.id("newsletter");
    By oPtin=By.id("optin");
    By first_name=By.id("first_name");
    By last_name=By.id("last_name");
    By company=By.id("company");
    By address1=By.id("address1");
    By address2=By.id("address2");
    By country=By.id("country");
    By state=By.id("state");
    By city=By.id("city");
    By zipcode=By.id("zipcode");
    By mobile_number=By.id("mobile_number");
    By createAccountBtn=By.xpath("//*[text()='Create Account']");
    By continuetBtn=By.xpath("//*[text()='Continue']");
    By deleteAccountlnk=By.xpath("//*[text()=' Delete Account']");

    //For entering Dataregister ......................................
    public void Register(String Name,String Email){
        driver.findElement(email).sendKeys(Email);
        driver.findElement(name).sendKeys(Name);
        driver.findElement(signUpBtn).click();
    }
    //for enerting data account information
    public void AccountInf(String ppassword,String fname,String lname,String compnyy
            ,String addres1,String addres2,String cityy,String statte,String zcod,String mnumber,String countryy){

        driver.findElement(title).click();
        driver.findElement(pPassword).sendKeys(ppassword);
        WebElement day=driver.findElement(days);
        Select select=new Select(day);
        select.selectByIndex(5);
        WebElement month=driver.findElement(months);
        Select select2=new Select(month);
        select2.selectByIndex(6);
        WebElement year=driver.findElement(years);
        Select select3=new Select(year);
        select3.selectByValue("1998");
        driver.findElement(newsletter).click();
        driver.findElement(oPtin).click();
        driver.findElement(first_name).sendKeys(fname);
        driver.findElement(last_name).sendKeys(lname);
        driver.findElement(company).sendKeys(compnyy);
        driver.findElement(address1).sendKeys(addres1);
        driver.findElement(address2).sendKeys(addres2);
        driver.findElement(country).sendKeys(countryy);
        driver.findElement(city).sendKeys(cityy);
        driver.findElement(state).sendKeys(statte);
        driver.findElement(zipcode).sendKeys(zcod);
        driver.findElement(mobile_number).sendKeys(mnumber);
        driver.findElement(createAccountBtn).click();
    }
    public void verifycreated(){
        driver.findElement(continuetBtn).click();

    }
    public void DeleteAccountlnk(){
        driver.findElement(deleteAccountlnk).click();
    }

}
