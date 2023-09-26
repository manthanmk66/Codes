// multilevel inheritence
#include<iostream>
using namespace std;
class Employee // abstract class cannot make object
{
	int id;
	public:
		Employee(){
			cout<<"Default of employee"<<endl;
			id=0;
		}
		Employee(int a){
			cout<<"para of employee"<<endl;
			id=a;
		}
		void display(){
			cout<<"id (int c): "<<id<<endl;
			
		}
//		 virtual int findSal(){
//		return 0;
//		}
		virtual int findSal() = 0; //pure virtual
	
};
 class Wageemployee: public Employee{
 		int hr;
 		int rate;
	public:
		Wageemployee(){
			cout<<"Defult of Wageemployee"<<endl;
			rate=0;
			hr=0;
		}
		Wageemployee(int a,int b,int c):Employee(c){
			cout<<"para of Wageemployee"<<endl;
			rate=a;
			hr=b;
			// c was assigned to a from parent class
		}
		void display(){
			Employee::display();
				cout<<"rate: "<<rate<<endl;
				cout<<"hr: "<<hr<<endl;
			
		}
			int findSal(){
			return rate*hr;
		}
//		virtual int findSal() = 0;
 };
 class SalesManger: public Wageemployee{
 		int comm;
 		int sales;
	public:
	SalesManger	(){
			cout<<"Defult of SalesManger"<<endl;
			sales=0;
			comm=0;
		}
	SalesManger	(int a,int b,int c,int d,int e):Wageemployee(a,b,c){
				cout<<"para of SalesManger"<<endl;
		sales=d;
		
		comm=e;
		}
		void display(){
		Wageemployee::display();
			cout<<"sales"<<sales<<endl;
			cout<<"comm"<<comm<<endl;
			
		}
			int findSal(){
			return 	(Wageemployee::findSal())+ sales*comm ;
		}
 };
 int main(){
 	
 Employee*ptr = new SalesManger(4,5,1,6,7);
 cout<<"Virtual obj creation on heap  "<<ptr->findSal()<<endl;
 
 }
