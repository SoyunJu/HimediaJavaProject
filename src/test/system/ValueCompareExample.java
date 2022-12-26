package test.system;

public class ValueCompareExample {

	public static void main(String[] args) {
		int i1 = 100;
		int i2 = 100;
		System.out.println(i1 == i2); //true
		
		Integer ii1 = 300;
		Integer ii2 = 300;
		System.out.println(ii1 == ii2);			//false
		System.out.println(ii1.equals(ii2));	//true
		
		
		Integer ii3 = 127;
		Integer ii4 = 127;
		System.out.println(ii3 == ii4);			//true	
												//100과 같은 범위에 속해서 값 공유
												//byte영역 (-128 ~ 127)
		System.out.println(ii3.equals(ii4));	//true

	}

}
