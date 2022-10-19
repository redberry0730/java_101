import java.util.Scanner;

class Imsi{
	//Call By Value 메소드
	public void callByValue(int n) {
		//n 의 값을 증가 - 원본에는 아무런 영향이 없습니다.
		n = n + 1;
		
		System.out.println("n:" + n);
	}
	
	//Call By Reference 메소드
	//메소드의 매개변수가 배열
	public static void callByReference(int [] ar) {
		//배열의 첫번째 데이터에 1을 더해서 저장
		ar[0] = ar[0] + 1;
		System.out.println("ar[0]:" + ar[0]);
	}
}


public class MethodMain {

	public static void main(String[] args) {
		int x = 10;
		//Imsi 클래스에 있는 public void callByValue 메소드 호출
		//Imsi 타입의 인스턴스를 생성
		Imsi imsi = new Imsi();
		imsi.callByValue(x); //x 의 값인 10이 대입
		//메소드를 호출해도 x에는 아무런 영향이 없습니다.
		System.out.println("x:" + x);
		
		int [] xr = {10, 20, 30};
		//기본형이 아닌 배열을 대입하면 
		//메소드에서 데이터를 수정하면 원본 데이터도 수정됩니다.
		Imsi.callByReference(xr);
		System.out.println("xr[0]:" + xr[0]);
		
		//키보드 입력을 받기 위한 Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		//이름 입력받기
		System.out.print("이름 입력:");
		String name = sc.nextLine();
		System.out.println("이름:" + name);
		
		//정수로 된 번호 입력받기
		System.out.print("번호 입력:");
		int num = sc.nextInt();
		System.out.println("번호:" + num);
		
		//주소를 입력받기
		System.out.print("주소 입력:");
		//숫자 다음에 문자열을 입력받으면 앞에서 숫자를 입력하고 Enter를
		//입력하게 되는데 숫자는 숫자 부분만 가져가기 때문에 Enter가 남아서
		//다음 입력을 받을 때 Enter를 바로 넘겨주기 때문에 
		//남아있는 Enter를 없애기 위해서 nextLine을 한번 호출해주어야 합니다.
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("주소:" + address);
		
		//스캐너는 사용이 종료되면 닫아 주어야 합니다.
		//메모리 누수가 발생합니다.
		sc.close();

	}

}
