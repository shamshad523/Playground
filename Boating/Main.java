#include<iostream>
int main()
{
    int x,y,z,a,b,c;
    std::cin>>x>>y>>z;
    a=y*75;
    b=z*30;
    c=a+b;
    if(x>c)
         std::cout<<"Boat is stable";
    else
        std::cout<<"Boat will drow";
}