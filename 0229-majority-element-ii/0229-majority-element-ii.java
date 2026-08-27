class Solution {
    public List<Integer> majorityElement(int[] arr) {

     List<Integer> ans = new ArrayList<>();

   int can1 = 0;
   int count1 = 0;
   int can2 = 0;
   int count2 = 0;


   for(int i=0;i<arr.length;i++){
    if(arr[i]==can1){
        count1++;
    }
    else if(arr[i]==can2){
        count2++;
    }
    else if(count1==0){
        can1=arr[i];
        count1 =1;
    }
    else if(count2==0){
        can2=arr[i];
        count2 =1;
    }
    else{
        count1--;
        count2--;
    }
   }
   
   count1=0;
   count2=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==can1){
            count1++;
        }
        else if(arr[i]==can2){
            count2++;
        }
    }
    if(count1>arr.length/3){
        ans.add(can1);
    }
    if(count2>arr.length/3){
        ans.add(can2);
    }
    return ans;
}
}