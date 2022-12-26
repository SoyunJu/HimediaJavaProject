package palymarphism;


public class CrySample {
	
	class A {
		private static void print1() {
			System.out.println("A 클래스 print1");
			
		}

		static void print2() {
			System.out.println("A 클래스 print2");
		}
		
		class B extends A {
			static void print1() {
				System.out.println("A를 받은 B의 print1");
			}

			static void print2(int a) {
				System.out.println("B 클래스 print2");
			}
		}
		
	}

//	class B extends A {
//		static void print1() {
//			System.out.println("A를 받은 B의 print1");
//		}
//
//		static void print2(int a) {
//			System.out.println("B 클래스 print2");
//		}
//	}
	
	public static void main(String[] args) {
		//A a = new A();
		A.print1();
		A.print2();

		//B b = new B();
		A.B.print1(); // 오버라이딩된 메서드  
		A.B.print2(); // 부모 클래스의 메서드 <= 상속받은 메서드
		A.B.print2(100); // 자기의 메서드 <= 오버로딩된 메서드

		//A c = new B();
		//c.print1(); // 오버라이딩된 메서드
		//c.print2(); // 오버라이딩되지 않았기 때문에 부모 클래스의 메서드가 호출
	}
}
