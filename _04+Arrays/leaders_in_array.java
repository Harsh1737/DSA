import java.util.ArrayList;

public class leaders_in_array
{

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 3, 6, 5, 2};
		find_leaders_O(arr);
	}

	public static void find_leaders(int[] arr)
	{

		ArrayList<Integer> al = new ArrayList<Integer>(arr.length);

		for(int i=0; i<arr.length; i++){
			boolean flag = false;
			for(int j = i+1; j<arr.length; j++)
			{
				if (arr[j] < arr[i]){
					flag = true;
				}
				else{
					flag = false;
					break;
				}

			}
			if (flag == true) al.add(arr[i]);
		}
		al.add(arr[arr.length-1]);
		System.out.print(al);
	}


// Better approach ----------------------------------
	
	/*for(int j = i+1; j<arr.length; j++)
			{
				if (arr[i] <= arr[j]){
					flag = true;
					break;
				}
			}
			if (flag == false) 
				al.add(arr[i]);
	*/


//optimised from RTL
	public static void find_leaders_O(int[] arr)
	{
		int cur_leader = arr[arr.length-1];
		System.out.print(cur_leader+" ");

		for(int i=arr.length-2; i>=0; i--){
			
			if( cur_leader < arr[i])
			{
				cur_leader = arr[i];
				System.out.print(cur_leader+" ");
			}
		}
	}
}