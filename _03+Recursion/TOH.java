public class TOH
{
	public static void main(String[] args) {
		toh(4, 'A', 'B', 'C');
	}

	public static void toh(int n, char A, char B, char C)
	{
		if (n==1) {
			System.out.println("Move 1 tower from"+A+"to"+C);
			return ;
		}
		toh(n-1, A, C, B);
		toh(1, A, B, C);
		toh(n-1, B, A, C);
		return ;
	}
}