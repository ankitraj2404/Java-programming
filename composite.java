import java.util.*;

public class composite{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Enter B : ");
        int b = sc.nextInt();

        int is_negetive = 0, count = 0;

        if(a < 0 || b < 0){
            is_negetive = 1;
        }

        System.out.println("COMPOSITE NUMBERS : ");
        if(a < b){
            for(int i = a+1; i<b;i++){
                count = 0;
                for(int j  = 1; j<=i;j++){
                    if(i%j == 0){
                        count = count+1;
                    }
                }
                if(count > 2){
                    System.out.print(i + "\t");
                }
            }
        }
        else if(a > b){
            for(int i = b+1; i<a;i++){
                count = 0;
                for(int j  = 1; j<=i;j++){
                    if(i%j == 0){
                        count = count+1;
                    }
                }
                if(count > 2){
                    System.out.print(i + "\t");
                }
            }
        }
        else if(a == b){
            System.out.println("Enter a VALID Range");
        }



        if(is_negetive == 1){
            System.out.println("\nEnter a VALID Range. Composite Numbers cannot be NEGETIVE. ");
        }
    }
}
