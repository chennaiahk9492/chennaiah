package corejava;

public class Variousmethodes {
    //in this method without parameters and without return type
    public static void sum(){
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println(c);
    }
    //in this methode without parameters amd with return type
    public static int diff(){
        int a=10;
        int b=3;
        int c=a-b;
        return c;
    }
    //in this method with parameter and without return type
    public static void mul(int b, int c){
        int a=b*c;
        System.out.println(a);
    }
    //in this method both parameters and return type
    public static int div(int b, int c){
        int a=b/c;
        return a;
    }

    public static void main(String[] args) {
        sum();
        int a=diff();
        System.out.println(a);
        mul(10,20);
        int d=div(20, 10);
        System.out.println(d);
    }

}
