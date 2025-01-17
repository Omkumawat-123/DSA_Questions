import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
       // int result=Fact(n);
       int result=1;
       for(int i=1;i<=n;i++){
        result=result*i;                                 // Using for loop
       }
        System.out.println("The Factorial of "+n +" is:"+result);
       
        
    }

    // static int  Fact(int n){
    //     if (n==1){
    //         return 1;
    //     }                                // using Recursion
    //     else {
    //         return n*Fact(n-1);
    //     }

    // }
    
}
