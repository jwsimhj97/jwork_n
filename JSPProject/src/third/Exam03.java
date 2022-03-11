package third;

interface Drawable {
	int ab = 5; //final생략됨
	public abstract void draw();
}

abstract class Shape{
	public double res = 0;
	
	public Shape() {
		System.out.println("출력");
	}

	public abstract double area();
	
	public void printArea() {
		System.out.println( "면적은 " + res );
	}
}

class Rectangle extends Shape implements Drawable {
	public int w = 10, h = 10;

	@Override
	public double area() {
		res = w * h;	//double	100.0
		return res;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Rectangle ref = null;
		ref = new Rectangle();
		ref.area();
		ref.printArea();
		ref.draw();
		System.out.println("인터페이스 ab값: "+ref.ab);  
	}
}