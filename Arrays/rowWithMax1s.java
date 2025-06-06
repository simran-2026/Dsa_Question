class Solution {
    public int rowWithMax1s(int matrix[][]) {
        // code here
        for(int i = 0 ; i<matrix[0].length;i++){
            for(int j = 0 ; j<matrix.length;j++){
                if(matrix[j][i]==1){
                    return j;
                }
            }
        }
        return -1;
    }
}
