 import java.util.Scanner;

public class counting_set_bits 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        sc.close();
        System.out.print(count_set_bits_lookup(num));
    }


//Naive
    public static int count_set_bits(int n)
    {
        int res = 0;
        while( n>0)
        {
            if((n &1)==1 )
                res++;
            n>>=1;
        }
        return res;
    }

//optimsed
    public static int count_set_bits_O(int n)
    {
        int res = 0;
        while( n>0)
        {
            n = (n &(n-1));
            res++;
        }
        return res;
    }

//lookuptable
    public static int count_set_bits_lookup(int n)
    {
        int[] set_bits_count = new int[256];
        set_bits_count[0] = 0;
        for(int i=1; i<256; i++)
        {
            set_bits_count[i] = ( i&1 ) + set_bits_count[i/2];
        }

        
    //public static int count (int n)
    {
        int res = set_bits_count[n & 0xff];
        n=n>>8;
        return res;
    }
    }
}