
class Solution {

    int valueOfRoman(String s, int i) {
        if (s.charAt(i) == 'I') {
            return 1;
        } 
        else if (s.charAt(i) == 'V') {
            return 5;
        } 
        else if (s.charAt(i) == 'X') {   // ❗ missing earlier
            return 10;
        }
        else if (s.charAt(i) == 'L') {
            return 50;
        } 
        else if (s.charAt(i) == 'C') {
            return 100;
        } 
        else if (s.charAt(i) == 'D') {
            return 500;
        } 
        else if (s.charAt(i) == 'M') {
            return 1000;
        }
        return 0;
    }

    public int romanToDecimal(String s) {

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            int s1 = valueOfRoman(s, i);

            if (i + 1 < s.length()) {
                int s2 = valueOfRoman(s, i + 1);

                if (s1 >= s2) {
                    res += s1;
                } else {
                    res += (s2 - s1);
                    i++; // skip next character
                }
            } else {
                res += s1;
            }
        }
        return res;
    }
}
