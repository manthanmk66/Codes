#include<iostream>
using namespace std;
int main()
{
	int n,i;
	cout<<"Enter the array size=";
	cin>>n;
	int*p=new int[n];
	for(i=0;i<n;i++)
	cin>>p[i];
	for(i=0;i<n;i++)
	cout<<p[i];
	delete[] p;
}
