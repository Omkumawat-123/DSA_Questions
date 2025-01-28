public class SecondLarge {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int large = Integer.MIN_VALUE;
        int Secondlarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > large) {
                Secondlarge = large;  
                large = num;          
            } else if (num > Secondlarge && num < large) {
                Secondlarge = num;   
            }
        }
        System.out.println("The Second largest element is: " + Secondlarge);
        

    }
}