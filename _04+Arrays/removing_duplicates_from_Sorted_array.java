public class removing_duplicates_from_Sorted_array
{
	public static void main(String[] args) {
		int[] arr = {10,10,10};
		System.out.print(remove_duplicates(arr, arr.length));
	}

	public static int remove_duplicates(int arr[] , int size)
	{
		int res = 1;
		for(int i=1; i<arr.length; i++)
		{
			//no need to mention it
			// if(arr[i-1] == arr[i])
			// {
			// 	continue;
			// }
			if (arr[i-1] <arr[i]) {		//(arr[res-1] !=arr[i])
				arr[res++] = arr[i];
			}
		}
		return res;
	}
}