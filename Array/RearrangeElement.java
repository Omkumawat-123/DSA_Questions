import java.util.*;;
public class RearrangeElement {
    public static void main (String arg[]){
        int [] array={2,4,8,3,1,5,9,0,4};
       

        // increment
        for (int i=0; i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++)
            if (array[j]>array[j+1])  // current elment jar motha asla swap next element 
            {        
                // swap
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                
            }
           
        }
        System.out.println(Arrays.toString(array));
    }
    
}
