#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t,n;
    cin>>t;
    while(t--)
    {
        cin>>n;
        int arr[n];

        cin>>arr[0];
        int flag= false;
        for(int i=1; i<n; i++)
        {
            cin>>arr[i];
        }

        // Duplicate check
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] == arr[i])
                {
                    flag=true;
                    break;
                }
            }
        }
        if(flag==true)
            cout<<"NO"<<endl;
        else
            cout<<"Yes"<<endl;
    }
    return 0;
}

/*
    mainly amar ber korte hobe je array ta ke notun kore sajale ascending akare sort hoy ni
    but duplicate value thakte parbe na
*/
