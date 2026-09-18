class Solution {
    public int minEatingSpeed(int[] arr, int h) {
    
        int low =1;
        int high = max(arr);

        while(low<=high){
           int mid = low + (high-low)/2;
           long total_hrs = totalhrs(arr,mid); 
           if(total_hrs<=h){
            high = mid-1;
           }
           else{
            low = mid+1;
           }
        }
        return low;
    }

    public int max (int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public long totalhrs (int[] arr ,int mid){
        long total_hrs =0;
        for(int i=0;i<arr.length;i++){
            total_hrs += (arr[i] + (long)mid - 1) / mid;
        } 
        return total_hrs;
    }
}