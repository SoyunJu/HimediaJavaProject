package palymarphism;

class Fruit {
}

class Kiwi extends Fruit { void print() {System.out.println("키위"); }
}

class GreenKiwi extends Kiwi {
}

//class D extends Kiwi {
//}

public class DownCasting {

	public static void main(String[] args) {
		{// 같은 이름의 변수명 사용하기 위해 중괄호로 묶어줌
			// 업 캐스팅 (자동 타입 변환)
			
			Kiwi a = new Kiwi();
			a.print();
			
			//Kiwi.print();
			
			Kiwi kiwi1 = new Kiwi();
			Fruit fruit1 = kiwi1; // Fruit fruit1 = (Fruit)kiwi1;

			/*C c1 = new C();
			B b2 = c1;
			A a2 = c1;*/
		}

		{
			// 다운 캐스팅 (수동 타입 변환)
			int i = 10;
			// 더 작은 타입으로 변환 (수동변환/명시)
			byte b = (byte) i;

			// 자식으로 부모타입 변환 (수동변환/명시)
			Fruit fruit1 = new Fruit();
			//fruit에 뭐가 들어있는 지 알 수 없으므로 캐스팅 불가, 오류
			//Kiwi kiwi1 = (Kiwi) fruit1;

			// new B()가 가지고 있던 값을 b2에 그대로 가져올 수 있음
			//받아들일때는 부모로 넓게 받고, 실제 구현시엔 자식으로 구체적으로 사용
			Fruit fruit2 = new Kiwi();
			Kiwi kiwi2 = (Kiwi)fruit2;
			
			
			// 문법적으로는 문제x 실행시 오류
			//GreenKiwi greenKiwi2 = (GreenKiwi) fruit2;
		}

		
	//상속, 오버라이딩을 이용해 유연하게 cry 메서드 구현하기
	// 각각 객체를 만들지 않고도 사용가능 (다운캐스팅 없이)
		
	/*Animal[] animals = new Animal[] { new Bird(), new Dog(), new Cat(), new Monkey() }
	 * for (Animal animal : animals) {
	 		* animal.cry();
	 * } */
	}

}
