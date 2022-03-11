package third;

class Op{
	// 과목당 점수를 받을 멤버 속성(배열) => 점수는 숫자자료형으로
//	int[] iArr;
	private double[] iArr;
	private double tot=0.0;

	public double getAvg() {
		//평균값 구하기
		//전체 과목점수를 모두 더한 값 / 과목수
//		tot=tot+과목당 점수들; => tot+=과목당 점수들
		for(double d:iArr) {
			tot += d;
		}
		
		
		return tot/iArr.length;	//평균값 보내기
//		return iArr;
	}

	public void setiArr(double[] iArr) {
		this.iArr = iArr;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Op op=new Op();
		double[] iArr= {90.0, 85.5, 70.0};
		op.setiArr(iArr);
		System.out.println("평균은:"+op.getAvg());

	}

}
