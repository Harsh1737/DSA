public class second_largest_num
{
	public static void main(String[] args) {
		int[] arr = {10,10,10};
		System.out.print(find_sec_largest(arr));
	}

//Mixup of array element and index
/*
	public static int find_sec_largest(int[] arr){
		int max = Integer.MIN_VALUE;
		int sec_max =Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max){
				sec_max = max;
				max = arr[i];
			}
			else{
				if (sec_max < arr[i] && arr[i] < max){
					sec_max = arr[i];
				}
			}
		}
		return sec_max;
	}
*/
	public static int sec_largest(int arr[])
	{
		int res=-1;
		int largest = 0;

		for (int i=1; i<arr.length; i++) {
			if (arr[i] >arr[largest])
			{
				res = largest;
				largest = i;
			}
			else if (arr[i] < arr[largest])
			{
				if (res == -1 || arr[i] > arr[res])
				{
					res = i;
				}
			}
		}
		return res;
	}
}