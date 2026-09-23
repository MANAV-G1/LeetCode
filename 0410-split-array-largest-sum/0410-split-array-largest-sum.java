class Solution {
    public int splitArray(int[] arr, int k) {
        int low = MAX(arr);
        int high = SUM(arr);

        while(low<=high){
            int mid = low +(high-low)/2;
            int count = SUBARRAY(arr,mid);

            if(count<=k){
                high = mid-1;
            }
            else{
                low =mid+1;
            }
        }
        return low;
    }

    public int SUM(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public int MAX(int[] arr){
        int max = arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
         }
        return max;
    }
    public int SUBARRAY(int[] arr,int mid){
        int sum =0;
        int count=1;
        for(int i =0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                count++;
                sum = arr[i];
            }
            else{
                sum +=arr[i];
            }
        
        }
                
        return count;
    }
}