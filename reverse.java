import java.util.*;

public class reverse{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String inp;
        System.out.println("Enter a Word : ");
        inp = sc.next();

        String rev = "";

        for(int i = 0;i<inp.length();i++){
            rev = inp.charAt(i) + rev;
        }

        System.out.println("REVERSE : " + rev);
    }
}
