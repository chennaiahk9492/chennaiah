package corejava;

public class Normalariables {
    //normalmethod
    String name1 = "chennaiah";
    //ststicmethod
    static String name2 = "munikishore";
    //normal method
    public void normalmethod(){
        System.out.println(name1);
        System.out.println(name2);
    }
    //static method
    public static void staticmethod(){
        System.out.println(name2);
    }

    public static void main(String[] args) {

        //in normal method cn be accessed both intances and static variables
        //1. this is intances variable

        Normalariables ch=new Normalariables();
        System.out.println(ch.name1);
        //2. this is static variable
        Normalariables che=new Normalariables();
        System.out.println(che.name2);
        //in this static method only static variables can be accessed
        staticmethod();
    }
}
