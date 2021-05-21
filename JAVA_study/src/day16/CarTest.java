package day16;

public class CarTest {
	public static void main(String[] args) {
		
		SuperCar superCar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrari" ,"red", 45000,"sport");
		System.out.println(ferrari);
		ferrari.engineStart();
		ferrari.engineStop();
		
		
	}
}
