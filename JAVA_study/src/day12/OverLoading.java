package day12;

public class OverLoading {
	
	void add(int num1, int num2) {
		System.out.println("두정수의 합");
		System.out.println(num1+ num2);
	}
	void add(int num1, int num2 , int num3) {
		System.out.println("세정수의 합");
		System.out.println(num1+ num2 + num3);
	}
	
	
	void add(double num1, double num2) {
		System.out.println("두정수의 합");
		System.out.println(num1+ num2);
	}
	
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.add(10, 20 );
		o.add(20.5, 40.5);
		o.add(1, 2, 3);
		     
	}
	
}
