package test;

import java.util.HashMap;

class A {
	String name;
	A(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			if (this.name == ((A) obj).name)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return name;
	}
 
	
//	HashMap<Integer, String> hm1 = new HashMap<>();
//	hm1.put(1, "데이터1");
//	hm1.put(1, "데이터2");
//	hm1.put(2, "데이터3");
//	System.out.println(hm1);
	
	HashMap<A, String> hm2 = new HashMap<>();
	hm2.put(new A("첫번째"), "데이터1");
	hm2.put(new A("첫번째"), "데이터2");
	hm2.put(new A("두번째"), "데이터3");
	System.out.println(hm2);
}




/* 1-1
2-2
3-1
4-4
5-2
6-this.name을 Parent studentNo = new Parent(); 로 초기화 해준 후, 
										studentNo=Parent.name 넣어준다
7-