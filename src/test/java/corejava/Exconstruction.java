package corejava;
public class Exconstruction{

    // default constructor
    //here don't use "void"
    public Exconstruction() {

        System.out.println("default constructor");
    }
    //constructor
    public Exconstruction(String test1, String test2){
        System.out.println(test1);
        System.out.println(test2);
    }

    public static void main(String[] args) {
        Exconstruction ch=new Exconstruction();

        Exconstruction ce=new Exconstruction("akhil", "soori");



    }
}