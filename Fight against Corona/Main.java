#include <bits/stdc++.h>
using namespace std;
int ans(string str)
{
  int hh,mm;
    hh=((str[0]-48)*10)+(str[1]-48);
    mm=((str[3]-48)*10)+(str[4]-48);
  int time=0;
   while(hh%10!=mm/10||hh/10!=mm%10)
   {
     ++mm;
     if(mm==60)
     {
       hh++;
       mm=0;
     }
     if(hh==24)
     {
       hh=0;
     }
     time++;
   }
  return time;
}
int main() 
{
   // Try out your code here
   //cout << "Hello, World!";
  string str;
  cin>>str;
  int k=ans(str);
  cout<<k<<endl;
    return 0;
}