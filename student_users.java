import java.util.*;

public class student_users {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int student_user,total_user,staff_user,non_teaching_user;
        System.out.println("Enter Total Users : ");
        total_user = sc.nextInt();

        if(total_user > 0){
            System.out.println("Enter Staff Users : ");
            staff_user = sc.nextInt();
            if(staff_user < total_user){
                non_teaching_user = staff_user/3;

                student_user = total_user - (staff_user + non_teaching_user);

                System.out.println("Student Users : " + student_user);
            }
            else if(staff_user == total_user){
                System.out.println("Student Users : 0 ");
            }
            else{
                System.out.println("INVALID ! \nTotal Users cannot be less than Staff Users");
            }
        }
        else{
            System.out.println("Total Users Cannot be ZERO or NEGATIVE.");
        }
