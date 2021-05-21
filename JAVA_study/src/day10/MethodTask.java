package day10;

public class MethodTask {
	
	
	void getSumFrom1(int end ){
		int result = 0;
		 if(end > 1) {
			 
		 
		for (int i = 0; i < end+1; i++) {
			result += i;
			}	
			System.out.println(result);
		}else {
			System.out.println("보다 큰 수를 입력하세요.");
		}
	}
	public static void main(String[] args) {
		
	}
}
