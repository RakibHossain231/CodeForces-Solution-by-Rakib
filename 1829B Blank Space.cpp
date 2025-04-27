#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, max_Zero=0;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];

        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)  // if ekta zero pay then farther check dibe
            {
                int cons_Zero=1; // jehetu ekta zero niye dukche
                for(int j=i+1; j<n; j++)
                {
                    if(arr[j]==0)
                        cons_Zero++;
                    else
                    {
                        i=j; // 1 pawa means main er por theke abr consecutively check dibo
                        break;
                    }
                }
                if(max_Zero<cons_Zero)
                    max_Zero=cons_Zero;
            }
        }
        cout<<max_Zero<<endl;
    }


    return 0;
}

/*
    ber korte hobe je maximum koyta zero ache consecutively

*/
