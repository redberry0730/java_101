package kakao.itstudy.operator;

public class Relation {

	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 20;
		//n1 이 큰지 : true
		System.out.println("n1 > n2:" + (n1>n2));
		//n1 과 n2 의 값이 같은지 : false
		System.out.println("n1 == n2:" + (n1==n2));
		
		//n1 은 10보다 크고 20보다 작은지 여부 확인 - false
		System.out.println(n1 > 10 && n1 < 20);
		
		//n1 은 10보다 크거나 20보다 작은지 여부 확인
		System.out.println(n1 > 10 || n1 < 20);
		
		//1부터 100까지 3의 배수(나머지가 0)이면서 
		//4의 배수인 데이터의 개수를 찾기
		
		//데이터 개수를 저장할 변수
		//&&의 경우는 false 일 가능성이 높은 것을 앞에 작성하는 것이 좋습니다.
		//||의 경우는 true 일 가능성이 높은 것을 앞에 작성하는 것이 좋습니다.
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);
		
		cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 4 == 0 && i % 3 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

		//year가 윤년인지 확인
		//윤년의 조건
		//1.4의 배수이고 100의 배수가 아닌 경우
		//2.400의 배수인 경우
		//둘 중에 하나만 만족하면 윤년
		
		int year = 2021;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "는 윤년입니다.");
		}else {
			System.out.println(year + "는 윤년이 아닙니다.");
		}
		
		
		
		
		
		
		
		

	}

}
