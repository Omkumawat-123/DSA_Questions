import java.util.*;
public class reverseNumber {

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int [] array = new int[size];
        for(int i=0; i<size;i++){
            array[i]=sc.nextInt();
        }

 //int[] array={1,5,6,3,2};


       int left=0;
       int right= array.length-1;
       while (left < right) {
            /// swap 
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
        left++;
        right --;
        
       }
      
         
       System.out.println("reverse array is:"+Arrays.toString(array));

    }
    
}
