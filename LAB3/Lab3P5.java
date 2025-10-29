import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=s.nextInt();
		System.out.println("Enter the String:");
		String b=s.nextLine();
		Lab3P5 ip1=new Lab3P5();
		Lab3P5 ip2=new Lab3P5(a);
		Lab3P5 ip3=new Lab3P5(a,b);
		Lab3P5 ip4=new Lab3P5(b);
		}
	Lab3P5(){
		System.out.println("MOL without parameters..");
		}
	Lab3P5(int x){
	System.out.println("mol with 1 parameter.."+x);
		}
	Lab3P5(int x,String y){
	System.out.println("MOL with 2 parameters x is" +x+ "y is " +y);
		}
	Lab3P5(String s){
		System.out.println(s);
		}
}	
