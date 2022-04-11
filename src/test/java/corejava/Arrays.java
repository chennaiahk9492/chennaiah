
package corejava;

public class Arrays {
    // arrays is object not a datatype, it ocupy the memory.  here one variable "a"stores the multiple values
    public static void main(String[] args) {
       //Array Index Out Of Bounds Exception method
        //example
       int b[]={10,20,30,40,50};
        b[2]=22; // if replace of int values use this
        System.out.println(b[2]); //individual elements find out
        //Index Out Of Bonds Exception
        try{
        System.out.println(b[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
      for(int i=0; i<b.length;i++){

         System.out.print(" "+b[i]);
          System.out.println();

       } //if we findout the indidual index don't use the "for" control statement
            //then put a index number insted of "i" place
        int a[][]={{1,2,3},{3,4,5},{5,6,7}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
        //a[0][0]=1;
        //a[0][1]=2;  this sequence apply here.
        //a[0][2]=3;
        //a[1][0]=3;
        //a[1][1]=4;
        //a[1][2]=5;
        //a[2][0]=5;
        //a[2][1]=6;
        //a[2][2]=7
// under the srtring character location find out
            String s="chennaiah";
            System.out.println(s.charAt(1));
            //by using string IndexOutOfBoundsException
            try{
                System.out.println(s.charAt(9));
            }catch (IndexOutOfBoundsException e){
                System.out.println(e);
            }





    }

}
