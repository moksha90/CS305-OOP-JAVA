import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
	Lab3P4 ip=new Lab3P4();
	ip.display();
	ip.display(10);
	ip.display(20,30);	
		}
	void display(){
		System.out.println("MOL without parameters..");
		}
	void display(int x){
	System.out.println("mol with 1 parameter.."+x);
		}
	void display(int x,int y){
	System.out.println("MOL with 2 parameters x+y is"+(x+y));
		}
}						
