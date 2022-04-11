package corejava;
class grandfather{
static String property5= "golld";
}
class father extends grandfather{
    static String property3="house";
    static String property4="land";
}
public class  Sonrelation extends father{

       static String property= "job";
        static String property2="plotes";

    public static void main(String[] args) {
        System.out.println(property);
        System.out.println(property2);
        System.out.println(property3);
        System.out.println(property4);
        System.out.println(property5);
    }


}