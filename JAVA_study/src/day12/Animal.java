package day12;
//강아지, 고양이, 돼지
//생성자를 사용해서 초기화 하기


public class Animal {
	
	String name;
	int age;
	double weight;
	String feed;
	String sound;
	
	
	//오버로딩
	public Animal() {
		
	}
	
	//생성자
	public Animal(String name, int age, double weight, String feed ,String sound) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feed = feed;
		this.sound = sound;
	}
	
	void getSounds(){
		System.out.println(sound + "이라고 소리친다");
	}
	void eat(){
		System.out.println(name + "이(가)" + feed + "을 먹으면서" );	
	}
	void sleep() {
		System.out.println(name + "이(가) 자는데.." );
	}
	void weight() {
		System.out.println(weight + "가쪗다...");
	}
	void age() {
		System.out.println("그의 나이는,,," + age +"살이다....헐");
	}
	public static void main(String[] args) {
		Animal cat = new Animal("고양이",3,12.1,"츄르","냐옹");
		Animal dog = new Animal("강아지",5,8.2,"샤료","멍멍");
		Animal pig = new Animal("돼지",4,35.2,"음식","컹스컹스");
		
		cat.eat();
		cat.getSounds();
		cat.sleep();
		cat.weight();
		cat.age();
		System.out.println("--------------------------");
		
		pig.eat();
		pig.getSounds();
		pig.sleep();
		pig.weight();
		pig.age();
		System.out.println("--------------------------");
		
		dog.eat();
		dog.getSounds();
		dog.sleep();
		dog.weight();
		dog.age();
	
		
	}
	
}

