class SuperClass{
	public SuperClass(int n) {
		
	}
	
	public int num = 1;
	
	public void method() {
		num = 10;
		System.out.println("메소드");
	}
}

class Sub1 extends SuperClass{	
	public int num = 2;
	
	public Sub1() {
		super(2);
	}
	public void method1() {
		int num = 3;
		//가까운 곳에서 만든 것을 찾습니다
		System.out.println("num:" + num); //3
		//this를 붙이면 메소드 바깥에서부터 찾습니다.
		System.out.println("this.num:" + this.num); //2
		//super를 붙이면 상위 클래스에서부터 찾습니다.
		System.out.println("super.num:" + super.num); //1
		System.out.println("메소드1");
	}
}

class Sub2 extends SuperClass{
	public Sub2() {
		super(2);
	}
	public void method2() {
		System.out.println("메소드2");
	}
}



public class inheritanceMain {

	public static void main(String[] args) {
		//인스턴스 생성
		Sub1 sub = new Sub1();
		//메소드 호출
		sub.method1();

	}

}
