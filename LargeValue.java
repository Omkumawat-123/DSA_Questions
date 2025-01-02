import java.util.Scanner;

public class LargeValue {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size In Array :");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            // input array
        }
        int max = array[0];                 // intially declared max=0

        for( int num:array) {
           if ( num > max){
            max = num;
           }

        }
        System.err.println("Highest element is :"+ max);




        // for ( int i=0; i<size;i++) {
        //     System.out.println( "Enterd Array :" + array[i]);        // print array
        // }

    }

}
