package corejava;

import com.sun.tools.javac.Main;

interface Abcd extends Abcde,Abcdef{
    public void chennai();
}
interface Abcde{
    public void chennai2();
}
interface Abcdef{
    public void chennai3();
}
public class Exinterface {

    public void chennai() {
        System.out.println("chennai method");
    }

    public void chennai2() {
        System.out.println("chennai2 method");
    }

    public void chennai3() {
        System.out.println("chennai3 method");
    }

    public static void main(String[] args) {
        Exinterface hh=new Exinterface();
        hh.chennai();
        hh.chennai2();
        hh.chennai3();
    }

}
