class Solution {
    public int maxProfit(int[] arr) {
        int minprice = arr[0];
        int profit = 0;
        int maxprofit = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < minprice){
                minprice = arr[i];
            }
            
               profit = arr[i] - minprice; 
            
            if(profit>maxprofit){
                maxprofit = profit;

            }
        }
     return maxprofit;   
    }
}