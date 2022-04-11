package corejava;
class adder{
    public static float add(float f, float g){
        return f+g;
    }
    public void add(int h,long i, double j){
        System.out.println(h+i+j);
    }


}
public class Overloading extends adder {




    public void add(int a, int c){
        System.out.print(a);
        System.out.println(" "+c);

    }
    public void add(float b){
        System.out.println(b);
    }
    public void add(){
        System.out.println("perakaraja");
    }
    public void add(String d, String e){
        System.out.print(d);
        System.out.println(" "+e);

    }


    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.add(4,5);
        obj.add(2345);
        obj.add("muni","chennai");
        obj.add();
        System.out.println(adder.add(16,74));
        obj.add(11,11,11);
    }
}
