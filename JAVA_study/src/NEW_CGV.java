import javax.swing.JOptionPane;

public class NEW_CGV {
	
	String ageMsg = "[청소년 구매 불가 상품]\n 나이를 입력하세요 \n";
	int age;
	boolean t_check;
	
	boolean bookTicket(){
		
		boolean cCheck = false;
		
		String films = "1.라이온킹(08:00)\n 2.스파이더맨(12:00)\n 3.[청소년 불가]사일런스(23:00)\n 4.뒤로가기\n)";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(films));
		if(choice ==1) {
		
			JOptionPane.showMessageDialog(null, "라이언킹 예메완료");
			
		}else if(choice == 2) {
			JOptionPane.showMessageDialog(null, "스파이더맨 예매완료");
			
		}else if(choice == 3) {
			age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
			if(age > 19) {
				JOptionPane.showMessageDialog(null, "사일런스 예메완료");
					
			}else {
				t_check = false;
				JOptionPane.showMessageDialog(null, "다시 시도해주세요");
			}
			JOptionPane.showMessageDialog(null, "사일런스 예메완료");
			
		}else {
			JOptionPane.showMessageDialog(null, "메인 메뉴로 이동");
			cCheck = true;
		}
		return cCheck;
	}
	
	public static void main(String[] args) {

		String helloMsg = "소중한 순간을 담은 당신만의 티켓 , 지금 예티켓하세요 !\n ";
		String menuMsg = "1.예매하기\n 2.구매하기\n 3.포인트조회\n 4.나가기\n";
		String mm = "1.콜라\n 2.팝콘\n 3.Beer\n 4.뒤로가기\n";
		int choice = 0;
		int money = 100000000;
		int point = 0;
		int t_price = 10000; //영화 금액
		int m_price = 50000; //메뉴
		NEW_CGV c = new NEW_CGV();
		
		  
		
		while (true) {
			c.t_check = true;
		choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
		if(choice == 4) break;
		if(!(choice >= 1 && choice <=3 )) continue;

		
		switch (choice) {
		//예매하기 영역
		case 1:
			if(money - t_price < 0 ) {
				JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				continue;
			}
			if(c.bookTicket()) continue;
			//변수의 재사용 
		
		if(c.t_check) {
			if(point > 0) {
				if(point - t_price >= 0) {
					point -= t_price;
				}else {
					money -= (t_price - point);
					point = 0;
				}
			}else {
				money -= t_price;
				point += (int)t_price * 0.5;
				
			}
			JOptionPane.showMessageDialog(null, "현재 잔액 :"+money+"원");
		}
			break;
			//구매하기영역
		case 2:
			if(money - m_price < 0 ) {
				JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				continue;
			}
			choice = Integer.parseInt(JOptionPane.showInputDialog(mm));
			if(choice ==1) {
				JOptionPane.showMessageDialog(null, "콜라주문완료");
			}else if(choice == 2) {
				JOptionPane.showMessageDialog(null, "팝콘주문완료");
				
			}else if(choice == 3) {
				JOptionPane.showMessageDialog(null, "beer주문완료");
			}else {
				money -= m_price;
				point += (int)m_price * 0.1;
				
			}
			if(c.t_check) {
				if(point > 0) {
					if(point - m_price >= 0) {
						point -= m_price;
					}else {
						money -= (m_price - point);
						point = 0;
					}
				}else {
					money -= m_price;
					point += (int)m_price * 0.1;
					
				}
				JOptionPane.showMessageDialog(null, "현재 잔액 :"+money+"원");
			}
			
			break;
			//포인트조회
		case 3:
			JOptionPane.showMessageDialog(null, " 잔여포인트 :"+point+"점");
			break;
		
			
		}

	}
	
	}
}
