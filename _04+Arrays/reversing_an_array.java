public class reversing_an_array
{
	public static void main(String[] args) {
		int[] arr ={30,7,6,5,10};
		reverse_arr(arr);
	}

// Naive 1
	public static void reverse_arr(int[] arr)
	{
		int n= arr.length;
		int temp[] = new int[arr.length];
		for(int i=n-1; i>=0;i--)
		{
			temp[n-i-1] = arr[i];
		}
		for(int x : temp){
			System.out.print(x+" ");
		}
	}

//Optimised 2
	//i and (n-i-1)

//optimised 3
	public static void reverse_arr_O(int[]  arr)
	{
		int low = 0;
		int high = arr.length;
		while( low < high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++; high--;
		}
		for(int x : arr){
			System.out.print(x+" ");
		}
	}
}