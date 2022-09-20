 import java.util.*;

public class psq {

    public static int perfect_square(int x){
        return x*x;
    }
    public static boolean checkValidity(int x){
        int sum = 0;
        while(x > 0){
            int rem = x%10;
            sum = sum + rem;
            x = x/10;
        }
        if(sum <= 10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int l,u;
        System.out.println("Enter Lower Range : ");
        l = sc.nextInt();
        System.out.println("Enter Upper Range : ");
        u = sc.nextInt();

        for(int i = l; i<u;i++){
            if(checkValidity(perfect_square(i))){
                System.out.print(perfect_square(i) + "\t");
            }
        }


    }
    
}
