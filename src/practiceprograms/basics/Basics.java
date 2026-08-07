package javacore;

public class Basics {
	int a = 120;
	
	void sample() {
		System.out.println("This is a test method");
	}
	void example() {
		System.out.println("This is another test method");
	}
	public static void main(String[] args) {
		int x = 10, y = 20;
		int c = x+y;
		System.out.println("THe result is: " + c);
		
//		bt.sample();
		//object
		Basics bt = new Basics();
		System.out.println("variable: " + bt.a);
		
		bt.example();
	}
}
