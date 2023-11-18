import java.util.Scanner;

public class power_iterative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		System.out.println("Enter a power : ");
		int pow = sc.nextInt();
		sc.close();
		System.out.print(power(num,pow));
	}

	public static int power(int x, int n)
	{
		int result=1;
		while (n>0){
//			int which_round = 1;		// no ned if we are using previous calculated value 
			if (n%2 ==1)				// (n&1)
			{
				result = result*x;		//<------ mod m
			}
			else{}
			x=x*x;						// mod m
			n = n / 2 ;
//			which_round++;
		}
		return result;
	}
}