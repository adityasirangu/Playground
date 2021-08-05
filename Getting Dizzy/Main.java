#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World";
  int n;
  cin>>n;
  vector<vector<int>>v(n,vector<int>(n));
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      int k;
      cin>>k;
      v[i][j]=k;
    }
  }
  int round=ceil((double)n/2);
  for(int i=0;i<=round;i++)
  {
   for(int j=i;j<=n-i-1;j++)
   {
     cout<<v[i][j]<<" ";
   }
    for(int j=i+1;j<=n-i-1;j++)
    {
      cout<<v[j][n-i-1]<<" ";
    }
    for(int j=n-i-2;j>=i;j--)
    {
      cout<<v[n-i-1][j]<<" ";
    }
    for(int j=n-i-2;j>i;j--)
    {
      cout<<v[j][i]<<" ";
    }
  }
    return 0;
}