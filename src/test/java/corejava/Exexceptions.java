package corejava;
//arithmetic exception
public class Exexceptions {
    public static void ArithmeticExceptions(){
        try{
            int a=50/0;
            System.out.println(a);

        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
    //nullpointer example
    public static void nullPointerException(){
        try{
            String c=null; //try it if we enter c=empty
            System.out.println(c.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    //ex number format exception and convert "int" to "String" int b=Integer.parseInt(a) starting Capital letters
    // ex numberformatexception
    public static void numberformatexception(){
        String a="12345";

            int b=Integer.parseInt(a);
        System.out.println(b);

    }//NumberFormatException starting capitals
    public static void numberformatexception1(){


        String a="chennai";
        try{
            int b=Integer.parseInt(a);
            System.out.println(b);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArithmeticExceptions();
        nullPointerException();
        numberformatexception();
        numberformatexception1();
    }
}
