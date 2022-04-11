package Seleniump;

public class Exfinal {
    public void setChennai(String chennai) {
        this.chennai = chennai;
    }

    public String getChennai() {
        return chennai;
    }

    public String chennai;
    public static void main(String[] args) {
       String s1="Hemanth";

       String s2= "Chari";
       String s3="Chennaiah";
       String s4="Hemanth";
       String s5=new String("Hemanth");
       // concat method
       String test=s1.concat(null);
        System.out.println(test);
        // + operator also do concat operation but here we accept null vlues
        String test1=s1+null;
        System.out.println(test1);
        // equals

    }
}
