#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  int t;
  cin>>t;
  while(t--)
  {
    long int n,p;
    cin>>n>>p;
    if(p>n)
    {
      cout<<0<<endl;
    }
    else
    {
      int s=0;
      int r=1;
      while(r<n)
      {
        r=r*p;
        s=s+(n/r);
      }
      cout<<s<<endl;
    }
    
    
  }
    return 0;
}