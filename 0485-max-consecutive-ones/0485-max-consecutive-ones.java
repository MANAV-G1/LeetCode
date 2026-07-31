class Solution {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxcount = 0;
        int count = 0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==1){
                count = count+1;
            }
            if(count > maxcount){
            maxcount = count;
            }
              if(arr[i]==0){
                count = 0;
              }  
            
        }
        return maxcount;
    }
}