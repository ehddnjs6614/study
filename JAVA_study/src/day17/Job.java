package day17;

import java.util.Random;

class Person{
	String name;
	int age;
	String gender;
	int money;
	

	public Person() {}
	
	public Person(String name, int age, String gender ,int money) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}
	   
	
}

	class Teacher extends Person{
		String subject;
		String position;
		int cnt = 0;
		
		private int income =  10_000_000;
		 
		public Teacher(String name, int age, String gender ,int money,  String position) {
			super(name,age,gender,money);
			
			this.position = position;
		}
		void teach(String subject) {
			cnt ++;
			if(cnt % 10 == 0) income *= 1.1;
			this.subject = subject;
			money += income;
			System.out.println(name +" "+ this.position+ "가" + this.subject + "을 강의중");
			System.out.println("통장 장고 : " + money + "원");
		}
		 
		
	} 


public class Job {

	public static void main(String[] args) {
		Teacher 한동석 = new Teacher("한동석", 21, "남자", 1, "강사");
		String[] arSub= {"java", "spring","c언어"};
		Random r = new Random();
		
		int index = 0;
		index = r.nextInt(3);
		for (int i = 0; i < 10; i++) {
			한동석.teach(arSub[index]);	
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {}
		}
	
	}
}
