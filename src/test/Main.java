package test;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		
		// id가 hong이고, password가 12345인 경우에만 true를 반환 
		// 로그인에 성공한 경우 logout을 호출 가능 
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else { 
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		// id가 일치하지 않으면 false를 반환
		result = memberService.login("song", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
		} else { 
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		// password가 일치하지 않으면 false를 반환
		result = memberService.login("hong", "67890");
		if (result) {
			System.out.println("로그인 되었습니다.");
		} else { 
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}

