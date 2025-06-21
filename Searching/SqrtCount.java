// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int squareRoot = (int) Math.sqrt(n);
         if (squareRoot * squareRoot == n) {
            return squareRoot - 1;
        }
        return squareRoot;

        
    }
}
