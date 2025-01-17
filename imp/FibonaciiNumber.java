public class FibonaciiNumber{
    public static void main(String[] args) {
        int n=10, firstNum=0, secondNum=1;
        for(int i=0;i<=n;i++){
             int nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
            System.out.print(" "+nextNum);
        }
       
        


    }
}