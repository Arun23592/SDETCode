package Amazon;

public class SellandBuyStock {

	public static int[] sellBuyStock(int[] prices) {
		if(prices == null || prices.length < 2) {
			return new int[] {-1, -1};
		}
			int maxProfit = 0;
			int buyDay = -1;
			int sellDay = -1;
			
			for(int i=0; i<prices.length-1; i++) {
				for(int j=i+1; j<prices.length; j++) {
					int profit = prices[j] - prices[i];
					if(profit > maxProfit) {
						maxProfit = profit;
						buyDay= i;
						sellDay = j;
					}
				}
			}
			
			
			
		return new int[] {buyDay, sellDay};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {100,180,260,310,40,535,695};
		int[] result = sellBuyStock(prices);
		System.out.println(prices[result[0]]+" is  a price "+ result[0] + " is a buying day "+ prices[result[1]]+ " is a selling prices "+result[1]+ " is a selling day");
	}

}
