package day5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String q = "Q. 오늘은 당신의 생일입니다.\n "
				+ "친구에게 상자를 선물로 받았습니다.\n "
				+ "이상자에는 무엇이 있을까요 ?"
				+ "1.꽃\n"
				+ "2.손수건 \n"
				+ "3.깜짝상자\n"
				+ "4.보석";
		
		String a1 = "꽃 : 당신은 거짓말을 못해서 안 합니다.";
		String a2 = "손수건 : 너무 정직한 사람입니다.";
		String a3 = "깜짝상자 : 눈 하나 깜짝안하고 거짓말을 하는 사랍입니다.";
		String a4 = "보석 : 때에 따라 가끔씩은 가끔씩 거짓말을 합니다.";
		
		Scanner sc = new Scanner(System.in);
		String choice = "";
		while(true) {
			System.out.print(q);
			choice = sc.next();
			
			if(choice.equals("q") ){
				System.out.println("종료");
				break;
			}
			
			switch (choice) {
			case "1":
				System.out.println(a1);
				break;
			case "2":
				System.out.println(a2);
				break;
			case "3":
				System.out.println(a3);
				break;
			case "4":
				System.out.println(a4);
				break;
			default:
				System.out.println("?");
				break;
			
			}
		}
		
		
//		if(choice == 1 ) {
//			System.out.println(a1);
//			
//		}else if(choice == 2) {
//			System.out.println(a2);
//			
//		}else if(choice == 3) {
//			System.out.println(a3);
//			
//		}else if(choice == 4){
//			System.out.println(a4);
//			
//		}else {
//			System.out.println("1~4까지만 선택해주세요");
//			
//		}
		
	}
}
