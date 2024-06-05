package arrayDemo;

public class ArraywithoutSort {

	public static void main(String[] args) {
		int arr[] = { 9, -7, 6, 6, 5, 4 };
		int temp;
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second laegest element..."+arr[1]);

	}

}
