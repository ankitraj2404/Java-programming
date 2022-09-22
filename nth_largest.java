import java.util.*;

public class nth_largest {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter Array Size : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int x;
        System.out.println("Enter N : ");
        x = sc.nextInt();

        System.out.println("Nth Maximun : " + arr[n-1]);
    }
}
