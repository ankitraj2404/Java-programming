import java.util.Scanner;

public class days 
{ 
    public static void main(String[] Args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of Days : ");
        float num = s.nextFloat();

        if(num > 0){
            int year = (int) num/365;
            int w = (int) (num%365);
            System.out.println("No. of YEARS : " +  year);

            int week = w/7;
            int d = w%7;
            System.out.println("No. of WEEKS : " + week);
            System.out.println("No. of DAYS : " + d);
        }
        else{
            System.out.println("INVALID INPUT ! No. of Days Cannot be Zero Or Negative ! ");
        }
    }
}
