#include<iostream>
#include<math.h>
using namespace std;


int main()
{
	float p,r,t,ci;
	cout<<"Enter Principle,Rate of Interest,Time";
	cin>>p>>r>>t;
	ci=p*pow((1+r/100),t)-p;
	cout<<"Compound interest ="<<ci;
	return 0;
		
}
