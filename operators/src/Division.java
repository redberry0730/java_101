package kakao.itstudy.operator;

public class Division {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("x/y:" + x/y); //2
		
		x = 10;
		y = 4;
		//정수 / 정수 는 정수입니다.
		System.out.println("x/y:" + x/y); //2
		
		//2.5가 나오도록 하기
		// / 의 결과가 실수가 되도록 할려면 최소 데이터 중의 1개는
		//실수 이어야 합니다.
		//강제 형 변한을 이용합니다.
		//x를 실수로 형변환해서 실수 연산을 하도록 만들어서 2.5
		//y를 형변환해도 됩니다.
		System.out.println("x/y:" + (double)x/y); //2
		
		//실수 / 실수 의 결과를 정수로 변환 - 기본적으로 소수가 없어짐
		//소수 첫째 자리 반올림하기
		//실수는 정수에 저장을 못하므로 실수 데이터를 정수로 저장할려면
		//강제 형 변환을 해야 합니다.
		int result = (int)(10.8 / 3); //원래 결과는 3.6 인데 3으로 변환
		System.out.println("result:" + result);
		result = (int)(10.8 / 3 + 0.5); //원래 결과는 3.6 인데 4으로 변환
		System.out.println("result:" + result);
	}

}
