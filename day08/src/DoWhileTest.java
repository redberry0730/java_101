
public class DoWhileTest {

	public static void main(String[] args) {
		//Hello Java를 3번 출력하기
		int i = 0;
		do {
			System.out.println("Hello Java");
			i++;
		}while(i<3);
		
		//image1.png, image2.png, image3.png를 
		//do~while로 해결
		i = 1;
		do {
			System.out.println("image" + i + ".png");
			i++;
		}while(i < 4);

	}

}
