class Solution {
    public List<String> stringSequence(String target) {
        String fin = "";
        ArrayList<String> thing = new ArrayList<String>();
        for (int i = 0; i < target.length(); i++) {
            char c = 'a';
            while (c != target.charAt(i)) {
                String temp = fin + c;
                c++;
                thing.add(temp);
            }
            fin = fin + c;
            thing.add(fin);
        }
        return thing;
    }
}