//이 클래스는 없어도 모든 기능을 제대로 수행
//UI의 개수를 줄이기 위해서 상속 관계를 만들기 위해서 생성한 클래스
//이 클래스는 실제 사용은 하지 않습니다.
abstract class  Starcraft{
	//이 메소드는 오버라이딩을 위해서 만든 메소드
	//이 메소드는 호출할 필요가 없는 메소드
	//내용이 없는 메소드로 만들어주는 것이 좋습니다.
	//이 메소드는 하위 클래스에서 반드시 재정의 해야 합니다.
	public abstract void attack();
}

class Protoss extends Starcraft{
	public void attack() {
		System.out.println("프로토스의 공격");
	}
}

class Zerg extends Starcraft{
	public void attack() {
		System.out.println("저그의 공격");
	}
}

class Terran extends Starcraft{
	public void attack() {
		System.out.println("테란의 공격");
	}
}

public class StarcraftMain {

	public static void main(String[] args) {
		//하나의 코드는 하나의 UI를 가져야 합니다.
		
		Starcraft starcraft = new Protoss();
		starcraft.attack();
		
		starcraft = new Zerg();
		starcraft.attack();
		
		starcraft = new Terran();
		starcraft.attack();
		
		//추상 클래스는 인스턴스를 생성할 수 없어서 에러
		//starcraft = new Starcraft();

	}

}
