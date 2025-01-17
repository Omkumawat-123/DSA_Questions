import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check :");
        int n=sc.nextInt();
        if (n<=1) {
            System.out.println(n +"  is not a prime Number ");
        }else{
            for(int i=2;i<=n/2;i++){
                if (n%i==0) {
                    System.out.println(n +"  is not a prime Number ");
                    return;
                    
                }
            }
            System.out.println("Number is Prime");
        } 
        

    }
    
}
