public class AvgOfElement {
    public static void main(String arg[]){
        int [] array={1,2,3,4,5,6,7,8,9};
        int count=0;
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            count++;
        }
           System.out.println("sum is :"+sum);
           System.out.println("Number of digit id :"+ count);
        System.out.println("the avg of the array is :"+sum/count);
       

    }
    
}
