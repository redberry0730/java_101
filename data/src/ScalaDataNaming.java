package kakao.itstudy.data;

public class ScalaDataNaming {

	public static void main(String[] args) {
		//정수 데이터를 생성하고 이름을 붙이기
		//이름을 다른 데이터에 사용할 수 없습니다.
		final int age = 51;
		//age = 52;
		
		//실수 데이터를 생성하고 이름을 붙이기
		double height = 168.5;
		//데이터를 수정
		height = 169.5;
		
		//height라는 이름으로 사용할 수 있는 데이터를 출력
		//하나를 저장할 수 있는 자료형은 이름이 곧 데이터
		System.out.println("키는 " + height);
		//많이 하는 실수
		//큰 따옴표를 하게되면 문자열로 인식 - 이름이 아니고 글자
		System.out.println("height");
		
		char ch = 'B'; //실제로는 66을 저장하고 있다가 출력할 때 B출력
		System.out.println("ch:" + ch); //B
		ch = 66;
		System.out.println("ch:" + ch); //B
		//\n은 줄 바꿈
		System.out.println("안녕하세요\n반갑습니다.");
	}

}
