package Seleniump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
    public static void main(String[] args) throws IOException {
        FileInputStream files=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\src\\test\\java\\Locators-Data\\Object.properties");
        Properties pro=new Properties();
        pro.load(files);

        String url=pro.getProperty("url");
        System.out.println(url);
        String user=pro.getProperty("username");
        System.out.println(user);
    }
    //above methode for getting data from package
        public static String Readproperty(String data) throws IOException {
        FileInputStream flies=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\src\\test\\java\\Locators-Data\\Object.properties");
        Properties pro1=new Properties();
        pro1.load(flies);

        String css=pro1.getProperty(data);
        return css;
        //its extend to reusable method

    }
}
