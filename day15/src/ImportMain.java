//java.util.Random 클래스는 패키지 이름을 생략해도 됩니다.
import java.util.Random;
//java.util 패키지에 있는 모든 클래스는 패키지 이름을 생략해도 됩니다.
import java.util.*;

public class ImportMain {

	public static void main(String[] args) {
		//랜덤한 정수를 만드는 작업 - java.util.Random 클래스
		Random r = new Random();
		
		System.out.println(r.nextInt());
		
		Date today = new Date();
		
		//java.sql.Date 클래스를 사용하고자 하는 경우
		//java.util.* 이 import 된 경우에는 
		//패키지 이름까지 전부 기재해야 합니다.
		java.sql.Date date = new java.sql.Date(2021, 5, 25);
		
		

	}

}
