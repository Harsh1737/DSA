public class sum_of_n_natural_num
{
	public static void main(String[] args) {
		System.out.print(sum(4));
	}
	public static int sum(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return sum(n-1)+n;
	}

	//(n*(n-1))/2;
}