import java.util.*;

public class factors{
    public static boolean checkInt(String n){
        try{
            int x = Integer.parseInt(n);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Enter a Valid Integer");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int count = 0,n;

        System.out.println("Enter N : ");
        String num = sc.nextLine();

        if(checkInt(num)){
            n = Integer.parseInt(num);
            for(int i = 1;i<=100;i++){
                if(n%i == 0){
                    count+=1;
                }
            }

            System.out.println("No. of Factors : " + count);
        }
    }
}
