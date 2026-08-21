class Solution {
    public int maxProfit(int[] arr) {
     int profit = 0; ;
     int buy  =0; 
     int maxprofit = 0;
     for(int sell=1;sell<arr.length;sell++){
        if(arr[sell]<arr[buy]){
            buy=sell;
        }       
        if(arr[sell]>arr[buy]){
            profit = arr[sell]-arr[buy];
        }
        if(profit > maxprofit){
            maxprofit = profit;
        }
    
            }
            return maxprofit;
     }
}