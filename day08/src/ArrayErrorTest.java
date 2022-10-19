
public class ArrayErrorTest {

	public static void main(String[] args) {
		int [] ar = {10, 30};
		System.out.println(ar.length);
		System.out.println(ar[0]);
		//데이터가 2개이면 0번 과 1번만 존재
		//2번을 요청해서 실행 중 에러가 발생
		System.out.println(ar[2]);

	}

}
