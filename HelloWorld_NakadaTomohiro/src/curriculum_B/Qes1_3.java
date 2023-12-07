package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		//Scannerクラスのインスタンス未クローズ警告回避の為
		@SuppressWarnings("resource")

		//Scannerクラスのインスタンス化
		Scanner snr = new Scanner(System.in);
		//userNameを宣言
		String userName = null;
		// 半角英数字のみ 
		String regex_AlphaNum = "^[A-Za-z0-9]+$";
		while (true) {
			//1行を読み込んで返却
			userName = snr.nextLine();
			//ユーザー名の文字数が10文字より大きい場合
			if (userName.length() > 10) {
				System.out.println("名前を10文字以内にして下さい");
			}
			//文字数が0文字以下もしくはnullの場合
			else if (userName.length() == 0 || userName == null) {
				System.out.println("名前を入力してください");
			}
			//ユーザー名が半角英数字以外の場合
			else if (!userName.matches(regex_AlphaNum)) {
				System.out.println("半角英数字のみで名前を入力してください");
			}
			//ユーザー名が正常な値だった場合
			else {
				System.out.println("ユーザー名" + userName + "を登録しました");
				break;
			}
		}
		int i = 0;
		//ループ文
		while (true) {
			// ループ処理毎にカウント
			i = i + 1;
			//1行を読み込んで返却
			int myHand = snr.nextInt();
			//配列作成
			int[] nums = { 0, 1, 2 };
			//ランダムクラスのインスタンス化
			Random rnd = new Random();
			//ランダムなインデックスを生成
			int index = rnd.nextInt(nums.length);
			//配列の要素をランダムに取得
			int yourHand = nums[index];
			//あいこ    
			if (myHand == 0 && yourHand == 0) {
				System.out.println(userName + "の手は「グー」");
				System.out.println("相手の手は「グー」");
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
			//自分が勝ち
			else if (myHand == 0 && yourHand == 1) {
				System.out.println(userName + "の手は「グー」");
				System.out.println("相手の手は「チョキ」");
				System.out.println("やるやん");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + i + "回です");
				break;
			}
			//相手が勝ち
			else if (myHand == 0 && yourHand == 2) {
				System.out.println(userName + "の手は「グー」");
				System.out.println("相手の手は「パー」");
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}
			//あいこ
			else if (myHand == 1 && yourHand == 1) {
				System.out.println(userName + "の手は「チョキ」");
				System.out.println("相手の手は「チョキ」");
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
			//自分が勝ち
			else if (myHand == 1 && yourHand == 2) {
				System.out.println(userName + "の手は「チョキ」");
				System.out.println("相手の手は「パー」");
				System.out.println("やるやん");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + i + "回です");
				break;
			}
			//相手が勝ち
			else if (myHand == 1 && yourHand == 0) {
				System.out.println(userName + "の手は「チョキ」");
				System.out.println("相手の手は「グー」");
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}
			//あいこ
			else if (myHand == 2 && yourHand == 2) {
				System.out.println(userName + "の手は「パー」");
				System.out.println("相手の手は「パー」");
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
			//自分が勝ち
			else if (myHand == 2 && yourHand == 0) {
				System.out.println(userName + "の手は「パー」");
				System.out.println("相手の手は「グー」");
				System.out.println("やるやん");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + i + "回です");
				break;
			}
			//相手が勝ち
			else if (myHand == 2 && yourHand == 1) {
				System.out.println(userName + "の手は「グー」");
				System.out.println("相手の手は「パー」");
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}
		}

	}
}
