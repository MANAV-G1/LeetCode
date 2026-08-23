class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // transpose of the matrix 
        for(int i =0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        for(int k=0;k<row ;k++){
            
            int left =0;
            int right = col-1;
         
            while(left<right){
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
                left++;
                right--;
            }
        

        }
        
    }
    }

    
