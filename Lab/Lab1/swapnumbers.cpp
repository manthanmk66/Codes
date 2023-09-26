#include<iostream>
using namespace std;
int main()
{
	int a,b,temp;
	cout<<"Enter the number";
	cin>>a;
	cout<<"Enter the number";
	cin>>b;
	cout<<"the values of "<<a<<" and "<<b<<" before swapping are ";
	cout<<a<<endl<<b;
	cout<<endl;
	cout<<"the values of "<<a<<" and "<<b<<" after swapping are ";
	temp=a;
	a=b;
	b=temp;
	cout<<a<<endl<<b;
}
