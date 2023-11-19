public class B_search_recursive
{
	public static void main(String[] args) 
	{

		int arr[] = {00, 10, 20, 30, 40, 50};
		System.out.print(bin_search(arr,0,arr.length,45));
	}


	public static int bin_search(int[] arr, int low, int high, int x)
	{

		//base 
		if (low > high) 
			return -1;

		
		int mid = (low+high)/2;

		if ( x == arr[mid]) 
			return mid;
		
		else if (x < arr[mid])
		{
			return bin_search(arr, low, mid-1, x);
		}

		else 
		{
			return bin_search(arr, mid+1, high, x);
		}
	}
}