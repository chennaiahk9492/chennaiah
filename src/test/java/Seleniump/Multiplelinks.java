package Seleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.net.ssl.HttpsURLConnection;
import javax.print.DocFlavor;
import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Multiplelinks extends AmazonURL{
    public static void main(String[] args) throws IOException {
        browserlaunch();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://amazon.in");
        //find the all addresses of links
        List<WebElement> linkref=driver.findElements(By.xpath("//a"));
        Iterator<WebElement>ie=linkref.iterator();
        //here have to arraylist spaces will be remove
        //use Hasset duplicates not allowed so spaces can be doesn't show
        HashSet<String> al=new HashSet<>();
        //if we check all links working condition
        HttpURLConnection huc;
        while (ie.hasNext()){
            WebElement indi= ie.next();
            String text= indi.getText();
            String link= indi.getAttribute("href");
            //toatal text display with duplicates
            //System.out.println(text);
            //total links dispaly woth dupliacates
              System.out.println(link);
            //hashset method without duplicates
              al.add(text);
            //to get responce from the URL
            try {
                huc = (HttpURLConnection) new URL(link).openConnection();
                 huc.setRequestMethod("HEAD");
                huc.connect();
                int responsecode = huc.getResponseCode();
                System.out.println(responsecode);
            }catch (Exception e){
                System.out.println(e);
            }

        }
        System.out.println("**********only text************");
        System.out.println(al);




    }
}