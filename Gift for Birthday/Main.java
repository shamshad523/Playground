#include<iostream>
int main()
{
 int x;
  std::cin>>x;
  if(x%400==0)
    std::cout<<x<<" is a leap year";
  else if(x%4==0)
    std::cout<<x<<" is a leap year";
  else if(x%100==0)
    std::cout<<x<<" Is not a leap year";
  else
    std::cout<<x<<" is not a leap year";
}