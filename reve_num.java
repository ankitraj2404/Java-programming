import java.util.*;

public class reverse_num {
    public static int reverse(int s){
        int rem,rev = 0;
        while(s > 0){
            rem = s%10;
            rev = rev*10 + rem;
            s = s/10;
        }
        return rev;
    }
    public static boolean checkInt(String num){
        try{
            int n = Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Enter a Valid Integer.");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String num;
        System.out.println("Enter a Number : ");
        num = sc.next();

        if(checkInt(num) == true){
            int n = Integer.parseInt(num);
            int r = reverse(n);
            System.out.println("Reverse : " + r);
        }
    }
}
