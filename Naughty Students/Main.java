#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int n;
  cin>>n;
  map<string,int>m;
  vector<string>v;
  for(int i=0;i<n;i++)
  {
    string str;
    cin>>str;
    v.push_back(str);
  }
  for(int i=0;i<n;i++)
  {
    m[v[i]]++;
  }
  for(auto x:m)
  {
    cout<<x.first<<" "<<x.second<<endl;
  }
    return 0;
}