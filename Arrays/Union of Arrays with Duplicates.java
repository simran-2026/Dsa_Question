class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
         Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> union = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < a.length && p2 < b.length) {
            if (a[p1] < b[p2]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[p1]) {
                    union.add(a[p1]);
                }
                p1++;
            } else if (a[p1] > b[p2]) {
                if (union.size() == 0 || union.get(union.size() - 1) != b[p2]) {
                    union.add(b[p2]);
                }
                p2++;
            } else {
                // a[p1] == b[p2]
                if (union.size() == 0 || union.get(union.size() - 1) != a[p1]) {
                    union.add(a[p1]);
                }
                p1++;
                p2++;
            }
        }

        // Remaining elements in a[]
        while (p1 < a.length) {
            if (union.get(union.size() - 1) != a[p1]) {
                union.add(a[p1]);
            }
            p1++;
        }

        // Remaining elements in b[]
        while (p2 < b.length) {
            if (union.get(union.size() - 1) != b[p2]) {
                union.add(b[p2]);
            }
            p2++;
        }

        return union.size();
    }
}
