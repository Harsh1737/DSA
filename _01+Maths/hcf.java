import java.util.Scanner;

public class hcf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2 :");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(hcf(num1, num2));
	}

//Optimized eculidean Algo.
	
	public static int hcf_O(int a, int b) {
		if(b == 0)
			return a;
		else
			return hcf(b,a%b);
	}

//naive

	public static int hcf(int a, int b) {
		while(a!=b){
			if (a>b)
				a=a-b;
			else
				b=b-a;
		}
		return b; //or a
}