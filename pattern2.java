import java.util.*;

public class pattern {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int lim;
        System.out.println("Enter Max Rows : ");
        lim = sc.nextInt();

        for(int i = 0;i<lim;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("1  ");
            }
            System.out.print("\n");
        }
        for(int i = lim-2;i>=0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print("1  ");
            }
            System.out.print("\n");
        }


    }
}
