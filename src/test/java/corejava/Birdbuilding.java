package corejava;

public class Birdbuilding {
    String wings;
    String head;
    String legs;
    String body;
    String bochu;
    int hight;
    int weight;
    String color;
    String name;
    public void insert(String a, String b, String c, String d, String e, int f, int g, String h, String i){
        wings=a;
        head=b;
        legs=c;
        body=d;
        bochu=e;
        hight=f;
        weight=g;
        color=h;
        name=i;
    }
    public void display(){
        System.out.println(wings+""+head+""+legs+""+body+""+bochu+""+hight+""+weight+""+color+""+name);
    }

    public static void main(String[] args) {
        Birdbuilding bird=new Birdbuilding();
        bird.insert("twowing",    "onehead", "twolegs", "onebody","bchu", 7, 54, "green","pengvin");
        bird.display();
    }
}
