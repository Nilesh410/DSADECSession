#include<iostream>
using namespace std;
int main()
{
    double a=10;
    cout<<a<<endl;
    cout<<&a<<endl;
    double *ptr=&a;
    cout<<ptr<<endl;
    cout<<*ptr;
}