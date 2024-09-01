class Solution
{
public:
    int countPairs(vector<int> &nums)
    {
        int c = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = i + 1; j < nums.size(); j++)
            {
                if (almostEqual(nums[i], nums[j]))
                {
                    c++;
                }
            }
        }
        return c;
    }

    bool almostEqual(int n1, int n2)
    {
        if (n1 == n2)
        {
            return true;
        }
        int small = 0;
        int big = 0;
        if (n1 < n2)
        {
            small = n1;
            big = n2;
        }
        else
        {
            small = n2;
            big = n1;
        }
        // cout << big << " " << small;
        string bigs = to_string(big);
        int biglen = to_string(big).length();
        // cout << biglen;
        for (int i = 0; i < biglen - 1; i++)
        {
            for (int j = i + 1; j < biglen; j++)
            {
                // string swapped = bigs.at(j) + bigs.at(i);
                // if (i - j + 1 > 0) {

                // }
                string swapped = bigs.substr(i, i - j + 1) + bigs.at(j) + bigs.at(i);
                // cout << swapped << " " << bigs << endl;
                // cout << i << " " << j << " " << i - j + 1 << endl;
                // cout << bigs.substr(i, i - j + 1) << " a " << bigs.at(j) << " " << bigs.at(i);
                if (j < biglen - 1)
                {
                    swapped = swapped + bigs.substr(j + 1, biglen - j + 1);
                }
                // if (swapped.at(0) == ' ') {
                //     swapped = swapped.substr(1, swapped.length() - 2);
                // }
                if (stol(swapped) == small)
                {
                    return true;
                }
            }
        }
        return false;
    }
};