package corejava;

public class Arrays2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        System.out.println(a[4]);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        try
        {
            System.out.println(7);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println();
            String b="vidya";
        System.out.println(b.charAt(4));
        try{
            System.out.println(b.charAt(5));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
