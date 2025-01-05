public class CountElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int count=0;
        for(int i=0;i<array.length;i++){
            count=count+1;
        }
        System.out.println("There are"+" "+count +" element in array");

    }
    
}
