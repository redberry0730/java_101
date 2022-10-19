
public class BasicAlgorithm {

	public static void main(String[] args) {
		//합계
		int sum = 0; //합계를 저장할 변수를 생성 - 0으로 초기화
		//1부터 100까지 순서대로 진행
		for(int i=1; i<=100; i=1+1) {
			//반복할 내용
			//sum에 i를 계속 추가
			sum = sum + i;
		}
		//출력
		System.out.println("합계:" + sum);
		//위의 내용을 변경해서 1부터 100까지 홀수의 합

	}

}
