class Solution {
    public long countOfSubstrings(String word, int k) {
        int count = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int cons = 0;
        int start = -1;
        int end = -1;
        // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
        // cons);
        while (start < word.length() - k - 3) {
            while (a == 0 || e == 0 || i == 0 || o == 0 || u == 0 || cons < k) {
                end++;
                if (end >= word.length()) {
                    break;
                }
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
                // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
                // cons);
            }
            // at this point we have a valid string or reached the end
            if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k && end < word.length()) {
                count++;
                // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
                // cons);
                // System.out.println(start + " " + end + " 39");
            }
            int saveA = a;
            int saveE = e;
            int saveI = i;
            int saveO = o;
            int saveU = u;
            int saveCons = cons;
            int saveEnd = end;
            while (cons == k && end < word.length() - 1) {
                end++;
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
                // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
                // cons + " 64");
                if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k && end < word.length()) {
                    count++;
                    // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
                    // cons);
                    // System.out.println(start + " " + end);
                }
            }
            // at this point we've run off the end or have too many cons and need to
            // backtrack
            a = saveA;
            e = saveE;
            i = saveI;
            o = saveO;
            u = saveU;
            cons = saveCons;
            end = saveEnd;

            start++;
            char removeC = word.charAt(start);
            if (removeC == 'a') {
                a--;
            } else if (removeC == 'e') {
                e--;
            } else if (removeC == 'i') {
                i--;
            } else if (removeC == 'o') {
                o--;
            } else if (removeC == 'u') {
                u--;
            } else {
                cons--;
            }
            // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
            // cons);
            // if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && cons == k && end <
            // word.length()) {
            // count++;
            // // System.out.println(a + "a " + e + "e " + i + "i " + o + "o " + u + "u " +
            // cons);
            // System.out.println(start + " " + end + " 100");
            // }
        }
        return count;
    }
}