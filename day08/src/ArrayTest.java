
public class ArrayTest {

	public static void main(String[] args) {
		//80, 90, 78  이라는 정수를 저장하는 변수를 생성
		//배열을 모른다면 변수를 3개 생성해야 합니다.
		int n1 = 80;
		int n2 = 90;
		int n3 = 78;
		//3개의 데이터를 출력
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		//배열을 사용해서 3개의 데이터를 저장
		//배열을 이용하면 여러 개의 데이터를 1개의 이름으로
		//사용할 수 있습니다.
		int [] ar = {80, 90, 78};
		
		//배열의 데이터를 출력
		//출력하는 구문을 한 번만 작성하고 데이터를 전부 순회하면서 출력
		for(int temp : ar) {
			System.out.println(temp);
		}

	}

}
