public class is_pallindrome
{
	public static void main(String[] args) {
		System.out.print(isPalli("hahayhahah",0,8));
	}

	public static boolean isPalli(String str, int start, int end)
	{
		if (start >=end )		//i.e 1 or less character
			return true;

		if ( str.charAt(start) != str.charAt(end))
			return false ;
		return isPalli(str, start+1, end-1);

		//return (str.charAt(start)==str.charAt(end) && isPalli(str, start+1, end-1));
	}
}