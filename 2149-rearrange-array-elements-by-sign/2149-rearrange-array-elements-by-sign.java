class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int brr[]= new  int [n];
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                 brr[posIndex] = arr[i];
                posIndex += 2;
            }
            if(arr[i]<0){
                brr[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return brr;
    }
}