package corejava;

public class Practies {
    //identify even and ood numbers
    public static void main(String[] args) {

        int a[]={10,20,15,3,6,7,8,2,5,7};
        int n=a.length;
        System.out.println("Ood numbers");
        for (int i=0; i<n; i++){
            if (a[i]%2!=0){
                System.out.println(a[i]);
            }

        }
        System.out.println("even numbers");
        for (int i=0; i<n; i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }

}
