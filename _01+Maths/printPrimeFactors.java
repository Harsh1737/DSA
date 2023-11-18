import java.util.Scanner;

public class printPrimeFactors 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        printFactors(num);
    }

//naive
    public static void printFactors(int num)
    {
        if (num<=1) return;
    	for (int i=2; i*i<=num; i++)
    	{
    		while (num % i == 0)
    		{
    			System.out.print(i + " ");
    			num/=i;
    		}
    	}
    	if (num > 1) System.out.println(num);
    }

//optimised

    public static void printFactors_O(int num)
    {
        if ( num <=1 ) return;
        if (num % 2 == 0)                   ***
        {
            while(num % 2 == 0)
            {
                System.out.print(2 +" ");
                num/=2;
            }
        }
        if (num % 3 == 0)
        {
            while(num % 3 == 0)
            {
                System.out.print(3 +" ");
                num/=3;
            }
        }
        for (int i=5; i*i<=num; i=i+6)
        {
            while (num % i == 0)
            {
                System.out.print(i + " ");
                num/=i;
            }
            while (num % (i+2) == 0)
            {
                System.out.print((i+2) + " ");
                num/=(i+2);
            }
        }
        if (num > 3) System.out.println(num);  ***
    }
}