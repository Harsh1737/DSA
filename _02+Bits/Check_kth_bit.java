import java.util.Scanner;

public class Check_kth_bit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter k : ");
        byte k=sc.nextByte();
        sc.close();
        System.out.print(is_k_set_RS(num,k));
        //System.out.print(is_k_set_LS(num,k));

 	}

//Right shift
//Original number is changed
 	public static boolean is_k_set_RS(int n, byte k)
 	{
 		if (((n>>(k-1))&1)==1) return true;
 		else return false;
 	}

//Left shift 
//Original number remains
 	public static boolean is_k_set_LS(int n, byte k)
 	{
 		if (((1<<(k-1)& n) ==1) return true;
 		else return false;
 	}
}