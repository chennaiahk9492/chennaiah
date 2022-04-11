package corejava;
// relationships class

public class Son {
    //its without parameters and without return type
    public static void sum(){
       int a=99;
       int b=11;
       int c=a+b;
        System.out.println(c);
    }
    //its without parameters and with return type
    public static int mul(){
        int a=44;
        int b=8;
        int c=a*b;
        return c;
    }
    //it is both are having parameters and return type also
    public static int div(int a, int b){
        int c=a/b;
        return c;
    }
    //it is with parameter and without return type
    public static void diff(int a, int b){
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        sum();
        int c= mul();
        System.out.println(c);
        int b=div(16,2);
        System.out.println(b);
        diff(12, 6);

    }

}
