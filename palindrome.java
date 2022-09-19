import java.util.*;

class Palindrome{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String inp;
        System.out.println("Enter A String : ");
        inp = sc.next();

        String rev = "" ;
        for(int i = 0;i<inp.length();i++){
            rev = inp.charAt(i) + rev ; 
        }

        if(inp.equals(rev)){
            System.out.println(inp + " is a Palindrome");
        }
        else{
            System.out.println(inp + " is not a Palindrome");
        }
    }
}
