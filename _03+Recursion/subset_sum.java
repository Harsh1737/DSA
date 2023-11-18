public class subset_sum
{
	static int sum = 0;
	static int count=0;
	public static void main(String[] args) {

		int arr[] = {-1, 2, 3};
		subset_sum(arr,0,0);

		System.out.println(count);
		System.out.print(countsubsets(arr,arr.length, sum));
	}

	public static void subset_sum(int[] arr, int curr, int i){
		if ( i==arr.length){
			if (sum == curr ){
				count++;
				return ;
			}
			else return;
		}

		subset_sum(arr, curr, i+1);
		subset_sum(arr, curr+arr[i],i+1);
		return ;
	}


//sum is kept in track not the subsets
	//if (sum==0) found 1
	public static int countsubsets(int arr[], int n, int sum){
		if (n==0){
			return (sum==0)? 1:0;
		}
		return countsubsets(arr,n-1, sum) + countsubsets(arr, n-1, sum-arr[n-1]);
	}
}