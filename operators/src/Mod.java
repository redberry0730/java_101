package kakao.itstudy.operator;

public class Mod {

	public static void main(String[] args) {
		int x = 0;
		try {
			while(true) {
				Thread.sleep(1000);
				if(x % 3 == 0) {
					System.out.println("빨강");
				}
				if(x % 3 == 1) {
					System.out.println("파랑");
				}
				if(x % 3 == 2) {
					System.out.println("노랑");
				}
				++x;
			}
		}catch(Exception e) {}

	}

}
