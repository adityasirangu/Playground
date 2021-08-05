#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  string str;
  cin>>str;
  int k;
  cin>>k;
  char ch;
  cin>>ch;
  int n=str.size();
  k=k%n;
  if(ch=='L')
  { int c=0;

    while(c<k)
    {
      char f=str[0];
      for(int i=1;i<str.size();i++)
      {
        str[i-1]=str[i];
      }
      str[str.size()-1]=f;
      c++;
    }
   cout<<str<<endl;
  }
  if(ch=='R')
  {
    int c=0;
    while(c<k)
    {
       char l=str[str.size()-1];
      for(int i=n-2;i>=0;i--)
      {
        str[i+1]=str[i];
      }
      str[0]=l;
      c++;
    }
    cout<<str<<endl;
  }
    return 0;
}