public class rope_cutting_problem
{
	public static void main(String[] args) {
		System.out.print(maxPieces(23,11,9,12));
	}

	public static int maxPieces (int n, int a, int b, int c)
	{
		if (n ==0) return 0;	//found one of the solution
		if (n < 0) return -1;
		int res = Math.max (maxPieces(n-a,a,b,c), (Math.max (maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c))));
		if (res ==-1)
			return -1;		//(7,2,2,2)
		return res+1;
	}
} 