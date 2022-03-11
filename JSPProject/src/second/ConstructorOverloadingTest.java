package second;

public class ConstructorOverloadingTest {

	public static void main(String[] args) {
		System.out.println("생성자 오버로딩");
		
		ConstructorOverloading c1 = new ConstructorOverloading();
		//7=> 0,''
		ConstructorOverloading c2 = new ConstructorOverloading(5);
		//11=> 5,null
		ConstructorOverloading c3 = new ConstructorOverloading("초기화");
		//15=> 0,초기화
		ConstructorOverloading c4 = new ConstructorOverloading(3,"두번째초기화");
		//19=> 3,두번째초기화
		ConstructorOverloading c5 = new ConstructorOverloading("세번째초기화",9);
		//23=> 세번째초기화,9
	}

}
