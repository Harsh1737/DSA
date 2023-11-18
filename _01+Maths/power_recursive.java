import java.util.Scanner;

public class power_recursive
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
		//base
		if ( n==0) return 1;
		if ( n==1) return x;
		//work
		if (n%2 ==0){
			int temp = power(x, n/2);
			return temp*temp;
		}
		else{
			return power(x, n-1)*x;
		}
		/*
		int temp = power(x,n/2);
		temp = temp*temp;
		if(n%2==0) return temp;
		else return temp*x; 
		*/
	}
}