

public class RevString {
    public static void main(String[] args) {
        String str="abc";
        //char ch=0;
        String RevString=" ";
        // for(int i=0;i<str.length();i++){
        //     ch=str.charAt(i);
        //     RevString=ch+RevString;                      // usign prpend 
            
        // }

        for(int i=str.length()-1; i>=0 ; i--){
            RevString=RevString+str.charAt(i);
        }
        System.out.println("Reversre String is:"+ RevString);
    }
    
}
