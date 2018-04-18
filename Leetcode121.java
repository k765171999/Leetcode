//Solution1:
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
//Solution 2:
class Solution {
	int max=0;
	int min=Integer.MAX_VALUE;
    public int maxProfit(int[] prices) {
        for(int i=0;i<prices.length;i++){
        	min=Math.min(prices[i], min);
        	if(prices[i]-min>max){
        		max=prices[i]-min;
        	}
        }
        return max;
    }
}
