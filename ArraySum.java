package arrayDemo;
import java.util.*;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element u want...");
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0 ; i < n; i++)
		{
			System.out.println("Enter element..."+(i+1));
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i < n ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of array..." + sum);
	}

}
