import java.util.*;

public class max_min{
    public static void sort(int a[],int s){
        int temp;
        for(int i = 0;i<s;i++){
            for(int j = i+1;j<s;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void print_array(int a[], int s){
        for(int i=0;i<s;i++){
            System.out.print(a[i] + "  ");
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int size,m,n,arr[];
        System.out.println("Enter Array Size : ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter " + size + " Elements : ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,size);
        
        System.out.println("Enter M : ");
        m = sc.nextInt();

        System.out.println("Enter N : ");
        n = sc.nextInt();

        if(m<=size && n<=size){
            System.out.println("Mth Max : " + arr[size-m]);
            System.out.println("Nth Min : " + arr[n-1]);
        }
        else{
            System.out.println("Enter Valid M or N");
        }
        
    }
}
