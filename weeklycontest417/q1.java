class Solution {
    public char kthCharacter(int k) {

        String a = "abbcbccdbccdcddebccdcddecddedeefbccdcddecddedeefcddedeefdeefeffgbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghcddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhibccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghcddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhicddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhideefeffgeffgfggheffgfgghfgghghhieffgfgghfgghghhifgghghhighhihiij";
        return (a.charAt(k - 1));

        // preproccessing
        // String a = "a";
        // while (a.length() < 500) {
        // String b = "";
        // for (int i = 0; i < a.length(); i++) {
        // if (a.charAt(i) == 'z') {
        // b += "a";
        // } else {
        // b += Character.toString(a.charAt(i) + 1);
        // }
        // }
        // a += b;
        // }

        // System.out.println(a);
        // return 'a';
    }
}