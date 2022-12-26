package test;

abstract class Animal {
	//얘는 직접적으로 사용x 자식들이 오버라이딩 하도록 존재만 함
	//void dry() { }
	
	//클래스 앞, 메서드 앞에 abstract 붙여서 존재만 하도록 할 수 있음
	abstract void cry();
	//추상 메서드는 존재만 하기때문에 상속받은 클래스에서 반드시 구현해야 함
	//따라서 오타로 인한 오류를 잡아낼 수 있음
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}


public class AbstractTest {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.cry();

		Animal a2 = new Dog();
		a2.cry();
	}

}
