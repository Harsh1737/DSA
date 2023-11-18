public class print_all_permutations_of_String
{
	public static void main(String[] args) {
		String str ="ABC";
		String curr ="";
		print_all_permutations(str, curr, 0 );
	}

	public static void print_all_permutations(String str,String curr, int i)
	{
		if (i==str.length()){
			System.out.println(curr);
			return;
		}
		print_all_permutations(str, curr, i+)
		print_all_permutations(str, curr+str.charAt(i),i+1);
	}
}