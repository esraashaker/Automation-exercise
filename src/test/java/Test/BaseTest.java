package Test;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
     HomePage homePage;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        homePage=new HomePage(driver);
        driver.manage().window().maximize();

        driver.navigate().to("https://automationexercise.com/");

    }
  @AfterTest
  public void quit(){
      driver.quit();
 }
}
