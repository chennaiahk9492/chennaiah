import org.testng.annotations.*;

public class TestNG {
    @BeforeSuite
    public void Beforesuite(){
        System.out.println("before suite");
    }
    @BeforeTest
    public void Beforetest(){
        System.out.println("befor test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aftertest");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass");
    }
    @BeforeMethod
    public void Beforemethode(){
        System.out.println("before methode");
    }
    @AfterMethod
    public void aftermethode(){
        System.out.println("aftermethod");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclass");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite");

    }
    @Test public void test(){
        System.out.println("test pass");
    }
}

