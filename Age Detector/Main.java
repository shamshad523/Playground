#include<iostream>
int main()
{
    int a,b;
    std::cin>>a>>b;
    if(a>b)
        std::cout<<(b+100)-a;
    else
        std::cout<<b-a;
}