#include<bits/stdc++.h>
using namespace std;

bool compDescending(int a, int b) {
    return a > b;
}

bool compAscending(int a, int b) {
    return a < b;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, k, temp=0;
        cin>>n>>k;
        vector<int> a;
        vector<int> b;
        for(int i=0; i<n; i++)  // Input a vector
        {
            cin>>temp;
            a.push_back(temp);
        }
        for(int i=0; i<n; i++) // input b vector
        {
            cin>>temp;
            b.push_back(temp);
        }

        sort(a.begin(), a.end(), compAscending); // sort a vector
        sort(b.begin(), b.end(), compDescending); // sort b vector

        for(int i=0; i<k; i++)
        {
            if(a[i]<b[i])
            {
                temp=a[i];
                a[i]=b[i];
                b[i]=temp;
            }
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
        }

        cout<<sum<<endl;
    }
    return 0;
}

/*
    1. sort the vector in ascending order
    2. sort the vector in descending order
    3. k times porjonto swap korbo je vector a er value vector ber choto kina thaklei swap korbo
        karon amr vector a er maximum sum ber korte hobe
*/
