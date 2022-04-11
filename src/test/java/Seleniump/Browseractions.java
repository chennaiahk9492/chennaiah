package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browseractions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //t o maximize the browser
        driver.manage().window().maximize();
        //to pass synchronize
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //to pass url
        driver.navigate().to("https://demo.actitime.com");
        //to find the location of user name field
        WebElement usernameRef=driver.findElement(By.id("username"));
        //to perform action on element
        usernameRef.sendKeys("admin");
        //to perform action on passward field
        WebElement passwordref=driver.findElement(By.name("pwd"));
        passwordref.sendKeys("manager");
        // and use this patha also --> driver.findElement(By.name("pwd")).sendKeys("manager");
        //to perform action login button

        driver.findElement(By.id("loginButton")).click();
      // FluentWait waitc=new FluentWait(driver);
       // waitc.withTimeout(5000,TimeUnit.MICROSECONDS);
        //waitc.pollingEvery(300, TimeUnit.MILLISECONDS);
        //waitc.ignoring(NoSuchElementException.class);
        //waitc.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".CONTENT.REPORTS"))));







       WebDriverWait wait=new WebDriverWait(driver,120);
       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".content.tasks"))));


       boolean eleverifytask=driver.findElement(By.cssSelector(".content.tasks")).isDisplayed();
       System.out.println(eleverifytask);
       driver.findElement(By.cssSelector(".content.tasks")).click();
       boolean elereports=driver.findElement(By.cssSelector(".content.reports")).isDisplayed();
       System.out.println(elereports);
       driver.findElement(By.cssSelector(".content.reports")).click();

       //to navigate bac
       driver.navigate().back();
        //to naviagate forward
        driver.navigate().forward();
        String forward=driver.getCurrentUrl();
        System.out.println(forward);
        driver.navigate().refresh();
        //Browser actions all above


    }
}
