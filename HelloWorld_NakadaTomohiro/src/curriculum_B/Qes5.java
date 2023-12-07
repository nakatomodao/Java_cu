package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 九九の計算
				for (int i = 1; i <= 20; i++) {
					for (int j = 1; j <= 9; j++) {
						// mに掛け算の結果を代入
						int m = i * j;
						// ' 'を表示
						System.out.print(" ");
						System.out.print(String.format("%03d", i) + " * " + String.format("%03d", j) + " = ");
						// 計算結果が1桁のとき、' 'を追加表示
						if (1000 > m)
						System.out.print(String.format("%03d", m));
						System.out.print(" ");
						if (9 > j)
						System.out.print("||");
						// 掛け算の結果を表示
					}
					// 改行
					System.out.println();
				}
	}

}
