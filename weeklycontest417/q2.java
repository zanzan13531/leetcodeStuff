class Solution {
    public int countOfSubstrings(String word, int k) {
        int count = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int cons = 0;
        // int start = -1;
        // int end = 0;
        for (int start = 0; start < word.length() - 3; start++) {
            a = 0;
            e = 0;
            i = 0;
            o = 0;
            u = 0;
            cons = 0;
            for (int end = start; end < word.length(); end++) {
                char c = word.charAt(end);
                if (c == 'a') {
                    a++;
                } else if (c == 'e') {
                    e++;
                } else if (c == 'i') {
                    i++;
                } else if (c == 'o') {
                    o++;
                } else if (c == 'u') {
                    u++;
                } else {
                    cons++;
                }
                if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k) {
                    count++;
                }
            }
        }
        return count;
        // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
        // cons);
        // while (end < word.length()) { // main loop (double pointer)
        // char c = word.charAt(end);
        // if (c == 'a') {
        // a++;
        // } else if (c == 'e') {
        // e++;
        // } else if (c == 'i') {
        // i++;
        // } else if (c == 'o') {
        // o++;
        // } else if (c == 'u') {
        // u++;
        // } else {
        // cons++;
        // }
        // if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k) {
        // count++;
        // }
        // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
        // cons);
        // if (cons > k || a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k) {
        // start++;
        // char removeC = word.charAt(start);
        // if (removeC == 'a') {
        // a--;
        // } else if (removeC == 'e') {
        // e--;
        // } else if (removeC == 'i') {
        // i--;
        // } else if (removeC == 'o') {
        // o--;
        // } else if (removeC == 'u') {
        // u--;
        // } else {
        // cons--;
        // }
        // if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k) {
        // count++;
        // }
        // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
        // cons);
        // }
        // end++;
        // }

        // while (start < word.length() - 3) { // finish up left pointer
        // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
        // cons);
        // start++;
        // char removeC = word.charAt(start);
        // if (removeC == 'a') {
        // a--;
        // } else if (removeC == 'e') {
        // e--;
        // } else if (removeC == 'i') {
        // i--;
        // } else if (removeC == 'o') {
        // o--;
        // } else if (removeC == 'u') {
        // u--;
        // } else {
        // cons--;
        // }
        // if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k) {
        // count++;
        // }

        // }

        // return count;

    }
}