package Seleniump;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Reusable extends Readproperties{
    public static WebDriver driver;
    public static void browserlaunch1() throws IOException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("-disable-notifications");

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        //To launch the browser
        driver = new ChromeDriver(opt);
        //To maximize the Browser
        driver.manage().window().maximize();

    }

    public static void main(String[] args) throws IOException {
        browserlaunch1();


    }
}
