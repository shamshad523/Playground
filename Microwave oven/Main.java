#include<iostream>
#include<iomanip>
int main()
{
    int n;
    float f;
    std::cin>>n>>f;
    if(n==2)
        std::cout<<std::fixed<<std::setprecision(2)<<f+((f*50)/100);
    else if(n==3)
        std::cout<<std::fixed<<std::setprecision(2)<<f*2;
    else if(n>3)
        std::cout<<"Number of items is more";
}