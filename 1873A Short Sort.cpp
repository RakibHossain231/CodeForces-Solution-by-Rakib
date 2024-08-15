#include<bits/stdc++.h>
using namespace std;

int main(){

    int t;
    cin>>t;
    for(int i=0; i<t; i++){

        string s;

        cin >> s;

        // Check if after sorting, the cards become "abc" or not
        if (s == "abc" || s == "acb" || s == "bac" || s == "cba") {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }

    return 0;
}
