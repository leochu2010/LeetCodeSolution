public class Solution121BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Solution121BestTimeToBuyAndSellStock solution = new Solution121BestTimeToBuyAndSellStock();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int cheapestPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < cheapestPrice) {
                cheapestPrice = prices[i];
            }
            int profit = prices[i + 1] - cheapestPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
