package kakao.itstudy.operator;

public class IfTest {

	public static void main(String[] args) {
		int score = 98;
		
		//score 가 60 이상이면 합격이라고 출력하고
		//그렇지 않으면 불합격이라고 출력
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		int su = 88;
		//su 가 짝수(2로 나눈 나머지가 0)라면 짝수
		//그렇지 않으면 홀수라고 출력
		if(su % 2 == 0) {
			System.out.println("작수");
		}else {
			System.out.println("홀수");
		}
		
		//score 가 90 ~ 100 사이이면 A
		//score 가 80 ~ 89 사이이면 B
		//score 가 70 ~ 79 사이이면 C
		//score 가 60 ~ 69 사이이면 D
		//그 이외의 경우는 F라고 출력
		if(score >= 90 && score <= 100) {
			System.out.println("A");
			//if 나 else if 또는 else 안에서 변수를 만들면
			//자신의 블록 안에서만 사용이 가능합니다.
			int k = 200;
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
			//System.out.println(k);
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
