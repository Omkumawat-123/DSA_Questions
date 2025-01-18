

public class DuplicateStr {
    public static void main(String[] args) {
        String str = "abababa";
        String result = "";
        char currntChar;
        for (int i = 0; i < str.length(); i++) {
            currntChar = str.charAt(i);             // store every char at currentchar
            boolean flag = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currntChar) {    // check the char if avilable in currentchar
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                result = result + currntChar;
            }
            
        }
        System.out.println(result);

    }

}
