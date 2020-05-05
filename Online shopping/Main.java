#include<iostream>
int main()
{
    int a,b,c,d,e,f,g,h,i,j,k,l;
    std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
    j=(a-((a*b)/100))+c;
    std::cout<<"In Flipkart Rs."<<j;
    k=(d-((d*e)/100))+f;
    std::cout<<"\nIn Snapdeal Rs."<<k;
    l=(g-((g*h)/100))+i;
    std::cout<<"\nIn Amazon Rs."<<l;
    if(j<=k && j<l)
        std::cout<<"\nHe will prefer Flipkart";
    else if(k<l)
        std::cout<<"\nHe will prefer Snapdeal";
    else
        std::cout<<"\nHe will prefer Amazon";
}