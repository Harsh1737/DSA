public class Left_rotate{

	public static void main(String[] args) {
		int[] arr = {10,5,30,15};//{1,2,3,4,5};
		leftRotate_O(arr, 3);
		for(int n : arr){
			System.out.print(n+" ");
		}
	}


//naive
	public static void leftRotate(int[] arr, int d)
	{

		int[] temp = new int[d];
		int n = arr.length;
	//storing temp
		for(int i=0; i<d;i++){
			temp[i] = arr[i];
		}
	//moving left
		for(int i=d; i<n; i++)
		{
			arr[i-d] = arr[i];
		}
	//copying to end
		int k=0;
		for(int i =n-d; i<n; i++)
		{
			arr[i] = temp[k++]; 
		}
		//for(int i=0; i<d;i++)	arr[n-d+i] = temp[i];
	}




//optimised
	public static void leftRotate_O (int arr[], int d)
	{
		int n= arr.length;
		reverse(arr, 0,d-1);
		reverse(arr,d, n-1);
		reverse(arr,0,n-1);
	}
	public static void reverse(int[] arr, int low, int high)
	{
		while(low < high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;high--;
		}
	}
}