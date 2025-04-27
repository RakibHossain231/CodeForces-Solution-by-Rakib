#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int height = 0;
    int cubes_used = 0;
    int level = 1;

    while (1)
    {
        int cubes_needed = level * (level + 1) / 2;
        if (cubes_used + cubes_needed > n)
        {
            break;
        }
        cubes_used += cubes_needed;
        height++;
        level++;
    }

    cout << height << endl;
    return 0;
}
