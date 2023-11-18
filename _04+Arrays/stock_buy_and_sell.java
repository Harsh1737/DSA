public class stock_buy_and_sell
{
	public static void main(String[] args) {
			int price[] = { 1,5,3,8,12};
			maxProfit_many_purchase(price, 0, price.length);
		}	

	public static int maxProfit_many_purchase (int[] price, int start, int end)
	{
		int curr_profit = 0;
		int profit = 0;

		//base
		if (end <= start)	//0 or 1 element
			return 0;

		for (int i=start; i<end; i++)
		{
			for (int j=i+1; j<=end; j++)
			{
				if ( price[j]>price[i])
				{
					curr_profit = price[j] - price [i] + maxProfit_many_purchase(price, start, i-1)+maxProfit_many_purchase(price,j+1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
}