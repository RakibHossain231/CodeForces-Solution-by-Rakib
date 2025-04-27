#include<bits/stdc++.h>
using namespace std;

int main()
{
    int numberOfcitizen;
    cin>>numberOfcitizen;

    int citizensBurle[numberOfcitizen];
    int mx=0;
    for(int i=0; i<numberOfcitizen; i++)
    {
        cin>>citizensBurle[i];
        if(citizensBurle[i]>mx)
            mx= citizensBurle[i];
    }

    int spendBurle=0;
    for(int i=0; i<numberOfcitizen; i++)
    {
        spendBurle+=(mx-citizensBurle[i]);
    }

    cout<<spendBurle<<endl;
    return 0;
}
