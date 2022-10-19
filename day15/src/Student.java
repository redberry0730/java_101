
public class Student {
	//static 초기화 블럭 - 프로그램이 실행될 때 1번만 수행
	static {
		System.out.println("1번만 제일 먼저 실행");
	}
	
	//인스턴스가 생성될 때 마다 호출되는 블럭
	{
		System.out.println("인스턴스를 만들 때 마다 실행");
	}
	
	//프로퍼티 선언
	//번호 와 이름과 주소를 저장
	private int num;
	private String name;
	private String address;
	//매개변수가 없는 생성자와 매개변수가 3개인 생성자가 존재
	//생성자 오버로딩
	
	//매개변수가 없는 생성자
	public Student() {
		
	}
	
	//매개변수가 있는 생성자
	public Student(int num, String name, String address) {
		//매개변수로 받은 데이터를 프로퍼티에 대입
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	//프로퍼티를 private 으로 만들면 인스턴스가 사용할 수 없습니다.
	//인스턴스가 프로퍼티를 사용할 수 있도록 접근자 메소드를 만들어 주어야 합니다.	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//인스턴스가 메모리 정리가 될 때 호출되는 메소드
	@Override
	public void finalize() {
		System.out.println("메모리에서 제거됩니다.");
	}
}
