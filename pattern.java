import java.util.*;

public class pattern {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Symbol : ");
        String symbol = sc.nextLine();

        System.out.println("No. of Rows : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
