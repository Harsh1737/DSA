import java.util.Scanner;

public class Sieve_of_Erasthenes
{
	public static void main(String[] args) {
		sieve_O();
	}

//naive

	public static void sieve()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		sc.close();
		boolean[] isPrime = new boolean[n+1];
		for (int i=2; i<n; i++){
			isPrime[i] = true;
		}
		for (int i=2; i*i<n; i++)
		{
			if (isPrime[i])
			{
				for( int j = i*2; j<=n; j=j+i){
					isPrime[j] = false;
				}
			}
		}
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				System.out.print(i+" ");
			}
		}
	}

//optimised

	public static void sieve_O()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		sc.close();
		boolean[] isPrime = new boolean[n+1];
		for (int i=2; i<n; i++){
			isPrime[i] = true;
		}
		for (int i=2; i*i<n; i++)
		{
			if (isPrime[i])
			{
				//System.out.print(i);
				for( int j = i*i; j<=n; j=j+i){		//<-------
					isPrime[j] = false;
				}
			}
		}
		for(int i=2; i<=n; i++){
			if(isPrime[i]){
				System.out.print(i+" ");
			}
		}
	}
}