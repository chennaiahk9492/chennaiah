import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("beforemethod");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("after method");
    }
    @Test(priority=0)
    public void createaccount(){
        System.out.println("create account");
    }
    @Test(priority=1)
    public void editaccount(){
        System.out.println("edit account");
    }
    @Test(priority=2)
    public void deleteaccount(){
        System.out.println("delete account");
    }

}
