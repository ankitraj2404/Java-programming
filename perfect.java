import java.util.*;

public class perfect {

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

        System.out.println("Enter Limit : ");
        String inp = sc.nextLine();


        if(checkInt(inp)){
            int n = Integer.parseInt(inp);

            if()
                int num = 1;
                while(n > 0){
                    int sum = 0;
                    for(int i = 1;i<num;i++){
                        if(num%i==0){
                            sum = sum + i;
                        }
                    }
                    if(sum == num){
                        System.out.print(num + " ");
                        n--;
                    }
                    num++;
                }
        }
    }
}
