package test.system;

import java.util.Scanner;

public class LottoResult {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		LottoExample.lotto(scn);
		while (true) {
			if (LottoExample.count == LottoExample.LOTTONUM) {
				System.out.println("<<<1등입니다! 대박!! 부럽다>>>");
				break;
			} else if (LottoExample.count == 5) {
				System.out.println("<<<2등입니다! 축하해요>>>");
				break;
			} else if (LottoExample.count == 4) {
				System.out.println("<<<3등입니다! 추카포카>>>");
				break;
			} else {
				System.out.println("<<<꽝 입니다>>>");
				System.out.println();
				System.out.println("계속하시려면 <a>를 그만두려면 <b>를 눌러주세요");
				String want = scn.nextLine();

				if (want.equals("a")) {
					LottoExample.lotto(scn);
				} else if (want.equals("b")) {
					System.out.println("---로또를 그만둡니다---");
					scn.close();
					System.exit(0);
				}

			}
		}

	}
}

// 질문 1. scan close 를 어디에서 해야 하는가?
// 질문 2. 숫자 값 제한을 어떻게 받는가?
