package day8;

import java.util.Scanner;

public class arShop {
	//매출액 구하기
	//나이키 
	//강남,광명,금천
	//단위는 100만원 단위로 , 평균 매출은 만원단위까지 소수점 2째자리까지.
	public static void main(String[] args) {
		
		//int v[] = {100,200,300};
		int v[] = new int[3];
		int cnt = 0;
		String n[] = {"강남지점","광명지점","금천지점"};
		Scanner sc = new Scanner(System.in);
		int sum =0;
		double avg = 0.0;
		String best ="없음";
		for (int i = 0; i < v.length; i++) {
			System.out.println(n[i]+"매출액 입력(단위 백만원) :");
			v[i]= sc.nextInt();
			sum += v[i];
			
		}
		System.out.println("총 매출액 : " +sum+"만원");
		avg = Double.parseDouble(String.format("%.2f", (double)sum / v.length));
		System.out.println("평균 매출액 : "  + avg + "백만원");
		
		for (int i = 0; i < v.length; i++) {
			if(v[i] > avg) {
				
				cnt ++;
				
				if(cnt == 1)best ="";
				
				best += n[i] + "\n";
				
			}
			
		}
		System.out.println("인센티브 매장\n"+best);
		
	}
}
