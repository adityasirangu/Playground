#include <bits/stdc++.h>
using namespace std;
bool cmp(pair<char,int>a,pair<char,int>b)
{ 
  if(b.second==a.second)
  {
    return a.first>b.first;
  }
  return a.second<b.second;
}
int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int t;
  cin>>t;
  while(t--)
  {
    string s;
    cin>>s;
    int f[26]={0};
    for(int i=0;i<s.size();i++)
    {
      f[s[i]-'a']++;
    }
    vector<pair<char,int>>v;
    for(int i=0;i<26;i++)
    {
      v.push_back({i+'a',f[i]});
    }
   sort(v.begin(),v.end(),cmp);
    for(int i=0;i<26;i++)
    {
      cout<<v[i].first<<" ";
 
    }
    cout<<endl;
  }
    return 0;
}