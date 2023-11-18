public class print_n_to_1{
	public static void main(String[] args){
		print_n_to_1(5);
	}
	public static void print_n_to_1(int n){
		if (n==1) {
		System.out.println(1);
		return;
		}
		System.out.println(n);
		print_n_to_1(n-1);
		return;
	}
}