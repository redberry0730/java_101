class Sample{
	//클래스 내부에서는 사용할 수 있지만 외부에서 인스턴스로 접근이 안됨
	private int num;
	//아래 3개는 동일한 패키지 안에서는 public 이라서
	//인스턴스. 로 접근 가능합니다.
	int age;
	protected String name;
	public String address;
	
	//매개변수가 없고 리턴 타입도 없는 메소드
	//static 이 붙으면 인스턴스 없이 클래스 이름으로 호출이 가능
	//static 메소드는 static 이 붙지 않은 프로퍼티는 사용못합니다.
	public static void method() {
		//num = 10;
		//Hello Java를 5번 출력
		for(int i=0; i<5; i++) {
			System.out.println("Hello Java");
		}
	}
	
	//정수 1개를 매개변수로 받는 메소드
	//파라미터가 있으면 메소드를 호출할 때 파라미터의 자료형에 맞는 데이터를
	//대입해서 호출해야 합니다.
	public static void disp(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Hello Java");
		}
	}
	
	//정수 2개를 매개변수로 받는 메소드
	public void add(int n1, int n2) {
		System.out.println("n1+n2=" + (n1+n2));
	}
	
	//return type이 void 이면 메소드는 데이터를 리턴하지 않습니다.
	//이 메소드는 메소드를 호출하고 나면 거기서 끝입니다.
	//return type이 있어서 데이터를 리턴하게 되면 그 데이터를 가지고 
	//계속해서 작업을 수행할 수 있습니다.
	
	//static 메소드가 아니고 2개의 정수 매개변수를 받아서 정수를 리턴하는
	//메소드
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	//메소드의 이름은 같고 매개변수의 개수나 자료형이 다른 경우
	//Method Overloading
	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
}

public class OOPMain {

	public static void main(String[] args) {
		//Sample 클래스의 인스턴스 생성
		Sample obj = new Sample();
		
		//Hello Java를 5번 출력
		//obj를 통해서 method()를 호출 - method() 작성한 내용이 실행
		obj.method();

		//Hi Java를 출력
		System.out.println("Hi Java");
		
		//Hello Java를 5번 출력
		//static 메소드는 클래스이름으로 호출이 가능
		Sample.method();

		//public static void disp(int n) 호출
		Sample.disp(3);
		
		//public void add(int n1, int n2)
		obj.add(20, 30);
		
		//static 메소드가 아니고 2개의 정수 매개변수를 받아서 정수를 리턴하는
		//메소드
		//public int sum(int n1, int n2)
		
		int result = obj.sum(30, 50);
		//메소드가 결과를 리턴하면 그 데이터를 다른 작업에 이용할 수 있습니다.
		System.out.println(result);
		result = obj.sum(result, 90);
	}

}
