package corejava;

class Variousmethodes1 {
    //in this without parameters and without return type
    public static void diff(){
        int a=234;
        int b=34;
        int c=a-b;
        System.out.println(c);
    }
    //with parameter ant without return type
    public static void div(int b, int c){
        int a=b/c;
        System.out.println(a);
    }
    //without parameter and with return type
    public static int sum(){
        int a=99;
        int b=1;
        int c=a+b;
        return c;
    }
    //with para meter with return type
    public static int mul(int b, int c){
        int a=b*c;
        return a;
    }

    public static void main(String[] args) {
        diff();
        div(144,12);
        int a=sum();
        System.out.println(a);
        int b=mul(9,9);
        System.out.println(b);
    }
}
