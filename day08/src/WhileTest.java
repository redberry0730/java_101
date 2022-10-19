
public class WhileTest {

	public static void main(String[] args) {
		//Hello World를 3번 출력
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		System.out.println();
		//반복문을 이용해서 위와 동일한 작업
		//반복문을 이용하면 횟수를 변경하는 것이나 내용을 변경하는 것이
		//쉬워집니다.
		int i=0;
		while(i < 3) {
			System.out.println("Hello Java");
			i++;
		}
		
		//패턴을 갖는 반복문 만들기
		//0, 1, 2를 반복문을 이용해서 출력
		i = 0;
		while(i < 3) {
			System.out.println(2 * i + 1);
			i++;
		}
		//위의 문장을 변경해서 1, 2, 3 을 출력
		
		//위의 문장을 변경해서 1, 3, 5 를 출력
		
		//image0.png, image1.png, image2.png를 출력
		i = 0;
		while(i<3) {
			System.out.println("image" + i + ".png");
			i++;
		}
		

	}

}
