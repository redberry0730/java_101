//추상 클래스 - 상속을 통해서만 사용이 가능
abstract class SuperClass{
	//추상 메소드 - 내용이 없는 메소드
	//상속받은 곳에서 반드시 재정의해서 사용
	abstract void disp();
}

class SubClass extends SuperClass{
	@Override
	void disp() {
		System.out.println("클래스를 만들어서 처리");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		//클래스를 만들어서 메소드를 구현하고 인스턴스를 만들고 호출
		SubClass obj = new SubClass();
		obj.disp();
		
		//클래스를 만들지 않고 인스턴스를 만들어서 호출
		SuperClass ins = new SuperClass() {
			@Override
			void disp() {
				System.out.println("익명 클래스를 이용한 방식");
			}
		};
		ins.disp();
		
		String s1 = new String();
		String s2 = new String("Hello Java");
		
		//Runtime 클래스의 인스턴스 만들기
		Runtime r = Runtime.getRuntime();
		System.out.println(r.availableProcessors());

	}

}
