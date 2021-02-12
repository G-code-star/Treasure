package sct;

public class Method {
	/*static void myMethod(String fname, int age) {
		
		System.out.println(fname+ " " +"is"+" " + age);
		
		
		
	}


	public static void main(String[] args) {
		myMethod("Harman", 34);
		myMethod("Simran", 30);
		myMethod("Kajal", 28);
		

	}*/

	static void Checkage(int age) {
		
		if (age<20) {
			System.out.println("access denied due to high age");
			
		} 
		else {
			System.out.println("access granted");
		}
	}
	
	public static void main (String[]args) {
		Checkage(22);
	}
}
