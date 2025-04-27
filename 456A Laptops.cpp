#include<bits/stdc++.h>
using namespace std;

struct pr
{
    int price;
    int quality;
};
bool cmp(pr a, pr b)
{
    return a.price<b.price;
}
int main()
{
    int n;
    cin>>n;
    pr arr[n];
    for(int i=0; i<n; i++) // input
    {
        cin>>arr[i].price>>arr[i].quality;
    }

    sort(arr, arr+n, cmp);  // sorting

    for (int i = 0; i < n - 1; ++i) // quality compare
    {
        if (arr[i].quality> arr[i + 1].quality)
        {
            cout << "Happy Alex" << endl;
            return 0;
        }
    }
    cout << "Poor Alex" << endl;


    return 0;
}
 /*
    main target hocche 2tar moddhe jar a.price<b.price and a.quality>b.quality then a is better
    that means alex is right
    1. price diye sort kore nibio tahole prothom compare ta automatic hoye jabe
    2. then a.quality>b.quality then alex is right.

 */
