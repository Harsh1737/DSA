import java.util.Scanner;

public class allDivisors 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        printDivisors_O2(num);
    }

//naive

    public static void printDivisors(int n)
    {
        for(int i=1; i<=n; i++){
            if ( n % i ==0)
            {
                System.out.print(i + " ");
            }
        }
    }

//optimised
//Unsorted output
    public static void printDivisors_O(int n)
    {
        for(int i=1; i*i < n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
                if (i!=(n/i))
                {
                    System.out.print((n/i)+" ");
                }
            }
        }
    }

//optimised
//Sorted output
    public static void printDivisors_O2(int n)
    {
        int i=0;
        for(i=1; i*i <n; i++)
        {
            if (n % i ==0)
            {
                System.out.println(i);
            }
        }
        for(;i>=1;i--)
        {
            if (n % i ==0)
            {
                System.out.println(n/i);
            }   
        }
    }
}
