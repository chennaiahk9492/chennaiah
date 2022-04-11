package Seleniump;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonURL {
    public static WebDriver driver;
    public static void browserlaunch(){
        ChromeOptions opt=new ChromeOptions();
       opt.addArguments("-disable-notifications");

    System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
    //To launch the browser
    driver=new ChromeDriver(opt);
    //To maximize the Browser
    driver.manage().window().maximize();




    }
}
