import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String ab=obj.nextLine();
        String ReversreStr="";
        for(int i=0;i<ab.length();i++)
        {
            char ch=ab.charAt(i);
            ReversreStr=ch+ReversreStr;   
        }
        
        if(ab.equals(ReversreStr)){
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not");
        }

        

    }
    
}
