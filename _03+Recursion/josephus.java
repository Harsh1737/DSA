public class josephus{
	public static void main(String[] args) {
		System.out.print(josephus (7, 3));
	}

	public static int josephus (int n, int k)
	{
		if (n == 1)
		{
			return 0;
		}
		return (josephus(n-1,k)+k)%n;
	}
} 