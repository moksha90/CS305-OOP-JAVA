import java.util.Scanner;
enum Fruits{

		
		Apple('a'),Banana('b'),Citrus('c'),Dragonfruit('d'),Fig('f'),Grapes('g');
		 char a;
		 
		Fruits(char a){
		this.a  = a;
		
		}
		public  char get(){
		return a;
		
		}
		
}
public class Lab6P1 {
		public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char ch = st.charAt(0);
		ch = Character.toLowerCase(ch);
		for(Fruits f: Fruits.values()){
				if(f.get() == ch)
		System.out.println(f);
		}
		}
	}	

