class Solution {
    int middle(int a, int b, int c) {
        // code here
        if ((a < b && b < c) || (c < b && b < a))
            return b;

        // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
        return a;

        else
        return c;
    }
}
