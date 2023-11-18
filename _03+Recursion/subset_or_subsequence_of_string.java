public class subset_or_subsequence_of_string 
{
	public static void main(String[] args) 
	{
	generate_subsequence("ABC","",0);
	}


	public static void generate_subsequence(String str , String curr, int i)
	{
		if (str.length() == i){
			System.out.print(curr);
			System.out.println();
			return;
		}
		generate_subsequence(str, curr, i+1);
    	generate_subsequence(str, curr+str.charAt(i),i+1);
	}
}