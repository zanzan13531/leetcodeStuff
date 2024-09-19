class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> combos = new ArrayList<String>();
        genP(combos, "", n, 0);
        return combos;
    }

    public void genP(List<String> strings, String curstring, int n, int open) {
        // strings has all valid string pairs, curstring has current dfs search string
        // n has number of open parenthesis left over
        // open keeps track of current number of open parenthesis
        if (n == 0) {
            for (int i = 0; i < open; i++) {
                curstring += ")";
            }
            strings.add(curstring);
        } else {
            genP(strings, curstring + "(", n - 1, open + 1);
            if (open > 0) {
                genP(strings, curstring + ")", n, open - 1);
            }
        }
    }
}