package corejava;

public class Tables {


    public static void main(String[] args) {
        for(int k=1; k<=10; k++) {

            for(int i=1;i<=10;i++)
            {
                if(i==8)
                    continue;
                System.out.print(i + "*" + k +"="+i*k + "           ");
            }

            System.out.println();

        }
    }

}
