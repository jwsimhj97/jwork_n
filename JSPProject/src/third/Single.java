package third;

class SingleTon{
	private static SingleTon st=new SingleTon();
	
	private SingleTon() {}
	
	public static SingleTon getSt() {
		if(st==null)st=new SingleTon();
		return st;
	}
	
	public void getMess() {
		System.out.println("메소드 호출");
	}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon s=SingleTon.getSt();
//		s.getMess();
		System.out.println(s);
	}

}
