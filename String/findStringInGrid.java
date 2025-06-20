class Solution {
    
    static boolean ValidCoord(int x , int y, int m , int n){
       return x >= 0 && y >= 0 && x < m && y < n;
        
        
    }
    
    static boolean findword(int index, String word, char[][] arr, int x , int y ,int dirX, int dirY ){
        if(index == word.length()){
            return true;
        }
        
        if(ValidCoord(x, y,arr.length, arr[0].length)&& word.charAt(index)==arr[x][y]){
            return findword(index+1, word,arr,x+dirX, y+dirY, dirX, dirY);
        }
        return false;
        
    }
    public int[][] searchWord(char[][] grid, String word) {
        // Code here
        int m = grid.length;
         if ( m== 0) return new int[0][0];
        int n = grid[0].length;
         List<int[]> ans = new ArrayList<>();
       int[] dirX = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dirY= { -1, 0, 1, -1, 1, -1, 0, 1 };
        
        for(int i = 0 ; i< m; i++){
            for(int j = 0 ; j<n; j++){
                for(int k =0;k<8;k++){
                    if(findword(0, word , grid, i,j,dirX[k], dirY[k])){
                        ans.add(new int [] {i,j});
                        break;
                    }
                    
                }
            }
        }
          return ans.toArray(new int[0][]);
    }
}
