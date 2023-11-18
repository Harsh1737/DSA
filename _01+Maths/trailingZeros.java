import java.util.Scanner;

public class trailingZeros 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        System.out.println(numberOfZeros(num));
    }

    public static int numberOfZeros (int num)
    {
        int count = 0 ;
        for (int i = 5; i<=num; i*=5)
        {
            count+=(num/i);
        }
        return count;
    }
}