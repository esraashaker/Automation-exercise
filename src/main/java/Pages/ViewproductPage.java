package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewproductPage {
    protected WebDriver driver;
  public  ViewproductPage (WebDriver driver){
      this.driver=driver;
  }
    By viewProduct2= By.xpath("//*[@href='/product_details/2']");
    By viewProduct3= By.xpath("//*[@href='/product_details/3']");

    By viewProduct4= By.xpath("//*[@href='/product_details/4']");
    public void ViewProduct2(){
        driver.findElement(viewProduct2).click();
    }
    public void ViewProduct3(){
        driver.findElement(viewProduct3).click();
    }
    public void ViewProduct4(){
        driver.findElement(viewProduct4).click();
    }
}
