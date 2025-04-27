#include <iostream>
using namespace std;

int main()
{
    int t; // Number of test cases
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int ones = 0, twos = 0;
        for (int i = 0; i < n; ++i)
        {
            int weight;
            cin >> weight;
            if (weight == 1)
                ones++;
            else
                twos++;
        }

        if ((ones % 2 == 0 && twos%2==0) || (twos%2==0 && ones==0) || (ones%2==0 && twos%2==1 && ones>0))
            cout << "YES"<<endl;
        else {
            cout << "NO"<<endl;
        }
    }
    return 0;
}

