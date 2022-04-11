package Seleniump;

public class Mainmumvalue {
    public float evennumber;

    public float getEvennumber() {
        return evennumber;
    }

    public void setEvennumber(float evennumber) {
        this.evennumber = evennumber;
    }

    public static void main(String args[]){
            int a=11;
            int b=5;
            int min=(a<b)?a:b;
            System.out.println(min);

            if(a>b)
            System.out.println(true);
            else
                System.out.println(false);
            if(a/b==0)
                System.out.println("its even number");
            else
                System.out.println("its ood number");
        }

}
