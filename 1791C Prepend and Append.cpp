#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t, n;
    cin>>t;
    while(t--)
    {
        cin>>n;
        char arr[n];
        for(int i=0; i<n; i++)
        {
            cin>>arr[i];
        }
        int count=0;
        for(int i=0; i<n/2; i++) // maximum array er ordhek collei result pabo
        {
            if((arr[i]=='0' && arr[n-1-i]=='1') || ((arr[i]=='1' && arr[n-1-i]=='0')))
            {
                count++;
            }
            else
                break;
        }
        int remain_Length=n-2*count;
        cout<<remain_Length<<endl;
    }
    return 0;
}

/*
    main kotha hocche dui pash thekei komale actual length koto thake?
    i. first and last theke jokhon komabo tar count rakhbo
    ii. jehetu dui pash thekei komacchi tai komanor lentgh hobe count er double
    iii. so, remaining length pabo n-count*2 korle
*/
