package p3146;

class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        int sLen = s.length();

        for (int sIndex = 0; sIndex < sLen; sIndex++) {
            int tIndex = t.indexOf(s.charAt(sIndex));
            ans += Math.abs(sIndex - tIndex);
        }

        System.out.println(ans);
        return ans;
    }
}