

class Solution {
    static void recurpermute(int idx, StringBuilder s, HashSet<String> ans) {
        if (idx == s.length()) {
            ans.add(s.toString());
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            // Skip duplicates to avoid redundant permutations
            if (i != idx && s.charAt(i) == s.charAt(idx)) {
                continue;
            }
            swap(s, idx, i);
            recurpermute(idx + 1, s, ans);
            swap(s, idx, i);
        }
    }

    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    public ArrayList<String> findPermutation(String s) {
        HashSet<String> tempAns = new HashSet<>();
        StringBuilder str = new StringBuilder(s);
        recurpermute(0, str, tempAns);

        ArrayList<String> ans = new ArrayList<>(tempAns);
        Collections.sort(ans);
        return ans;
    }
}
