package day5;

import java.util.Scanner;

public class Calc2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		
			int num1 , num2 = 0;
			String oper="";
			String mMsg = "1.계산하기\n"
					+ "2.나가기";
			int choice = 0;
			String result = "";
			
			while(true) {
				System.out.println(mMsg);
				choice = sc.nextInt();
				if(choice ==2)break;
				if(choice !=1) continue;
				
				 num1 = Integer.parseInt(sc.next());
				 oper = sc.next();
				 num2 = Integer.parseInt(sc.next());
				 
				 switch (oper) {
				case "+":
					result = ""+(num1+num2);
					break;
				case "-":
					result = ""+(num1-num2);
					break;
				case "*":
					result = ""+(num1*num2);
					break;
				case "/":
				if(num2 !=0) {
					result = "" +(num1/num2);
				}else {
					result = "0으로 나눌 수 없습니다.";
				}
					break;

				default:
					result = "사칙연산외의 연산자 사용ㅎ하지마";
				
				}
				 System.err.println(result);
			}
					
			
			
		}
}
