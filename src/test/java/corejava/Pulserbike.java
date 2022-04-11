package corejava;

public class Pulserbike {
    String color;
    String tyres;
    int cc;
    String seating;
    String weight;
    double price;
    public void pulser(String a, String b, int c, String d, String e, double f){
        color=a;
        tyres=b;
        cc=c;
        seating=d;
        weight=e;
        price=f;
    }
    public void display(){
        System.out.println(color+""+tyres+""+cc+""+seating+""+weight+""+price);
    }

    public static void main(String[] args) {
        Pulserbike che=new Pulserbike();
        che.pulser("red&black", "twotyres",150, "two", "250kg",121000 );
        che.display();
    }
}
