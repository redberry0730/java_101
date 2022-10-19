package kakao.itstudy.operator;

public class Unary {

	public static void main(String[] args) {
		boolean b = true;
		
		System.out.println("!b:" + !b);
		
		int x = 37;
		//~은 1의 보수 
		//컴퓨터가 음수를 2의 보수를 이용해서 표현하기 때문에
		//1의 보수는 부호를 반대로 하고 절대값이 1 작거나 크게 계산됩니다.
		//양수의 1의 보수는 음수로 나오고 절대값을 1크게 해서 나옵니다.
		//-38
		System.out.println("~x:" + ~x);
		
		//음수는 2의 보수를 구하면 양수로 나오고 절대값이 1작게 나옵니다.
		x = -37;
		System.out.println("~x:" + ~x);
		
		//정수 변수 생성
		int k = 10;
		k++; //k의 값을 1증가
		System.out.println("k:" + k);
		++k; //k의 값을 1증가
		System.out.println("k:" + k);
		//명령에 먼저 사용해서 12를 출력하고 1을 증가시켜서 13을 만듭니다.
		System.out.println("k++:" + k++);
		System.out.println("k:" + k);
		//1을 먼저 증가시켜서 14을 만들고 명령에 사용합니다.
		System.out.println("++k:" + ++k);
		System.out.println("k:" + k);

		x = 0;
		x = ++x + ++x;
		System.out.println(x);
	}

}
