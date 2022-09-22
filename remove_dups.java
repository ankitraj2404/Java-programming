import java.util.*;

public class remove_dup {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i] == arr[j] && arr[i] != -1){
                    arr[j] = -1;
                }
            }
        }

        System.out.println("Array after removing duplicates : ");
        for(int i = 0;i<size;i++){
            if(arr[i] != -1){
                System.out.print(arr[i] + "\t");
            }
        }
        
    }
}
