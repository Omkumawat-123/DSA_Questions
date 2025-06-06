import java.util.*;
public class CountFreqChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=in.nextLine();

        Map<Character, Integer> obj = new HashMap<>() ;
            
        for (char ch:str.toCharArray()) {   // seprate the char 
          if(obj.containsKey(ch)){        
            obj.put(ch, obj.get(ch)+1);}    // if ch is contain the char then increase the conut
            else{

                obj.put(ch, 1);   // otherwise get the char and count it 1 

            }
          }
          System.out.println(obj);
            
        }




    }
