import java.util.*;

public class special_char {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String inp;
        System.out.println("Enter a String : ");
        inp = sc.nextLine();

        String special = "";

        int special_count = 0;

        for(int i = 0;i<inp.length();i++){
            if(!(Character.isAlphabetic(inp.charAt(i))) && !(Character.isDigit(inp.charAt(i)))){
                special = special + inp.charAt(i);
                special_count+=1;
            }
        }

        System.out.println("Special Character Count : " + special_count);
        System.out.println("Special Characters : " + special);

    }
}
