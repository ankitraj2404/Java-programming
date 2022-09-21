import java.util.*;

public class leap {
    public static boolean checkNum(String s){
        try{
            int x = Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Enter a Valid Date.");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Date : ");
        String date = sc.nextLine();

        String[] date_Array = date.split("/");

        if(checkNum(date_Array[0]) && checkNum(date_Array[1]) && checkNum(date_Array[2])){
            int year = Integer.parseInt(date_Array[2]);
            int day = Integer.parseInt(date_Array[0]);
            int month = Integer.parseInt(date_Array[1]);
            if((day > 0 && day<=31)&&(month > 0 && month<=12)){
                if(year%4 ==0){
                    System.out.println("The Year is a Leap Year");
                }
                else{
                    System.out.println("The Year is not a Leap Year");
                }
            }
            else{
                System.out.println("Enter a Valid Date");
            }
        }

    }
}
