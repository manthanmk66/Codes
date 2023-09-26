#include<iostream>
using namespace std;

template<class M>
M swap_fun(M &x,M &y){
	M temp;
	temp=x;
	x=y;
	y=temp;
	return 0;
	
}
int main(){
	
	int a=10;
	int b=20;
	cout<<"Value of a and b bfore swap"<<a<<endl<<b;
	cout<<endl;
	swap_fun(a,b);
	cout<<"value of a and b after swap"<<a<<b;
	return 0;
}
