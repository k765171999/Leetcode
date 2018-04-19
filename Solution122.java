public class Solution122 {
    public static void main(String[] args) {
        int prices[]={1,3,5,2,6,8,6,9};
        Solution122 s = new Solution122();
        System.out.println(s.maxProfit(prices));  
       }

    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
               int tmp = prices[i]-prices[i-1];
               total = total+tmp;
                // min = Math.min(prices[i-1], min);
            }
        }
        return total;
    }
}