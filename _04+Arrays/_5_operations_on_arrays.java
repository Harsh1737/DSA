public class _5_operations_on_arrays
{
	public static void main(String[] args) {

		int arr[] = {2,4,2,57,8,9,10,3,68,1};
		
		//System.out.print(insert(arr, 2, 5));
		
		System.out.println(delete(arr, 4));
		System.out.print( search(arr, 68) );
	}

	public static int search(int[] arr, int x)
	{
		for(int j=0; j<arr.length; j++){
			if (arr[j] == x) return j;
		}
		return -1;
	}

	public static int insert (int[] arr, int pos, int cap, int ele)
	{
		int size = arr.length;
		if (pos > size) return -1;

		int idx = pos-1;
		for (int i=size-1; i>=idx; i--)
		{
			arr[i+1]=arr[i];
		}
		arr[idx] = ele;
		return idx;
	}

	public static int delete(int arr[], int pos )
	{
		if (pos >= arr.length) return 0;

		int idx = pos-1;
		int deleted_elem = arr[idx];
		for (int i= idx; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		return deleted_elem;
	}
}