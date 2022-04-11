package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkpoint extends AmazonURL{
    public static void titlecheck(){
        browserlaunch();
        //to launch browser
        driver.get("https://demo.actitime.com");
        String expectedtitle="actiTIME - Login";
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        if(expectedtitle.equals(actualtitle)){
            System.out.println("titles are same as");
        }

    }
    public static void Urlcheck(){
        browserlaunch();
        driver.get("https://demo.actitime.com");
        String expectedURL="https://demo.actitime.com/login.do";
        String actualURL=driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)){
            System.out.println("same urls");
        }else {
            System.out.println("note");
        }


    }
    public static void textverification(){
        browserlaunch();
        driver.get("https://demo.actitime.com");
            String expectedtext="Please identify yourself";
        WebElement actualtextref=driver.findElement(By.xpath("//td[contains(text(),'Please identify yourself')]"));
        String actualtext=actualtextref.getText();

        if (expectedtext.equals(actualtext)){
            System.out.println("text is same");
        }
    }
    public static void eleverify(){
        browserlaunch();
        driver.get("https://demo.actitime.com");
        WebElement eleref=driver.findElement(By.id("loginButton"));
        boolean eleverifying=eleref.isDisplayed();
        System.out.println(eleverifying);
    }
    public static void checkbox(){
        browserlaunch();
        driver.get("https://demo.actitime.com");
        WebElement check= driver.findElement(By.name("remember"));
        boolean checkref=check.isSelected();
        check.click();
        boolean checkref2=check.isSelected();
        System.out.println(checkref2);
        System.out.println(checkref);


    }



    public static void main(String[] args) {
      //  titlecheck();
        Urlcheck();
       // textverification();
        //eleverify();
       // checkbox();

    }

}
