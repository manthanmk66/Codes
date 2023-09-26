#include<iostream>
using namespace std;

void swap(int&,int&);
int main(){
	int a,b;
	cout<<"enter value of a and b\n";
	cin>>a>>b;
	cout<<"before swappping value of a and b is"<<a<<endl<<b<<endl;
	swap(a,b);
	cout<<"after swapping value of a and b is"<<a<<b<<endl;
	
	
}
void swap(int &p,int &q)
{
	int temp=p;
	p=q;
	q=temp;
	//cout<<"after swapping value of a and b is"<<p<<q<<endl;
}
