package otherpackage;

import mypackage.MyClass;

public class OtherClass {
	
	
	void accessMyClassMember() {

		// OtherClass mc = new OtherClass();
		MyClass mc = new MyClass();
		// 같은 패키지 내에서만 되기 때문에 오류
		// mc.packageInt = 10;

		// 다른 패키지에서 사용하려면 상속 받은 경우만 되므로 오류
		// mc.protectedInt = 10;

		mc.publicInt = 1;
		// private은 동일 클래스에서만 사용가능하므로 외부에서 접근할 수 없음
		// private 멤버 필드 , 멤버 메서드 -> 외부에서 사용x

		// mc.packageMethod(); //마찬
		// mc.protectedMethod(); //가지

		mc.publicMethod();

	}
}
