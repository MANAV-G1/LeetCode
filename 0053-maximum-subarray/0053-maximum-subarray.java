class Solution {
    public int maxSubArray(int[] arr) {
        
        int sum =0;
        int maxSum = arr[0];
        for(int i=0;i<arr.length;i++){
           
            sum +=  arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0 ){
                sum = 0;
            }

        
        }
        return maxSum;
    }
}