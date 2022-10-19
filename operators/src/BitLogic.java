package kakao.itstudy.operator;

public class BitLogic {

	public static void main(String[] args) {
		int x = 24; //00000000 00000000 00000000 00011000
		int y = 23; //00000000 00000000 00000000 00010111
		
		System.out.println(x&y); //둘 다 1일 때만 1
		System.out.println(x|y); //둘 다 0일 때만 0
		System.out.println(x^y); //같으면 0 다르면 1

		//x가 y보다 크다면 x 그렇지 않으면 y
		int result = x > y ? x : y;
		System.out.println("result:" + result);
		
		//x = x + 4
		x += 4;
		System.out.println("x:" + x);
		
	}

}
