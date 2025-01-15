import java.util.*;
public class vowels{
    public static void main(String[] args) {
        int vowelss=0,Consonent=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String to check :");
        String str=obj.nextLine().toLowerCase();
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if (ch =='a' || ch =='e' ||ch =='i' || ch =='o' ||ch =='u' ) {
                vowelss++;
                
            }else{
                Consonent++;
            }

        }
        System.out.println("Vowels is "+vowelss);
        System.out.println("Consonent is "+Consonent);
    }
}