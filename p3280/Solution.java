package p3280;

class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder ans = new StringBuilder();
        String year = Integer
                .toBinaryString(Integer.parseInt(date.substring(0, 4)));
        String month = Integer
                .toBinaryString(Integer.parseInt(date.substring(5, 7)));
        String day = Integer
                .toBinaryString(Integer.parseInt(date.substring(8, 10)));
        return ans.append(year).append("-").append(month).append("-")
                .append(day).toString();
    }
}