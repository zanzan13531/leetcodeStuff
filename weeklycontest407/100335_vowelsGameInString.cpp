class Solution {
public:
    bool doesAliceWin(string s) {
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.at(i) == 'a' ||
                s.at(i) == 'e' ||
                s.at(i) == 'i' ||
                s.at(i) == 'o' ||
                s.at(i) == 'u') {
                vowels++;
            }
        }
        if (vowels == 0) {
            return false;
        }
        return true;
        
    }
};