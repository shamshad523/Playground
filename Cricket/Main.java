#include<iostream>
#include<iomanip>
int main()
{
  int a,b,c,d;
  float m,n,o,p,q,r;
  std::cin>>a>>b>>c>>d;
  m=a/6;
  n=(d/6)+((d%6)*0.1);
  o=d%6;
  q=c/n;
  p=b/m;
  std::cout<<m<<"\n";
  std::cout<<n<<"\n";
  std::cout<< std::fixed << std::setprecision(1)<<q;
  std::cout<<"\n"<<p;
  if(q>p)
      std::cout<<"\nEligible to Win";
  else
      std::cout<<"\nNot Eligible to Win";
}