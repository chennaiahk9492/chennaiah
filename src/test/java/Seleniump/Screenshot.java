package Seleniump;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot extends Reusable{
    public static void Urlcheck1() throws IOException {
        //here we r connect Readproperties-->reusable-->Registraion(here)
        browserlaunch1();
        driver.get(Readproperty("url"));
        String expectedURL = "https://demo.actitime.com/login.do";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
            System.out.println("same urls");
        } else {
            System.out.println("not");

        }
        //this is screen shot topic when get another one screen shot give a name differently like Browserlaunch3,4,5 .,
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File("C:\\Users\\hp\\IdeaProjects\\chennaiah\\Screen shots\\Browserlaunch1.jpeg");
        FileHandler.copy(srcFile,destFile);


    }

    public static void main(String[] args) throws IOException {
        Urlcheck1();
    }
}