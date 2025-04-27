#include <iostream>
#include <vector>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) // number of test case
    {
        int n;
        cin >> n; // individual array size

        vector<int> a(n); // array input
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }

        int odd_in_even_index = 0, even_in_odd_index = 0;

        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)  // Even index
            {
                if (a[i] % 2 != 0) // Odd value at even index
                {
                    odd_in_even_index++;
                }
            }
            else // Odd index
            {
                if (a[i] % 2 == 0)  // Even value at odd index
                {
                    even_in_odd_index++;
                }
            }
        }

        // If the mismatches are not equal, it's impossible to make the array good
        if (odd_in_even_index != even_in_odd_index) {
            cout << -1 << endl;
        } else {
            cout << odd_in_even_index << endl; // or even_in_odd_index, they are equal
        }
    }

    return 0;
}

