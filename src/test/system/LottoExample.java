package test.system;

import java.util.Arrays;
import java.util.Scanner;

public class LottoExample {

	final static int INPUTNUM = 6;
	final static int LOTTONUM = 6;

	static int count = 0;
	static int i = 0;

	// static Scanner scan = new Scanner(System.in);

	public static void lotto(Scanner scan) {

		// for (int i = 0; i < INPUTNUM; i++) {
		System.out.println("--1부터 45 사이의 6개의 숫자를 입력하세요---");
		System.out.print(">");
		String[] numbers = scan.nextLine().split(",");
		int[] intNumbers = new int[INPUTNUM];
		// scan.close();

		for (int i = 0; i < INPUTNUM; i++) {
			intNumbers[i] = Integer.parseInt(numbers[i].trim());

//			if (a >= 1 && a <= 45) {
//				intNumbers[i] = a;
//
//			} else {
//				System.out.println("---1부터 45까지의 숫자만 입력해주세요---");
//				i--;
//			}
		}
		Arrays.sort(intNumbers);
		System.out.println("입력한 번호:  " + Arrays.toString(intNumbers));

		int[] lottoNums = new int[LOTTONUM];
		for (int x = 0; x < LOTTONUM; x++) {
			lottoNums[x] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < x; j++) {
				if (lottoNums[x] == lottoNums[j]) {
					x--;
					break;
				}
			}
		}

		Arrays.sort(lottoNums);
		System.out.print("당첨 번호   :" + Arrays.toString(lottoNums) + "\n");

		for (int x = 0; x < LOTTONUM; x++) {
			for (int i = 0; i < INPUTNUM; i++) {
				if (lottoNums[x] == intNumbers[i]) {
					count++;
				}
			}
		}
	}
}
