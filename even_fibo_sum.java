import java.util.*;

public class even_fibo_sum{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		
		int lim,count=0,sum=0;
		System.out.println("Enter a Limit : ");
		lim = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		while(count < lim){
			for(int i = 2;i<=lim*2 ; i++){
				int c = a + b;
				a = b;
				b = c;
				if(i%2 == 0){
					sum = sum + c;
					count++;
				}
			}
			
		}
		System.out.println("Sum : " + sum);
	}
}
