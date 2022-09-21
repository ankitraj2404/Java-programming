import java.util.*;

public class average {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        int pos=0;
        int neg=0;
        int count_n=0,count_p=0;

        System.out.println("Enter Numbers : ");
        System.out.println("Enter -1 to exit : ");
        int x = 0;
        while(x != -1){
            x = sc.nextInt();
            if(x >= 0){
                pos+=x;
                count_p+=1;
            }
            else{
                neg+=x;
                count_n+=1;
            }
        }

        float avg_pos = (float)pos/count_p;
        float avg_neg = (float)neg/count_n;

        System.out.println("Average of Positive Nums : " + avg_pos);
        System.out.println("Average of Negetive Nums : " + avg_neg);
    }
}
