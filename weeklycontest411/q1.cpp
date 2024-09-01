class Solution
{
public:
    int countKConstraintSubstrings(string s, int k)
    {
        int l = s.length();
        int totalSubStrings = 0;
        for (int i = 0; i < l; i++)
        {
            int endIndex = l;
            int zeros = 0;
            int ones = 0;
            for (int z = i; z < l; z++)
            {
                if (s.at(z) == '0')
                {
                    zeros++;
                }
                else
                {
                    ones++;
                }
            }
            while (zeros > k && ones > k)
            {
                endIndex--;
                char c = s.at(endIndex);
                if (c == '0')
                {
                    zeros--;
                }
                else
                {
                    ones--;
                }
            }
            totalSubStrings += endIndex - i;

            /*
            for (int j = l; j > i; j-- ) {
                string t = s.substr(i, j - i);
                int zeros = 0;
                int ones = 1;
                for (int z = 0; z < t.length(); z++) {
                    if (t.at(z) == '0') {
                        zeros++;
                    } else {
                        ones++;
                    }
                }
            }
            */
        }
        return totalSubStrings;
    }
};