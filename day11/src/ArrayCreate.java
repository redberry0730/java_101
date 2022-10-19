
public class ArrayCreate {

	public static void main(String[] args) {
		//문자열 배열을 생성
		String [] names = {"베르캄프", "시어러","로이킨"};
		
		//데이터 개수 확인
		System.out.println("데이터 개수:" + names.length);
		//첫번째 데이터를 출력
		System.out.println("names[0]:" + names[0]);
		
		//정수 배열을 데이터 없이 3개 생성
		int [] ar = new int[3];
		//숫자는 기본값이 0
		System.out.println("ar[0]:" + ar[0]);
		ar[0] = 20;
		ar[1] = 30;
		ar[2] = 40;
		
		//인덱스를 이용한 names 순회
		int size = names.length;
		for(int i=0; i<size; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		
		//빠른 열거를 이용한 순회
		for(String name : names) {
			System.out.println(name);
		}
		
		String [][] players = {
				{"마이클 조던","레지 밀러", "찰스 바클릭"},
				{"베이브 루스", "루 게릭", "조 디마지오"}
		};
		
		//이차원 배열 순회
		for(String [] temp : players) {
			for(String imsi : temp) {
				System.out.print(imsi + "\t");
			}
			System.out.print("\n");
		}

	}

}
