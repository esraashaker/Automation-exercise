package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
   public WebDriver driver;
  public AddToCartPage(WebDriver driver){
      this.driver=driver;
  }
  By AddCartlnk1= By.xpath("//*[@data-product-id='1']");
  By AddCartlnk2= By.xpath("//*[@data-product-id='2']");
  By AddCartlnk3= By.xpath("//*[@data-product-id='3']");

    public void AddtoCartFun1(){
      driver.findElement(AddCartlnk1).click();
  }
    public void AddtoCartFun2(){
        driver.findElement(AddCartlnk2).click();
    }
    public void AddtoCartFun3(){
        driver.findElement(AddCartlnk3).click();
    }


}
