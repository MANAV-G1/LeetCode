class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;
        for(int i = arr.length - 2;i>=0;i-- ){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
                int left =0;
                int right =arr.length-1;
                while(left<right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } 
            }
        else{for(int j = arr.length-1;j>pivot;j--){
                if(arr[j]>arr[pivot]){
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
                int left=pivot+1;
                int right=arr.length-1;
                 while(left<right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } 
            }
        }
        }
    
