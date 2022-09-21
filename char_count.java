import java.util.*;

public class Char_count{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String c = "";

        int upr_count = 0,lwr_count = 0,num_count = 0;
        while(c != "*"){
            c = sc.nextLine();
            if(Character.isUpperCase(c.charAt(0))){
                upr_count+=1;
            }
            else if(Character.isLowerCase(c.charAt(0))){
                lwr_count+=1;
            }
            else if(Character.isDigit(c.charAt(0))){
                num_count+=1;
            }
        }

        System.out.println("UPPER CASE : "+ upr_count);
        System.out.println("LOWER CASE : " + lwr_count);
        System.out.println("NUMERICS : "+ num_count);

    }
}
