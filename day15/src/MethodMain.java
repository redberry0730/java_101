class MethodClass{
	//1~n 까지의 합계 구하는 메소드
	public static int sum(int n) {
		//합계를 저장할 변수
		int tot = 0;
		//1부터 n까지 1씩 증가시켜서
		for(int i=1; i<=n ; i++) {
			//tot에 i를 계속 더하기
			tot = tot + i;
		}
		return tot;
	}
	
	//1부터 n까지의 합계를 재귀로 구현
	//10까지의 합계: 10 + 9까지의 합계
	//9까지의 합계: 9 + 8까지의 합계
	//재귀를 만들 때는 중단 점이 있어야 합니다.
	//합계는 1까지의 합이 1입니다.
	public static int recSum(int n) {
		//1까지의 합은 1
		if(n == 1) {
			return 1;
		}
		//1이 아닐 때의 합계는 n + recSum(n-1)
		else {
			return n + recSum(n-1);
		}
	}
	
	//프로퍼티 생성
	int score = 100;
	
	//this를 테스트 하기 위한 메소드
	public void thisMethod() {
		int score = 80;
		
		//이 영역에는 이 영역에서만든 score 가 있고
		//클래스에서만든 score도 있습니다.
		System.out.println("score:" + score); 
		//위처럼 score 라고 하면 가까운 곳에서 만든 score가 출력됩니다.
		System.out.println("this.score:" + this.score);
		//this를 붙이면 메소드 안에서는 찾지 않고 클래스에부터 찾습니다.
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}


public class MethodMain {

	public static void main(String[] args) {
		int result = MethodClass.sum(100000);
		System.out.println("result:" + result);
		
		//재귀는 일정 숫자가 넘어가면 메모리 부족으로 예외가 발생합니다.
		//result = MethodClass.recSum(100000);
		//System.out.println("result:" + result);
		
		//인스턴스 생성
		MethodClass obj = new MethodClass();
		obj.thisMethod();
	}

}
