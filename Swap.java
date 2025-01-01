import java.util.Scanner;
import java.util.*;

public class Swap{
    public static void main(String arg[]){
   int A,B,C;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Valuve A :" );
    A=sc.nextInt();
    System.out.println("Enter The Valuve B :" );
    B=sc.nextInt();
    System.out.println("Enter The Valuve C :" );
    C=sc.nextInt();


                           // using Temp variable 
//    int temp=A;
//    A=B;
//    B=C;
//    C=temp;

                       // Using Addtions + multiplications 
A=A+B+C;
B=A-(B+C);
C=A-(B+C);
A=A-(B+C);
   
   System.out.println("A: "+ A +" B: "+ B +"C: "+C);

    }
}

