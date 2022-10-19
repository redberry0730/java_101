package kakao.itstudy.data;

public class TypeCasting {

	public static void main(String[] args) {
		//강제 형 변환
		int number = (int)30.7; //정수 변수가 실수 데이터를 가리키도록
		//하고자 하면 실수 데이터를 정수로 변한시켜야 합니다.
		//실수를 정수로 변환하면 소수는 사라집니다.
		System.out.println("number:" + number);
		
		//short 는 -32768 ~ + 32767까지 저장 가능합니다.
		short s = 32767;
		System.out.println("s:" + s);
		s = (short)32768;//강제로 변환해서 삽입 - 가장 작은 숫자부터 다시
		System.out.println("s:" + s);
		s = (short)-32769;
		System.out.println("s:" + s);
		
		double i = 0.1;
		double sum = 0;
		for(int x=0; x<100; x=x+1) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println(0.2 == (1.0-0.8));
		
		
		
		

	}

}
