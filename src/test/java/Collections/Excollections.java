package Collections;

import com.google.common.collect.Maps;
import com.google.common.reflect.MutableTypeToInstanceMap;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Excollections {
    public static void Exarraylist(){
        ArrayList<String> a1=new ArrayList<>();
        a1.add("chaari");
        a1.add("akhil");
        a1.add("hemanth");
        a1.add(0,"suri");
        a1.add("nikhil");
        int size=a1.size();
        System.out.println(size);
        String index=a1.get(1);
        System.out.println(index);
        a1.remove(3);
        Iterator<String> a2=a1.iterator();
        while (a2.hasNext()){
            String ele= a2.next();
            System.out.println(ele);
        }


    }
    public static void ExLinkedlist(){
        LinkedList<String> a1=new LinkedList<>();
        a1.add("chaari");
        a1.add("akhil");
        a1.add("hemanth");
        a1.add(0,"suri");
        a1.add("nikhil");
        int size=a1.size();
        System.out.println(size);
        boolean presencchennai=a1.contains("chaari");
        String index=a1.get(1);
        System.out.println(index);
        a1.remove(3);
        Iterator<String> a2=a1.iterator();
        while (a2.hasNext()){
            String ele= a2.next();
            System.out.println(ele);
        }
    }
    public static void exhashset(){
        HashSet<String> a1=new HashSet<>();
        a1.add("allam");
        a1.add("uday");
        a1.add("suri");
        int size= a1.size();
        a1.add("chennaia");
        boolean chen=a1.contains("suri");
        a1.add("chaari");
        a1.add("akhil");
        a1.add("hemanth");
        a1.remove("chennaia");
        a1.add("chennai");
        int e = a1.size();
        System.out.println(e);
        Iterator<String > a2=a1.iterator();
        while (a2.hasNext()){
            String ele= a2.next();
            System.out.println(ele);
        }
    }
    public static void exlinkedhashset(){
        LinkedHashSet<String> a2=new LinkedHashSet<>();
        a2.add("ffff");
        a2.add("allam");
        a2.add("uday");
        a2.add("suri");
        int size= a2.size();
        System.out.println(size);
        a2.add("chennai");
        boolean chen=a2.contains("suri");
        System.out.println(chen);
        a2.add("chaari");
        a2.add("akhil");
        a2.add("hemanth");
        a2.remove(3);
        a2.add("chennai");
        Iterator<String>  a3= a2.iterator();
        while (a3.hasNext()) {
            String a4 = a3.next();
            System.out.println(a4);
        }
    }
    public static void extreeset(){
        TreeSet<String> a2=new TreeSet<>();
        a2.add("ffff");
        a2.add("chaari");
        a2.add("akhil");
        a2.add("hemanth");

        a2.add("chennai");
        a2.add("allam");
        a2.add("uday");
        a2.add("suri");

        int size= a2.size();
        System.out.println(size);
        a2.add("chennai");
        boolean chen=a2.contains("suri");
        System.out.println(chen);

        Iterator<String> a3= a2.iterator();
        while (a3.hasNext()){
            String ss= a3.next();
            System.out.println(ss);
        }

    }



    public static void main(String[] args) {
        System.out.println("************array list*********");
        Exarraylist();
        System.out.println("************linked list*********");
        ExLinkedlist();
        System.out.println("************hash set*********");
        exhashset();
        System.out.println("************ linked hashset*********");
        exlinkedhashset();
        System.out.println("************tree set*********");
        extreeset();
    }
}
