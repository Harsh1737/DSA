//printing frequency of all elements in sorted array
public class frequency_of_allelements_in_sorted_array
{

	public static void main(String[] args) 
	{
		int arr[] = {10, 20};
		freq_of_array_elements(arr);
	}


	public static void freq_of_array_elements(int[] arr)
	{
		int count =1,i=1;
		
		while (i<arr.length && arr[i] == arr[i-1]) {
			count++;
			i++;
		}
		System.out.print(arr[i-1] +" " +count);
		System.out.println();
		

		//reset
		i++;
		count=1;
//Corner cases
		if (arr.length==1 || arr[arr.length-1]!= arr[arr.length -2])
		{
			System.out.print(arr[i-1]+" "+1);
		}
	}
}