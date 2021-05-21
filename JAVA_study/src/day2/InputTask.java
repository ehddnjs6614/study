package day2;

import java.util.Scanner;

public class InputTask {
	
	public static void main(String[] args) {
		
		int num1,num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 값을 입력하시오 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("두개의 더 한 값 : " +(num1+num2));
		
		
	}
}
