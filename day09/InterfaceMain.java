//이름만 있는 메뉴판을 생성
interface Menu{
	public void hambuger();
}

//메뉴를 구현하는 클래스를 생성
class Food implements Menu{

	@Override
	public void hambuger() {
		System.out.println("빵 2개에 고기를 넣어서 만듬");
		
	}
	
}


public class InterfaceMain {

	public static void main(String[] args) {
		//인터페이스를 구현한 경우에는 변수는 인터페이스 타입으로 만들고
		//인스턴스 생성은 인터페이스를 구현한 클래스로 생성합니다.
		Menu food = new Food();
		food.hambuger();

	}
}
