package kakao.itstudy.operator;

public class SwitchTest {

	public static void main(String[] args) {
		int menu = 1;

		//menu 가 1이면 중식
		//menu 가 2이면 한식
		//menu 가 3이면 분식
		//그 이외의 경우는 양식이라고 출력
		//if로 해결 가능
		if(menu == 1) {
			System.out.println("중식");
		}else if(menu == 2) {
			System.out.println("한식");
		}else if(menu == 3) {
			System.out.println("분식");
		}else {
			System.out.println("양식");
		}

		switch(menu) {
		case 1:
			//break가 없으면 break를 만날때까지 진행
			System.out.println("중식");
			//break;
		case 2:
			System.out.println("한식");
			break;
		case 3:
			System.out.println("분식");
			break;
		default:
			System.out.println("양식");
			break;
		}

		//switch는 문자열은 가능하지만 실수는 안됨
		/*
		double d = 10.7;
		switch(d) {
		case 10.7:
			System.out.println("실수");
			break;
		}
		 */

		String ml = "회귀";
		switch(ml) {
		case "회귀":
			System.out.println("미래의 값을 예측");
			break;
		case "군집":
			System.out.println("그룹을 생성해서 할당");
			break;
		default:
			System.out.println("그 이외의 머신러닝");
			break;
		}


	}

}
