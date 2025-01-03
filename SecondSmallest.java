public class SecondSmallest {
    public static void main (String arg[]){

        int [] array ={1,2,3,4,5,6};   // declaration of array 
        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
               if (num < smallest) {
                smallest=num;     
               }
               else if ( num > smallest && num < SecondSmallest )
               {
                SecondSmallest=num;

               }
              
                 
        }
        System.out.println("the Second smallest  element is :" +SecondSmallest);
        
    }
    
}
