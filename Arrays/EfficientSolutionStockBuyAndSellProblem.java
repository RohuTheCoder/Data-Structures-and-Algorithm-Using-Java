public class EfficientSolutionStockBuyAndSellProblem {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        int result = maxProfit(arr);
        System.out.println(result);
    }
    static int maxProfit(int price[])
    {
        int n = price.length;
        int profit = 0;
        for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
                profit += price[i]-price[i-1];
        }
        return profit;
    }
}
