package test;

class Apple {
}

class Pencil {
}

// 제네릭 클래스
class Goods<T> {
	private T goods;

	public T getGoods() {
		return goods;
	}

	public void setGoods(T goods) {
		this.goods = goods;
	}
}

public class Main {
	public static void main(String[] args) {
		Goods<Apple> goods = new Goods<Apple>();
		goods.setGoods(new Apple());
		Apple apple = goods.getGoods(); // 다운 캐스팅을 하지 않고 바로 사용이 가능

		// Type mismatch: cannot convert from Apple to Pencil
		Pencil pencil = goods.getGoods(); // 강한 타입 체크가 가능
	}

}
