import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        int count;
        int currentnum;
        int maxLen=0;;
 
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }       
        for(int num:set){
            if(!set.contains(num-1)){
                currentnum = num;
                count = 1;
                while(set.contains(currentnum +1)){
                    currentnum++;
                    count++;
                }
                if(count>maxLen){
                    maxLen = count;
                }
            }
            
            
            
        }
        return maxLen;
    }
}