public class left_rotate_by_1{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		left_rotate_by_1(arr);
		for(int x : arr){
			System.out.print(x+" ");
		}
	}

	public static void left_rotate_by_1(int[] arr){
		int temp = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		return;
	}
}