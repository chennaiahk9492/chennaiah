package corejava;
class parent {
int a=200;
public void test2(){
    System.out.println("test case2");
}
}
public class Exfial extends parent {
    int a=100;
    public void test1(){
        //a=200;
        System.out.println(super.a);
    }


    //public void test2(){
      //  System.out.println("test 2 redefined");


    public static void main(String[] args) {
            Exfial e1=new Exfial();
            e1.test1();



    }
}
