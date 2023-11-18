public class is_sorted
{
	public static void main(String[] args) {
		int[] arr = {8,12,15};
		System.out.print(isSorted(arr));
	}

	public static boolean isSorted(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if (arr[i-1] > arr[i])		//arr.len -1 or && condition to handle last iteration
			{
				return false;
			}
		}
		return true;
	}
}
//take care of i,i+1  and i-1,i
//i+1 case can go out of bound