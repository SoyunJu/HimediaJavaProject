package staticfield;

public class A {

	int m = 3;
	static int n = 5;

	A() {
		System.out.println(m + "," + n);
		System.out.println("A() is called");
	}

	static {
		n=50;
		// System.out.println(m);
		// 인스턴스변수 m => static 블록에서 사용 불가
		System.out.println(n);
		System.out.println("static block is runned");
	}

	public static void main(String[] args) {

		// 둘 다 A 클래스 타입 -> 힙메모리에 값 잡힘
		A a1 = new A();
		A a2 = new A();

		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m); // 5
		System.out.println(a2.m); // 6

		a1.n = 7; // <-- 인스턴스명.정적멤버명 방식의 사용은 권장사항X
		a2.n = 8;
		System.out.println(a1.n); // 8
		System.out.println(a2.n); // 8
		System.out.println(A.n); // 8

		A.n = 9; // <-- 클래스명.정적멤버명 <--권장
		System.out.println(a1.n); // 9
		System.out.println(a2.n); // 9
		System.out.println(A.n); // 9

	}

//	public static void main(String[] args) {
//		A a = new A();
//	}

}
