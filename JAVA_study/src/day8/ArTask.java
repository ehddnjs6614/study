package day8;

public class ArTask {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("==========================");
		}
		
		for(int i = 0; i < b.length; i++) {
			b[i]= 10-i;
			System.out.println(b[i]);
			
		}
		
	}
}
