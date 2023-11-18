public class power_set
{
	public static void main(String args[])
	{
		String s = "abc";
		print_power_set(s);
	}

	public static void print_power_set(String str){
		char[] arr = str.toCharArray();
		int n = str.length();
		int power_size =(int) Math.pow(2,n);
		for (int i=0; i<power_size; i++)	//000-111
		{
			for(int j=0; j< n; j++)			//0-4  abcde
			{
				if ((i & (1<<j)) !=0)		//000 & (1, 2, 4, 8 ,16)
											//001 & (1, 2, 4, 8, 16)
				{
					for(int k=0; k<n; k++)
						System.out.print(arr[k]);	//printing str[k] acc to last bit of our counter (i)
					System.out.println();
				}	
			}
		}
	}
}