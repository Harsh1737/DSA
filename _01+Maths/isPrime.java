import java.util.Scanner;
public class isPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println(isprime(num));
	}
//naive
	public static boolean isprime(int num)
	{
		for(int i=2; i< Math.sqrt(num); i++)	//i*i < num
		{
			if (num % i ==0 )
			{
				return false ;
				// System.out.println("It is not a prime number");
				// System.exit(1);
			}
		}
		return true;
		//System.out.println("It is a prime num");
	}
	
//optimised
	public static boolean isprime_O(int num)
	{
		if (num == 1) return false;
		if (num == 2 || num ==3) return true;
		if (num % 2 ==0|| num % 3 ==0) return false;

		for(int i=5; i*i <=num; i+=6)
		{
			if (num % i ==0 || num % (i+2) == 0 )
			{
				return false;
			}
		}
		return true;
	}
}