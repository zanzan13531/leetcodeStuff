class Solution
{
public:
    vector<long> fta;
    vector<long> ftb;
    long long maxEnergyBoost(vector<int> &energyDrinkA,
                             vector<int> &energyDrinkB)
    {
        fta = vector<long>(energyDrinkA.size() + 1, -1);
        ftb = vector<long>(energyDrinkA.size() + 1, -1);
        return std::max(
            energyHelper(energyDrinkA, energyDrinkB, 0, 1) + energyDrinkA[0],
            energyHelper(energyDrinkA, energyDrinkB, 1, 1) + energyDrinkB[0]);
    }

    // curDrink: 0 = a, 1 = b
    long long energyHelper(vector<int> &vA, vector<int> &vB, int curDrink,
                           int t)
    {
        if (t >= vA.size())
        {
            return 0;
        }
        if (curDrink == 0)
        { // currently A
            if (fta[t] < 0)
            {
                fta[t] = std::max(energyHelper(vA, vB, 0, t + 1) + vA[t],
                                  energyHelper(vA, vB, 1, t + 1));
            }
            return fta[t];
        }
        else
        {
            if (ftb[t] < 0)
            {
                ftb[t] = std::max(energyHelper(vA, vB, 0, t + 1),
                                  energyHelper(vA, vB, 1, t + 1) + vB[t]);
            }
            return ftb[t];
        }
    }
};