public class ThirdLargestNumber {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=40;

        if (a>=b && a>=c) {
            System.out.println("A");
        } else if(b>=c && b>=a){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
    }
}
