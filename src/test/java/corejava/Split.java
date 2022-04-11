package corejava;
//split concept
public class Split {
    public static void main(String[] args) {
        String s1= "java is my favorite class";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        String b2="chapati is a worst fellow";
        for (String k:b2.split("\\s",2)){
            System.out.println(k);
        }
        String b3="we both are mate for each other";
        for (String d:b3.split("\\s",0)){
            System.out.println(d);

        }
        String b4= "javapointtjavatpoint";
        String[] war=b4.split("t",2);
        for (String p:war){
            System.out.println(p);
        }

        // length concept
        System.out.println("split array length:"+b4.length());// total string length
        System.out.println("split array length:"+war.length);  //split words range

        String z=" Welcome to javaTpoint ";
        int sizewithwhitespaces=z.length();
        System.out.println("in the string:"+""+z+"");
        // here we can replace empty spaces instead of spaces place means remove spaces
        z=z.replace(" ","");
        int sizeWithoutWhiteSpaces = z.length();
        int noofwhitespaces=sizewithwhitespaces-sizeWithoutWhiteSpaces;//23-19
        System.out.println("no of white space declared;"+noofwhitespaces);
        System.out.println(sizewithwhitespaces);

        //replace concept
        String f= "my name is chennai& his name is chaari";
        String g=f.replace("is","was");
        System.out.println(g);
        g=g.replace("was", "and");
        System.out.println(g);

        String s2="hello";
        String s3="";
        String s4="me";
        System.out.println(s2.compareTo(s3));//  s2 is 5- s3 is 0=5
        System.out.println(s3.compareTo(s4));//   s3 is 0- s4 is =-2

        //ex
        String s5="chennai";
        String s6="chaari";
        String s7="venu";

        System.out.println(s5.compareTo(s6));  // s5 "e" is 5 letter - s6"a" is 1 letter=4
        System.out.println(s6.compareTo(s7));//s6"c" is 3 letter - s7"v" is 22 letter=-19

    }
}
