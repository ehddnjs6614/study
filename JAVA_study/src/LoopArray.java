
public class LoopArray {

	public static void main(String[] args) {
		 //String[] users = {"d","f","a"};
		String[][] users= {
				{"d","1111"},
				{"f","2222"},
				{"a","3333"}
		};
		 String inputId =args[0];
		 String inputPass = args[1];
		
		 boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
					) {
				isLogined = true;
				break;
				
			}
			
		}	
		System.out.println("hi");
		if(isLogined) {
			System.out.println("Master");
		}else {
			System.out.println("nonononononononono");
		}
	}

}
