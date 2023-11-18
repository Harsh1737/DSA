public class moving_all_zeros_to_end
{
	public static void main(String[] args) {
		int arr[] = {10,5,0,0,8,0,9};
		zeros_to_end_O(arr);
		for(int x: arr){
			System.out.print(x+" ");
		}
	}

//naive
	
	public static void zeros_to_end(int arr[]){
		int n=arr.length;

		for(int i=0; i<n; i++){
			if (arr[i] == 0)
			{
				for(int j=i+1; j<n; j++)
				{
					if (arr[j] != 0){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;;
					}
				}
			}
		}
	}

	public static void zeros_to_end_O(int arr[]){
		int n = arr.length;
		int count = 0;
		for (int i=0; i<arr.length; i++){
			
			if (arr[i] != 0){
				//swap with prev occuring zero
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;

				//not first count++ then swap --------------
			}

			if (arr[i] ==0){
				//no need to do anything
			}
		}
		
	}
}