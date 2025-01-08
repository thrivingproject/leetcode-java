package p2798;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        int hoursLen = hours.length;

        for (int i = 0; i < hoursLen; i++) {
            if (hours[i] >= target)
                ans++;
        }

        return ans;
    }
}