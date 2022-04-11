package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdownoptions extends AmazonURL{
    public static void main(String[] args) throws InterruptedException {
        browserlaunch();
        driver.get("http://irctc.co.in");
        WebElement element=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
        //java script exicuter apllied
        JavascriptExecutor exicutor= (JavascriptExecutor)driver;
        exicutor.executeScript("arguments[0].click();",element);
        driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c66-11']")).click();
        WebElement find=driver.findElement(By.xpath("//span[text()='Anubhuti Class (EA)']"));
        find.click();
        // mouse & keyboard action
        WebElement elem=driver.findElement(By.xpath("//button[@label='Find Trains']"));
        Actions act=new Actions(driver);
        act.contextClick(elem).build().perform();
        act.sendKeys(Keys.DOWN).build().perform();
        WebElement ele2=driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
        ele2.sendKeys("chennaiah");
        act.moveToElement(ele2).build().perform();
        act.sendKeys(Keys.BACK_SPACE).build().perform();
        act.sendKeys(Keys.CLEAR).build().perform();
        act.sendKeys(Keys.TAB).build().perform();





    }
}
