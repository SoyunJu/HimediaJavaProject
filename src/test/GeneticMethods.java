package test;

public class GeneticMethods {
	public <T> T method1(T t) {
		return t;
	}
	

	public static void main(String[] args) {


	}

}

/* 1-4  -> 사용자가 직접 정의한 오류도 처리할 수 있음
2-3  -> finally는 오류 여부에 상관없이 무조건 실행
3-4  -> 새로운 예외 발생은 trow 구문 사용 (throws X)
4-3 (틀림) -> 예회를 호출한 곳으로 떠넘기는건 throws
5-3 

6-"숫자로 변환할 수 없음"(틀림)	-> 10 (value 값 찍어줌)
	0							-> "2a" 변환 불가 오류 
								-> 10 \n "숫자로 변환할 수 없음" \n
								-> 10 \n "인덱스를 초과했음"
								
								
7- super(message);
   super(message);
	trows NotExistIDException, WorgPasswordException (trows => 전가)
	
	throw new NotExistIDException("아이디가 존재하지 않습니다."); (trow => 예외 발생)
	(= NotExistIDException neid = new NotExistIDException("아이디가 존재하지 않습니다.")
	(  throw neid;																	   )
	
	throw new WorgPasswordException("패스워드가 틀립니다.")

8- finally 의 try catch 를 빼기? (틀림)

정답)))

try(FileWriter fw = new FileWriter("file.txt");) {
	fw.write("Java");
} catch (IOException e) {
	e.printStackTrace();
}

(finally 구문 안써도 됨. 그래도 실행 됨)


-----제네릭 문제 ----
1- 4
2 - public class Container<T> {
	private T t;
	public T get() {
	 return t;
	 }
	public void set(T t) {
	this.t = t;
	}
	}
	
(정답))))))
class Container <T> {
		private T t;

		public void set(T t) {
			this.t = t;
		}
		public T get() {
			return this.t;
		}
	}


3 - 
public class Util<> {
	public <String, String> void Container1 (String a, String b) {
	System.out.print("a" + "," + "b")
	}

	public <String, Integer> container2 (String x, Integer y) {
	
}


(정답)))))
class Container <K,V> {

	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;

}
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}
}


4 - ((정답))
package test;

class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; } 
}

class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}

public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
		if (p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼원");
		System.out.println(childAge);

	}

}





*/