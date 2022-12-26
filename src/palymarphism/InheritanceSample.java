package palymarphism;

//class A {
//	int m = 10;
//	void abc() {System.out.println("A.abc() is called"); }
//}
//
//class B extends A {
//	int n = 20;
//	void bcd() {System.out.println("B.bcd() is called"); }
//}

public class InheritanceSample {

	public static void main(String[] args) {
		B b = new B();
		//B객체의 필드와 메서드를 참조
		//강제 초기화값 0이 나옴 //값 지정시 그 값이 나옴
		System.out.println("B.n = " + b.n);
		b.bcd();
		
		//B객체를 이용해 A객체의 필드와 메서드도 참조 가능
		//a.m 을 b.m으로도 호출 가능
		System.out.println("A객체의 m 필드 = " + b.m);  
		b.abc();

	}

}
