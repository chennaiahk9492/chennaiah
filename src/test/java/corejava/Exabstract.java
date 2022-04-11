package corejava;

abstract class Chennaiah1{
    public abstract void test1();

    public void muni(){
        System.out.println("soori");
    }
    public void veni(){
        System.out.println("good");
    }
}
public class Exabstract extends Chennaiah1{
    public static void main(String[] args) {
        Exabstract ch=new Exabstract();
        ch.muni();
        ch.veni();
        ch.test1();
    }

    public void test1() {
        System.out.println("muni is implemented");
    }
}

