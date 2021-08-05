#include <iostream>
using namespace std;
bool isprime(long long n)
{
  if(n<=1)return 0;
  if(n==2)return 1;
  for(long long i=2;i*i<=n;i++)
  {
    if(n%i==0)return 0;
  }
  return 1;
}
int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int t;
  cin>>t;
  while(t--)
  {
    long long n;
    cin>>n;
    long long i,j;
    for(i=n,j=n;;i--,j++)
    {
      if(i>=0&&isprime(i))
      {
        cout<<i<<endl;
        break;
      }
      if(isprime(j))
      {
        cout<<j<<endl;
        break;
      }
    }
  }
  
    return 0;
}