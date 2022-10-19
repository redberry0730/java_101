
public class ClassMain {

	public static void main(String[] args) {
		//SampleClass 의 인스턴스 만들기
		//인스턴스를 만들고 그 참조를 obj에 저장
		SampleClass obj = new SampleClass();
		//인스턴스의 참조를 출력하면 기본적으로는 클래스이름과 해시코드가 출력
		//해시코드는 객체를 구별하기 위한 코드(아이디 와 유사)
		System.out.println(obj);
		
		//인스턴스를 이용해서 프로퍼티에 접근
		obj.num = 1;
		obj.name = "데니스 베르캄프";
		//자바에서는 인스턴스를 이용해서 static 프로퍼티에 접근 가능
		//자바에서는 인스턴스를 이용해서 static 프로퍼티에 접근하면 경고가 발생
		obj.school = "메가스터디";
		System.out.println(obj.num + ":" + obj.name + ":" + 
				obj.school);
		//SampleClass 의 인스턴스를 생성
		SampleClass obj1 = new SampleClass();
		//num 과 name은 다른 값이 나오지만 school은 같은 값이 출력됩니다.
		//static이 붙은 것으 하나를 만들어서 공유하지만 
		//static이 붙지 않은 것은 인스턴스마다 별도로 생성합니다. 
		System.out.println(obj1.num + ":" + obj1.name + ":" + 
				obj1.school);

	}

}
