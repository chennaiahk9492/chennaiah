package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Fileupload extends AmazonURL{
    public static void main(String[] args) throws InterruptedException, IOException {
        browserlaunch();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        driver.findElement(By.xpath("(//div[@class='mTxt'])[6]")).click();
        JavascriptExecutor exicutor1= ((JavascriptExecutor)driver);
        WebElement dor=driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
        exicutor1.executeScript("arguments[0].scrollIntoView();",dor);
        dor.click();
        Runtime.getRuntime().exec("E:\\testing resumes\\new\\Fileupload2.exe");

    }
}
