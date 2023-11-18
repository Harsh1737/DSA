import java.util.Scanner;

public class factorial 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        System.out.println(factorial(num));

    }

    public static long factorial(int n)
    {
        int i = 0 ;
        long factnum = 1;
        for (i=n; i>=2; i--)
        {
            factnum = factnum * i;
        }
       return factnum;
    }
}