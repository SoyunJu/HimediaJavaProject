package otherpackage;

import mypackage.MyClass;

public class MyOtherClass extends MyClass {

	void accessMyClassMember() {

		// MyClass의 인스턴스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();
		//privateInt = 10;
		//packageInt = 10;
		protectedInt = 10;
		publicInt = 10;
		
		protectedMethod();
		publicMethod();
		
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		//mc.packageInt = 10;
		//mc.protectedInt = 10;
		
		mc.publicInt = 10;

		// private은 동일 클래스에서만 사용가능하므로 외부에서 접근할 수 없음
		// private 멤버 필드 , 멤버 메서드 -> 외부에서 사용x

		MyOtherClass moc = new MyOtherClass();
		
		//moc.privateInt = 10;
		//moc.packageInt= 10;
		
		moc.protectedInt = 10;
		moc.publicInt = 10;

	}

}
