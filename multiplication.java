import java.util.*;

public class multiplication {
    public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter M : ");
            int m = sc.nextInt();

            System.out.println("Enter N : ");
            int n = sc.nextInt();

            System.out.println("MULTIPLICATION TABLE : ");

            if(n>0){
                for(int i = 1 ; i<=n;i++){
                    System.out.println(i + " x " + m + " = " + i*m);
                }
            }
            else if(n < 0){
                for(int i = -1 ; i>=n;i--){
                    System.out.println(i + " x " + m + " = " + i*m);
                }
            }
            else if(n == 0){
                System.out.println(0 + " x " + m + " = " + 0*m);
            }

    }
}
