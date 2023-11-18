import java.util.Scanner;

public class isPallindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        isPallindrome(num);
    }

    public static void isPallindrome(int n){
       int rev = 0 ;
       int temp = n ;
       while (temp != 0)
       {
            int rem = temp % 10 ;
            rev = (rev*10)+rem;
            temp/=10;
       }
       if (rev==n)
       {
        System.out.println("Yes");
       }
       else
       {
        System.out.println("No");
       }
    }
}