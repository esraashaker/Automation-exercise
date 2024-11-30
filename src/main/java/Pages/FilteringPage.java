package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilteringPage {
    protected WebDriver driver;
   public FilteringPage(WebDriver driver){
       this.driver=driver;
   }
   //categroy section...........................
    By women= By.linkText("WOMEN");
   By tops=By.xpath("//*[text()='Tops ']");
//brand section..................................
    By Baby=By.xpath("//*[text()='Babyhug']");
    //categroy method....................................
   public void categorySec() throws InterruptedException {
       driver.findElement(women).click();
       Thread.sleep(3000);
       driver.findElement(tops).click();
   }

//brand method.............................................
    public void Brandsec(){
       driver.findElement(Baby).click();
    }



}
