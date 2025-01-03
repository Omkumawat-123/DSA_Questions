import java.util.Scanner;

public class SmallValue {
    public static void main(String arg[]){
        int [] array=new int[4];

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the array:");
    for(int i=0;i<4;i++){
      array[i]=sc.nextInt();
    }

    int min = array[0];

    for(int num:array){
        if (num < min ) {
            min=num;
        }

    }
    System.out.println("the min value is :"+min);
    }
    
}
