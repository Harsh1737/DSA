public class stock_buy_n_sell_many_times
{
	public static void main(String[] args) {
			int price[] = { 1,5,3,8,12};
			System.out.print(maxProfit_O(price, 0, price.length));
		}	

	public static int maxProfit (int[] price, int start, int end)
	{
		int curr_profit = 0;
		int profit = 0;

		//base
		if (end <= start)	//0 or 1 element
			return 0;

		for (int i=start; i<end; i++)
		{
			for (int j=i+1; j<end; j++)
			{
				if ( price[j]>price[i])	//-------------------------
				{
					curr_profit = price[j] - price [i] + maxProfit(price, start, i-1)+maxProfit(price,j+1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}

	public static int maxProfit_O(int[] price, int a, int b)
	{
		int profit = 0;

		for (int i=1; i<price.length; i++)
		{
			if (price[i]>price[i-1])
			{
				profit += (price[i]-price[i-1]);
			}
		}
		return profit;
	}
}