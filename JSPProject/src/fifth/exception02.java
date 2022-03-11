package fifth;

class exception02 {
	public static void main(String args[]) {
		try {
			String c = null;
			System.out.println(" 문자열 값은 :  " + c.toString());
		} catch (NullPointerException e) {//값이 null일때 사용
			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}
}
