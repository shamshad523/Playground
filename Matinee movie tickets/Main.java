#include<iostream>
#include<iomanip>
int main()
{
    int a;
    float t;
    std::cin>>a>>t;
    if(a>13)
        {
        if(t>10.15)
            std::cout<<"$5.00";
        else
            std::cout<<"$8.00";
        }
    else
        {
        if(t>10.15)
            std::cout<<"$2.00";
        else
            std::cout<<"$4.00";
        }
}