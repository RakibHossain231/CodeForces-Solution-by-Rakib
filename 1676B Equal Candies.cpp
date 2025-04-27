#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        int mn= INT_MAX, total=0;

        for(int i=0; i<n; i++)
        {
            cin>>arr[i];
            if(arr[i]<mn)
                mn=arr[i];
        }

        for(int i=0; i<n; i++)
        {
            total+=arr[i]-mn;
        }
        cout<<total<<endl;
    }
    return 0;
}

/*
    i. mainly find out korte hobe je sobar theke koyta kore candies nile sobai number of equal candies pabe
        and total koyta candies nite hobe sobar theke
    ii. find the minimum of the array
    iii. total += arr[i]- minimum of the array
    NB: arr[i] individual candy
*/
