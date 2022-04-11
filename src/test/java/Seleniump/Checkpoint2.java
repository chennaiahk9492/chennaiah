package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkpoint2 extends AmazonURL {
    public static void textche(){
        browserlaunch();
        driver.get("https://amazon.in");
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        String expectedT="Email or mobile phone number";
        WebElement text1=driver.findElement(By.xpath("//label[@class='a-form-label']"));
        String actual=text1.getText();
        if (expectedT.equals(actual)) {
            System.out.println("both are same");
        }else {
            System.out.println("both are not same");
        }






    }
    public static void checkurl(){
        browserlaunch();
        driver.get("https://demo.actitime.com");
        String expectedsusu="https://demo.actitime.com/login.do";
        String actualsusu= driver.getCurrentUrl();
        if (expectedsusu.equals(actualsusu)){
            System.out.println("same");
        }else {
            System.out.println("no");
        }

    }

    public static void main(String[] args) {
       //textche();
        checkurl();
    }

}
