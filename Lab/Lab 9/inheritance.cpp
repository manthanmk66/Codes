#include<iostream>
using namespace std;

class A{
	
	int local;
	
	public:
	A(){
		cout<<"In default constructor of class A. "<<endl;
		local=0;
	}
	A(int a){
		cout<<"Parameterized constructor of class A. "<<endl;
		local = a;
	
	}
	friend void display();
	
};
void display(){
	
		A obj;

		cout<<"Value of a: "<<obj.local<<endl;
	
}


class B{
	
	
	public:
	int value;
		
	B(){
		cout<<"In default constructor of class B"<<endl;
		value=0;
	}
	
	B(int b){
		value=b;
		cout<<"Parameterized constructor of class B "<<endl;
		
	}
	friend void show();

};

void show(){
	B bobj;
	cout<<"Value of B: "<<bobj.value<<endl;
}



class C: public A,B{
	int Cvalue;
	public:
		
	C(){
		cout<<"In default constructor of class C"<<endl;
	}

	C(int a,int b,int c):A(a),B(b){
		value=c;
		cout<<"Parameterized constructor of class C "<<endl;
		
	}
	friend void cShow();
	
	
	
};
void cShow(){
			C cobj;
			cout<<"Value of C: "<<cobj.Cvalue<<endl;

	
}
int main(){
	
	C bobj(20,04,01);  
	display();
	show();
	cShow();

	
	return 0;
}
