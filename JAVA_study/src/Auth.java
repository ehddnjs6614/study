
public class Auth {

	public static void main(String[] args) {
		
		String id = "kdw";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("hi");
		
		if(inputId.equals(id) && inputPass.equals(pass) || inputPass.equals(pass)) {
			System.out.println("Master!");
		}else {
			System.out.println("nononono");
		}

	}

}
