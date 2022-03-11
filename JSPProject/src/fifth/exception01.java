package fifth;

class exception01 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {//사칙연산기호 사용시에 ArithmeticException사용
			System.out.println(ae);
			System.out.println(5);
		}
	}
}
