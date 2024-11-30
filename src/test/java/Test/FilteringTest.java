package Test;

import Pages.FilteringPage;
import org.testng.annotations.Test;

public class FilteringTest extends BaseTest{
    FilteringPage filteringPage;
    @Test
    public void test() throws InterruptedException {
        filteringPage=new FilteringPage(driver);
        filteringPage.categorySec();
    }
    @Test
    public void test1(){
        filteringPage=new FilteringPage(driver);
        filteringPage.Brandsec();
    }
}
