class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = -1;
        int maxcount = -1;

        for(int i = 0; i < mat.length; i++) {
            int rowcount = 0;
            for(int j = 0;j<mat[0].length;j++){
                rowcount += mat[i][j];
            }
            if(rowcount>maxcount){
                maxcount = rowcount;
                index = i;
            }
         
        }

        return new int[]{index, maxcount};
    }
}

   