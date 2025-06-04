public class Recursion {
    static void number(int n){
        if (n==0) return ;
        System.out.println(n);
        number(n-1);    // recursion 
    }

    public static void main(String[] args) {
        number(4);    //static method call
    }
}
