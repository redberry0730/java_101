
public class BreadAndContinue {

	public static void main(String[] args) {
		//1부터 10까지 순서대로 출력
		//제일먼저 i:1 로 설정
		//i가 10보다 작거나 같다면 {} 안의 문장을 수행
		//i++를 해서 i 값을 1증가시키고 i<=10 이 참이면 { }안의 내용 반복
		//i<=10 이 거짓이 되면 for 문을 빠져 나갑니다.
		for(int i=1; i<=10; i++) {
			//i를 3으로 나눈 나머지가 0이면 반복문을 종료
			/*
			if(i % 3 == 0) {
				break;
			}
			*/
			
			//아래 문장을 실행하지 않고 다음 반복으로 넘어갑니다.
			//3의 배수일 때는 출력을 안합니다.
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
