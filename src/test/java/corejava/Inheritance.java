package corejava;
//CharAtExample4.java
public class Inheritance{
    public static void main(String[] args) {
        String d="chennaiah is working as a tester";
        String[] w=d.split(" ");
        for(int i=w.length-1;i>=0;i--){
            System.out.print(" "+w[i]);
        }System.out.println();


        String a="chennaiah";//revers method
        for(int i=a.length()-1;i>=0;i--){
        System.out.print(a.charAt(i));}
        System.out.println();



        String str = "Welcome to Javatpoint portal";
        for (int i=1; i<=str.length()-1; i=i+2) {
            //if(i%2!=0)
            // \its also apllicable here

            System.out.println("Char at "+i+" place "+str.charAt(i));

        }

    }
}