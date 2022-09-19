import java.util.*;

public class mad_add {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows and Cols. of Matrices : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][];
        a = new int[r][c];

        int b[][];
        b = new int[r][c];

        int result[][];
        result = new int[r][c];

        System.out.println("Enter Numbers of Mat1 : ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Numbers of Mat2 : ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("RESULT : ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.print("\n");
        }


    }
