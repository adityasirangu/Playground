#include <iostream>
using namespace std;
int madiv(int a,int b)
{
  while(a%b==0)
  {
    a=a/b;
  }
  return a;
}
int ulgy(int n)
{
  //if(n==1)return 1;
  n=madiv(n,2);
  n=madiv(n,3);
  n=madiv(n,5);
  return (n==1)?1:0;
}
int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  int t;
  cin>>t;
  while(t--)
  {
    int n;
    cin>>n;
    int c=1;
    int i=1;
    while(c<n)
    {
      i++;
      if(ulgy(i)==1)
      {
        c++;
      }
    }
    cout<<i<<endl;
  }
  
    return 0;
}