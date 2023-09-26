#include<iostream>
using namespace std;
int main()
{
	int num,i,result;
	cout<<"Enter the value"<<endl;
	cin>>num; 
	for(i=1;i<=num;i++)
	{
		result=result*i;
		
	}
	cout<<"The factorial is "<<result;
}
