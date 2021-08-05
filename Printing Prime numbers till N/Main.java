#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int flag;
    for(int i=2;i<=n;i++)
    {
        flag = 0 ;
        if(i%2 != 0 || i == 2)
        {
            flag=1;
            for(int j=2;j<=sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag)
            cout<<i<<" ";
    }
    return 0;
}



