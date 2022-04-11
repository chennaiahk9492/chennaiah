package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class multiplewindows extends AmazonURL{
    public static void main(String[] args) throws InterruptedException {
        browserlaunch();
        driver.get("http://irctc.co.in");
        WebElement element=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
        //java script exicuter apllied
        JavascriptExecutor exicutor= (JavascriptExecutor)driver;
        exicutor.executeScript("arguments[0].click();",element);
        driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
        Thread.sleep(10000);

        Set<String> windows=driver.getWindowHandles();
        int sixe=windows.size();
        System.out.println(sixe);
        Iterator<String> Allwindows=windows.iterator();
        String currentwindow=Allwindows.next();
        String secondwindow=Allwindows.next();
        driver.switchTo().window(secondwindow);
        driver.findElement(By.id("stationFrom")).sendKeys("Vishakhapatanam");
        driver.switchTo().window(currentwindow);
        driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("nellore");
        driver.switchTo().window(secondwindow);
        Thread.sleep(10000);
        driver.close();
        Thread.sleep(10000);
        driver.quit();

    }

}
