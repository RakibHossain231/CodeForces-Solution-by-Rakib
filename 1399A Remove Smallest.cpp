#include<bits/stdc++.h>

using namespace std;

int main()
{
    int test;
    cin>>test;
    while(test--)
    {
        int n;
        cin>>n;
        vector<int> arr;
        for(int i=0; i<n; i++)
        {
            int value;
            cin>>value;
            arr.push_back(value);
        }

        sort(arr.begin(), arr.end());
        bool flag= true;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] - arr[i - 1] > 1)
            {
                flag=false;
                break;
            }
        }

        if(flag==true)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }

    return 0;
}

// sort korar por jodi dekhi je duitar difference 1 er boro tar mani sekhane delete kora jabe na
// R delete kora na gele ba difference 1 er boro hole break kore dibo
// delete na korte parle 1 size e ana jabe na mani flag false, flag false means output NO hobe
