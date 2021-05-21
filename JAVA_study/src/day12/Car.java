package day12;

public class Car {
	
	int price;
	String color;
	String brand;
	
	//Overloading
	Car(){}
	
	public Car(int price, String color, String brand) {
		
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	
	double speedUp(double speed){
		speed++;
		return speed;
		
	}
	double speedDown(double speed){
		speed++;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드 : " + brand +"\n색상 : " + color + "\n가격 : " + price + "만원");
	}
	public static void main(String[] args) {
		//객체화
		//인스턴스 변수 
		//클래스명(): 기본 생성자
		//클래스를 선언하면 자동으로 선언되는 생성자                                 
		 Car mom = new Car(8000,"Black","Benz");
		 mom.showInfo();
		 Car dady = new Car();
		 Car my = new Car();
//		 
//		mom.brand ="Benz";
//		mom.color ="Black";
//		mom.price =9000;
//		
//		mom.showInfo();
//		System.out.println(mom);
//		
//		dady.brand = "gd";
//		dady.color = "red";
//		dady.price = 8444;
//		
//		dady.showInfo();
//		System.out.println(dady);
//	
		
	}
	
}
