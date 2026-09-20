class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int low = 1;
        int high = max(arr); 

        while(low<=high){
            int mid = low+(high-low)/2;
            long sum = 0;
            for(int i =0;i<arr.length;i++){
               sum += (arr[i] + mid - 1) / mid;
            }
            if(sum<=threshold){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return low;
    }

    public int max(int[] arr){
        int maxx = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxx){
                maxx = arr[i];
            }
        }
        return maxx;
    }
}