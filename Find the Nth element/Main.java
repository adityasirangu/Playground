#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int n;
  cin>>n;
  vector<int>v;
  for(int i=0;i<n;i++)
  {
    int k;
    cin>>k;
    v.push_back(k);
  }
  int ind;
  cin>>ind;
  if(ind>v.size()-1)
  {
    cout<<"No node found"<<endl;
  }
  else{
    cout<<v[ind-1]<<endl;
  }
  
    return 0;
}