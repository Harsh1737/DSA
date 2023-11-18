public class binary_search
{
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.print(bin_search(arr, 50));
	}

	public static int bin_search (int arr[] , int x)
	{
		int n = arr.length;
		
		int low_idx =0;
		int high_idx =n-1;
		while(low_idx <high_idx)
		{
			int mid_idx = (low_idx + high_idx)/2;
			if (arr[mid_idx] == x)
			{
				return mid_idx;
			}
			else if (arr[mid_idx] > x)
			{
				high_idx = mid_idx - 1 ;
			}
			else {
				low_idx = mid_idx + 1 ;
			}
		}
		return -1;
	}
}