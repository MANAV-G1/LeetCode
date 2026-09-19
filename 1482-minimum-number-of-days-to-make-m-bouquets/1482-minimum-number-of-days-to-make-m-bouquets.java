class Solution {
    public int minDays(int[] arr, int m, int k) {
        int n = arr.length;

        if((long)m*k>n){
            return -1;
        }

        int low = min(arr);
        int high = max(arr);

        while(low<=high){
            int mid = low + (high-low)/2;

            if( possible(arr,mid,m,k) ==true ){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public int max (int[] arr){
        int maxx = arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>maxx){
            maxx = arr[i];
        }
        }
        return maxx;
    }

    public int min(int[] arr) {
        int minn = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<minn){
            minn=arr[i];
            }
        }
        return minn;
    }

    public boolean possible(int[] arr,int mid,int m,int k){
        int count = 0;
        int boqnum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                boqnum  += (count/k); 
                count = 0;
            }
        }
        boqnum += count/k;
        if(boqnum>=m){
            return true;
        }
        else{
            return false;
        }
    }
}