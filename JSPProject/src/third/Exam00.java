package third;

class Parent {
	private int a = 10;	//같은클래스or 상속
	public int b = 20;
}

class Child extends Parent {
	public int c = 30;
	
	void display() {
//		System.out.println(a);	//private 다른클래스라 a값 받지못함
		System.out.println(b);	//20
		System.out.println(c);	//30
	}
}

public class Exam00 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();// 20,30
	}
}