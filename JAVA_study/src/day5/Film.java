package day5;

import java.util.Scanner;

public class Film {
	public static void main(String[] args) {
		String q = "밥 먹으러갈래 ??\n"
				+ "1.아니\n"
				+ "2.그래\n"
				+ "3.이미먹었어\n"
				+ "4.머먹을러갈래\n";  
		Scanner sc = new Scanner(System.in);
		int choice =0;
		System.out.println(q);
		choice = sc.nextInt();
	
		
		switch (choice) {
		case 1:
			System.out.println("응");
			break;
		case 2:
			System.out.println("그래");
			break;
		case 3:
			System.out.println("오케이");
			break;
		case 4:
			System.out.println("너먹고싶은걸로?");
			break;

		default:
			System.out.println("묻는말에만 대답해줘 ?");
			
		}
		
	
	}
}
