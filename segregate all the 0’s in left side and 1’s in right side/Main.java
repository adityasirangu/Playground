#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
  int n;
  cin>>n;
    vector<int>v;
  for(int i=0;i<n;i++)
  { 
    int k;
    cin>>k;
    v.push_back(k);
  }
  sort(v.begin(),v.end());
  for(int x:v)
  {
    cout<<x;
  }
       return 0;
}