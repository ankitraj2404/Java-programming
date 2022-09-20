import java.util.*;

public class pascal{

    public static int fact(int i){
        if(i==0){
            return 1;
        }
        return i*fact(i-1);
    }

    public static int ncr(int n, int r){
        return fact(n)/((fact(n-r))*fact(r));
    }
    public static void main(String[] Agrs){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Limit : ");
        int n = sc.nextInt();

        int spaces = n;
        int v;

        for(int i = 0;i<n;i++){
            for(int k = spaces;k>0;k--){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 0;j<=i;j++){
                v = ncr(i,j);
                System.out.print(v + " ");
            }
            System.out.print("\n");
        }
    }
}
