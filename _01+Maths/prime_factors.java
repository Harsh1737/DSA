import java.util.Scanner;

public class prime_factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		sc.close();
		factorialOfANumber(num);
	}
	
	public static void factorialOfANumber(int n)
	{
		int i=0;
		for (i = n; i>=2; i--)
		{
			if (isprime(num))
			{
				System.out.println(i + ", ");
			}
			else break;
		}
	}
}