public class FindNo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        int n=arr.length+1;
        int actualsum= n*(n+1)/2;
        int expectedsum=0;
        for(int i=0;i<arr.length;i++){
            expectedsum=expectedsum+arr[i];
        }
       int MissingNum= actualsum-expectedsum;
       System.out.println(MissingNum);
    
    }
}
