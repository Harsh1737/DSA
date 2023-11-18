public class maximum_difference
{
	
	public static void main(String[] args) {
			int arr[] ={2,3,10,6,4,8,1};
			max_diff_O(arr);
	}

//native
	public static void max_diff(int[] arr)
	{

		int x = 0 - arr[0];		//arr[1]-arr[0];
		
		for( int i=0; i<arr.length-1; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if ((arr[j]-arr[i]) > x)
				{
					x = arr[j]-arr[i];
				}
			}
		}
		System.out.print(x);
	}	


//optimised

	public static void max_diff_O(int[] arr)
	{

		int res = arr[1]-arr[0];
		int minval = arr[0];

		for(int j=0; j<arr.length; j++)
		{
			res = Math.max(res, arr[j]- minval);
			minval = Math.min(minval, arr[j]);
		}
		System.out.print(res);
	}
}