public class _2_odd_occuring_num_in_array
{
	public static void main(String[] args) {
		odd_appearing_O();
	}

//naive
	public static void odd_appearing()
	{
		int arr[]={3,4,3,4,5,4,4,6,7,7};
		int res[]={0,0};
		int k=0;
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=0; j<arr.length; j++){
				if (arr[i]==arr[j]) count++;
			}
			if(count %2 !=0)
				res[k++]=arr[i];
		}
		System.out.println(res[0] );
		System.out.print(res[1] );
		}


//optimised
	public static void odd_appearing_O()
	{
		int arr[]={3,4,3,4,8,4,4,32 ,7,7};
		int res[]={0,0};
		int xor_of_all = 0;
		for(int i=0; i<arr.length; i++){
			xor_of_all^=arr[i];
		}
		int  last_set_bit = xor_of_all & ~(xor_of_all - 1);

		for (int i=0 ;i<arr.length ;i++ ) 
		{
			if ((arr[i] & last_set_bit) != 0)
				res[0] ^= arr[i];
			else
				res[1] ^= arr[i];
		}
		System.out.print(res[0] +" ");			
		System.out.print(res[1]);
	}
}