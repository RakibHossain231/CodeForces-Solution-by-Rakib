#include<bits/stdc++.h>
using namespace std;

int main()
{
    int test;
    cin>> test;
    while(test--)
    {
        int ln;
        cin>>ln;

        string s;
        cin>>s;

        set<char> distinctCharacter;
        for(int i=0; i<ln; i++)
        {
            distinctCharacter.insert(s[i]);
        }

        int totalBallon= distinctCharacter.size() + ln;
        cout<<totalBallon<<endl;
    }
    return 0;
}


/*
    same problem je age solve korbe tar double ballon, and same problem er bakigula jei solve koruk single balloon
    so, number of distinct balloon er jnno double balloon for rest problem is single balloon.

    i. find the number of total distinct problem, and rest will be common problem
    ii. so total balloon is (distinct *2 *(total problem - distinct ))
    iii. Also length of the string is total problem
*/
