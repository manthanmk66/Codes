#include<iostream>
using namespace std;
int main(){

int a,b;
int arr[5]={1,2,3,4,5},i;
cout<<"enter value of a and b";
cin>>a>>b;
try{
	int i=0;
	if(b!=0){
		cout<<"a/b="<<a/b<<endl;
		
	}
	else
	throw "0";
	while(0){
		cout<<arr[i];
		i++;
		if(i==5)
		throw 5;
		
		
	}
}
catch(char*x)
{
	cout<<"division by zero";
	
}
catch(int y){
	cout<<"array index out of bond";
}
}
