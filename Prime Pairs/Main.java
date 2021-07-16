#include <bits/stdc++.h>
using namespace std;
void pri(int n,int m)
{
  bool vis[m+1];
  memset(vis,true,sizeof(vis));
  for(int i=2;i<=sqrt(m);i++)
  {
    if(vis[i]==true)
    {
      for(int j=2*i;j<=m;j+=i)
      {
        vis[j]=false;
      }
    }
  }
  int c=0;
  for(int i=n;i<=m-6;i++)
  {
    if(vis[i]&&vis[i+6])c++;
  }
  if(c>0)cout<<c<<endl;
  else{
    cout<<"No Prime Pairs"<<endl;
  }
}


int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int n,m;
  cin>>n>>m;
  pri(n,m);
    return 0;
}
    