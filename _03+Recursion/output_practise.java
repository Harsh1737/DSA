public class output_practise{
	public static void main(String[] args) {
		f2(3);
	}
	public static int f1(int n)
	{
		if (n==0) return 0;
		System.out.print(n);
		f1(n-1);
		System.out.print(n);
		return 0;
	}

	public static void f2(int n){
		if(n==0) return;
		f2(n-1);
		System.out.println(n);
		f2(n-1);
		return;
	}
}