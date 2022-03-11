package fifth;

class exception04 {
	public static void main(String[] args) {
		try  {
				method1();		
		} catch (Exception e)	{
				System.out.println("main 에서 예외 처리");
				e.printStackTrace();
		}
	}

	static void method1() throws Exception {
		throw new Exception(); // 예외를 고의로 발생시킴
	}
}
