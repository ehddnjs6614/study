package day5;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		
				
		String q = "Q. 다음중 프로그램언어가 아닌것은 ?\n"
				+ "1.java\n"
				+ "2.pyyhon\n"
				+ "3.c언어\n"
				+ "4.망둥어";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int answer = 4;
		String result = "";
		
		System.out.println(q);
		choice = sc.nextInt();
		
		result = choice == answer ? "정답입니다." : 
			 + choice >= 1 && choice <=4 ? "오답입니다" : "잘못입력하셨습니다.";
		System.out.println(result);
		
	}
}
