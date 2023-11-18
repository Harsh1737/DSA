import java.util.Scanner;

public class is_power_of_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        System.out.print(isPowerOf2_brian(num));
    }

//naive
    public static boolean isPowerOf2(int n)
    {
        if (n==0) return false;
        while (n!=1){
            if (n % 2 !=0) return false;
            n/=2;
        }
        return true;
    }

//Brian aldo
//Only 1 set bit in powers of 2
    public static boolean isPowerOf2_brian(int n)
    {
        if (n==0) return false;
//return ((n&(n-1))==0); 
//  }
//}
        int count=0;
        while (n>0)
        {
            n = (n&(n-1));
            count++;
        }
        boolean res = (count == 1)? true: false;
        return res;
    }   
}
