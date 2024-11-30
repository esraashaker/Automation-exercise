package Test;

import Pages.ViewproductPage;
import org.testng.annotations.Test;

public class ViewProductTest extends BaseTest{
    ViewproductPage viewproductPage;

    @Test
    public void test(){
      viewproductPage=new ViewproductPage(driver) ;
      viewproductPage.ViewProduct2();
    } @Test
    public void test2(){
        viewproductPage=new ViewproductPage(driver) ;
        viewproductPage.ViewProduct3();
    }
    @Test
    public void test3(){
        viewproductPage=new ViewproductPage(driver) ;
        viewproductPage.ViewProduct4();
    }

}
