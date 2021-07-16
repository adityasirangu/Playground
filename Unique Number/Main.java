#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  int l,h;
  cin>>l>>h;
  int c=0;
  for(int i=l;i<=h;i++)
  {
    int num=i;
    int visited[10]={0};
    while(num>0)
    {
      if(visited[num%10])break;
      visited[num%10]=1;
      num=num/10;
    }
    if(num==0)c++;
  }
  if(c==0)cout<<"No Unique Number";
  else{
    cout<<c;
  }
    return 0;
}