package p2769;

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // what max ans will equal num when both ans and num are incremented or
        // decremented t times?
        return num + 2 * t;
    }
}