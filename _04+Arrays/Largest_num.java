public class Largest_num
{
	public static void main(String[] args) {
		int[] arr = {40,8,50,100};
		System.out.print(find_largest_num(arr));
	}
	public static int find_largest_num(int[] arr){
		int max_num = Integer.MIN_VALUE;
		int i;
		for(i=0; i<arr.length; i++)
		{
			if (arr[i]>max_num)
				max_num=arr[i];
		}

		return (i-1);
		//--------------Guess what is i value ?????????   3 or 4
	}	
}