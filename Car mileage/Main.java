#include<iostream>
int main()
{
    int l,d;
    float m,n;
    std::cin>>m>>l>>d;
    n=m*l;
    if(n>=d)
        std::cout<<"Can reach";
    else
        std::cout<<"Cannot reach";
}