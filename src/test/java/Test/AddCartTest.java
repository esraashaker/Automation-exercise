package Test;

import Pages.AddToCartPage;
import org.testng.annotations.Test;

public class AddCartTest extends BaseTest {
    AddToCartPage addToCartPage;
    @Test
    public void test1() {
        addToCartPage = new AddToCartPage(driver);
        addToCartPage.AddtoCartFun1();
    }
        @Test
        public void test2(){
            addToCartPage=new AddToCartPage(driver);
        addToCartPage.AddtoCartFun2();
        }
        @Test
        public void test3(){
            addToCartPage=new AddToCartPage(driver);
        addToCartPage.AddtoCartFun3();}



}
