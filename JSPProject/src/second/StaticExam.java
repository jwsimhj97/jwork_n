package second;

public class StaticExam {

	public static void main(String[] args) {
		StaticClass sc1 = new StaticClass();
		System.out.println("sc1.getSt(): "+sc1.getSt());//3
		System.out.println("sc1.getIt(): "+sc1.getIt());//3
		System.out.println("================================\n");
		
		StaticClass sc2 = new StaticClass();
		System.out.println("sc2.getSt(): "+sc2.getSt());//6
		System.out.println("sc2.getIt(): "+sc2.getIt());//3
		System.out.println("================================\n");
		
		StaticClass sc3 = new StaticClass();
		System.out.println("sc3.getSt(): "+sc3.getSt());//9
		System.out.println("sc3.getIt(): "+sc3.getIt());//3
		System.out.println("================================\n");
		
	}

}
