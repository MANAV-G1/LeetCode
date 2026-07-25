class Solution {
    public static int removeDuplicates(int[] arr) {
       int i=0;
       for(int j =0;j<arr.length;j++){
        if(arr[j]!=arr[i]){
            i++;
            arr[i]=arr[j];
        }
       }
       return i+1;
        }



    
    

    public static void main(String[]args){
            int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");

    }
}
}
