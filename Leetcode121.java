
class Solution {
	int min=0,max= 0;
	public int maxProfit(int[] prices) {
		for (int i = 1; i < prices.length; i++) {
			if (prices[min] > prices[i]) min = i;
			else if(prices[i]-prices[min]>max){
				max=prices[i]-prices[min];
			}
		}
		return max;
	}
}