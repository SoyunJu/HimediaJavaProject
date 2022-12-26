package test.system;

import java.io.IOException;

//System.in.read() 메서드 사용해보기
//:입력한 키의 코드값을 반환해줌
// 코드값 > 0~9 : 48~57 / A~Z  : 65~90 / a~z : 97~122 / Enter : 13,10

public class InExample {

	public static void main(String[] args) throws IOException {
		// 숫자 1키를 누르면 스피드 증가
		// 숫자 2키를 누르면 스피드 감소
		// 숫자 3키를 누르면 프로그램을 중지

		int speed = 0;
		int keyCode = 0;

		while (true) {
			keyCode = System.in.read();
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) {
					speed++;
				} else if (keyCode == 50) {
					speed--;
				} else if (keyCode == 51) {
					break;
				}
				System.out.println("현재 속도 =" + speed);
			

			System.out.println("프로그램 종료");
			}
		}
	}
}
