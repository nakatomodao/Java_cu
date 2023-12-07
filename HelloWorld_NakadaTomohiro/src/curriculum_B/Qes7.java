package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int input;
			//System.out.print("生徒の人数を入力してください（2以上）:");
			while (true) {
				System.out.print("生徒の人数を入力してください（2以上）:");
				String nums = scanner.nextLine();
				//String型の文字列が空文字の時
				if (nums.isEmpty()) {
					System.out.println("【エラー】入力できるのは「2以上」です:");
					System.out.println("");
				} else {
					//String型からint型に変換
					input = Integer.parseInt(nums);
					if (input < 2)
						System.out.print("【エラー】入力できるのは「2以上」です:");
					System.out.println("");
					if (input >= 2) {
						break;
					}
				}
			}
			//String型で宣言
			String[] subjects = new String[] { "英語", "数学", "理科", "社会" };
			int[][] studentPoints = new int[input][subjects.length];
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < subjects.length; j++) {
					System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
					Scanner sc = new Scanner(System.in);
					studentPoints[i][j] = sc.nextInt();
				}
				System.out.println("");
			}
			//平均を計算して表示する
			for (int i = 0; i < input; i++) {
				double sum = 0;
				double ave;
				for (int j = 0; j < subjects.length; j++) {
					sum += (double) studentPoints[i][j];
				}
				ave = sum / subjects.length;
				System.out.println((i + 1) + "人目の平均点は" + ave + "点です。");
			}
			System.out.println("");
			//各科目の平均を計算して表示する
			for (int j = 0; j < subjects.length; j++) {
				double sum = 0;
				double ave;
				for (int i = 0; i < input; i++) {
					sum += (double) studentPoints[i][j];
				}
				ave = sum / input;
				System.out.println(subjects[j] + "の平均点は" + ave + "点です。");
			}
			//全体の平均点を表示する
			double sum = 0;
			double ave;
			for (int j = 0; j < subjects.length; j++) {
				for (int i = 0; i < input; i++) {
					sum += (double) studentPoints[i][j];
				}
			}
			ave = sum / (input * subjects.length);
			System.out.println("全体の平均点は" + ave + "点です。");

		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
