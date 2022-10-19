
public class OOPMain {

	public static void main(String[] args) {
		//데이터를 저장하기 위해서
		//매개변수가 있는 생성자를 호출해서 Student 인스턴스 생성
		Student st1 = new Student(1, "아담", "서울");
		
		//값을 채우기
		//st1.setNum(1);
		//st1.setName("아담");
		//st1.setAddress("서울");
		
		//값을 가져와서 출력
		System.out.println("번호:" + st1.getNum());
		System.out.println("이름:" + st1.getName());
		System.out.println("주소:" + st1.getAddress());
		
		//매개변수가 없는 생성자를 호출해서 인스턴스를 생성
		Student st2 = new Student();
		st2.setNum(2);
		st2.setName("류시아");
		st2.setAddress("서울");
		
		//인스턴스 생성
		Student st3 = new Student();
		
		st3 = null; //기존에 가리키던 인스턴스가 메모리 정리됩니다.
		//자바는 다른 작업이 없을 때 메모리를 하기 때문에 정확한 메모리 정리
		//시점을 할 수 없습니다.
		
		Student st4 = new Student();
		Student st5 = st4;
		//인스턴스의 참조를 다른 변수에 대입하는 것은 주의해야 합니다.
		//이 경우는 메모리에서 인스턴스를 제거하지 않습니다.
		//st4가 가리키던 인스턴스를 st5에게도 가리키도록 했기 때문에
		//st4에 null을 대입해서 st5 가리키고 있어서 메모리 정리가 안됩니다.
		//메모리에서 제거할려면 st5에도 null을 대입해야 합니다.
		st4 = null;
		//st5 = null;
		
		//강제로 메모리 정리
		System.gc();

	}

}
