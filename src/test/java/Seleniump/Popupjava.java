package Seleniump;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Popupjava extends AmazonURL{
    public static void main(String[] args) throws InterruptedException {
        browserlaunch();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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

        WebDriverWait wait2=new WebDriverWait(driver,120);
        wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".content.tasks"))));

        driver.findElement(By.cssSelector(".content.tasks")).click();
        // we have to check popoups
        driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("chaaari");
        Thread.sleep(10000);
        driver.findElement(By.id("customerLightBoxCloseButton")).click();
        // Alert is popup handling tool
        Alert alt=driver.switchTo().alert();
        String alttext=alt.getText();
        System.out.println(alttext);
        alt.accept();



    }
}
