class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int low =max(arr);
        int high = sum(arr);

        while(low<=high){
            int mid = low+(high-low)/2;
            int dayreq = func(arr,mid);

            if(dayreq<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return low;
    }
     public int max(int[] arr) {
        int maxx = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
            }
        }

        return maxx;
    }
    
    public int sum(int[] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public int func(int[]arr,int mid){
        int days = 1;
        int load = 0;
        for(int i=0;i<arr.length;i++){
            if(load + arr[i]>mid){
                days = days+1;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return days;
    }
}