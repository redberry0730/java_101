class P{
	public void method() {
		System.out.println("상위 클래스의 메소드");
	}
}

//P 클래스를 상속받은 C 클래스
class C extends P{
	//오버라이딩 - P 클래스에 있는 method를 하위 클래스에 다시 만드는 것
	public void method() {
		System.out.println("하위 클래스의 메소드");
	}
	
	public void function() {
		System.out.println("하위 클래스 만의 메소드");
	}
}


public class InheritanceAssignment {

	public static void main(String[] args) {
		P obj1 = new P(); //변수를 선언할 때 사용한 자료형 과 
		//인스턴스를 생성할 때 호출하는 생성자의 자료형이 같으므로 가능
		
		//상위 클래스 타입으로 만든 변수에 하위 클래스 타입의 인스턴스를 
		//대입하는 것이 가능합니다.
		P obj2 = new C();
		
		//에러 발생 - 하위 클래스 타입으로 만들어진 변수에
		//상위 클래스 타입의 인스턴스를 대입할 수 없습니다.
		//C obj3 = new P();
		
		//강제 형 변환해서 대입하는 것은 가능합니다.
		//P 타입의 인스턴스를 강제로 대입하면 예외가 발생합니다.
		//C obj3 = (C)(new P());
		
		//obj2는 P 타입이지만 C()를 대입받았습니다.
		//이 경우에는 에러도 없고 예외도 발생하지 않습니다.
		//프레임워크를 프로그램 개발할 때 많이 사용하는 문법입니다.
		C obj3 = (C)obj2;
		
		
		//p는 변수를 선언할 때는 P 클래스 타입으로 선언하고
		//인스턴스는 C 타입으로 대입을 했습니다.
		P p = new C();
		p.method(); //method는 오버라이딩이 되어 있습니다.
		//오버라이딩 된 메소드는 클래스를 보지 않고 인스턴스를 보고 메소드를
		//찾아옵니다.
		
		//P 클래스의 인스턴스가 대입되서 P 클래스의 method가 호출됩니다.
		p = new P();
		p.method();

	}

}
