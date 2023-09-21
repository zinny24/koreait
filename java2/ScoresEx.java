package tut07;

import java.util.Scanner;

import tut07.dao.ScoresDao;

public class ScoresEx {

	public static void main(String[] args) {
		// 전역변수, 전역객체 선언
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;

		// 무한루프
		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println(" 1.학생 수 | 2.점수입력 | 3.점수출력 | 4.평균점수 | 5.최고점수 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			System.out.println("");

			switch (menu) {
			case 1:
				if (scores == null) {
					System.out.print("등록할 학생 수 입력 > ");
					int count = sc.nextInt();
					scores = new int[count];
					System.out.println(scores.length + "명의 학생이 등록 되었습니다.");
					System.out.println("");
				}
				System.out.println(">>>>> 2.점수입력 메뉴로 이동하세요.");
				System.out.println("");
				break;

			case 2:

				for (int i = 0; i < scores.length; ++i) {
					System.out.print((i + 1) + "번 학생 점수 입력 > ");
					scores[i] = sc.nextInt();
				}
				System.out.println("학생 점수 입력이 완료 되었습니다.");
				System.out.println("");
				
				System.out.println(">>>>> 3. 점수출력 메뉴에서 확인하세요.");
				System.out.println("");

				break;

			case 3:

				System.out.println("=========학생 점수 출력=========");
				System.out.println("학생 수 " + scores.length + "명");
				System.out.println("=============================");

				for (int i = 0; i < scores.length; ++i) {
					System.out.println((i + 1) + "번 학생의 점수는 " + scores[i] + "점입니다.");
					System.out.println("-------------------------");
				}
				System.out.println("");

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:
				System.out.println("");
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				System.out.println("");
				break;

			default:
				System.out.println("");
				System.out.println("메뉴 선택을 다시 해 주세요.");
				System.out.println("");
				break;

			}

		}
	}

}
