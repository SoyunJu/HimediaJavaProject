package palymarphism;

//외부 클래스 정의
class Fruit1 { }

//개별적으로 동작하던 클래스에 상속 부여
class Apple1 extends Fruit1 { }

class Grape1 extends Fruit1 { }

class Kiwi1 extends Fruit1 { }




public class FruitSample {

	public static void main(String[] args) {
		//하나의 객체는 new 연산자를 이용해 할당
		String s1 = new String("문자열");
		Apple a1 = new Apple();
		Grape g1 = new Grape();
		Kiwi k1 = new Kiwi();
		
		String[] s2 = {new String(), new String(), new String()};
		Apple[] a2 = {new Apple(),new Apple(),new Apple()};
		Grape[] g2 = {new Grape(),new Grape(),new Grape()};
		Kiwi[] k2 = {new Kiwi(),new Kiwi(),new Kiwi()};
		
		//모든 과일의 갯수를 계산
		int count1 = a2.length + g2.length + k2.length;
		
		
		//상속을 이용해 안에 다 넣어주는게 가능
		Fruit[] f2 = {new Apple(),new Apple(),new Apple(),
						new Grape(),new Grape(),new Grape(),
						new Kiwi(),new Kiwi(),new Kiwi() };
		
		int count2 = f2.length;
		
		System.out.println(count1);
		System.out.println(count2);
		}

	}

