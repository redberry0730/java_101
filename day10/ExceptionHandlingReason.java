import java.io.IOException;

public class ExceptionHandlingReason {

	public static void main(String[] args) {
		int x = 20;
		int y = 5;
		try {
			//0으로 나누었기 때문에 예외 발생
			//catch로 넘어갑니다.
			System.out.println(x/y);
		}catch(Exception e) {
			//예외가 발생하면 처리를 하고 catch 바깥으로 나갑니다.
			System.out.println("예외 발생");
			//예외 메시지 출력
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("무조건 수행");
		}
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");

	}

}
