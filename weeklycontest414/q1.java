class Solution {
    public String convertDateToBinary(String date) {
        String[] dates = date.split("-");
        String result = Integer.toBinaryString(Integer.parseInt(dates[0])) + "-" +
                Integer.toBinaryString(Integer.parseInt(dates[1])) + "-" +
                Integer.toBinaryString(Integer.parseInt(dates[2]));
        return result;
    }
}