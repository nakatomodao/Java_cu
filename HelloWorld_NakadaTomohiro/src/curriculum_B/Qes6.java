package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			//splitによる区切り
			String productNames[] = scanner.next().split("、");
			//ランダムクラスのインスタンス化
			Random random = new Random();
			int count = random.nextInt(11) + 1;
			for (String data : productNames) {
				//switch文の条件式
				switch (data) {
				case "パソコン" -> System.out.println("パソコンの残り台数は" + (random.nextInt(11) + 1) + "台です");
				case "冷蔵庫" -> System.out.println("冷蔵庫の残り台数は" + (random.nextInt(11) + 1) + "台です");
				case "扇風機" -> System.out.println("扇風機の残り台数は" + (random.nextInt(11) + 1) + "台です");
				case "洗濯機" -> System.out.println("洗濯機の残り台数は" + (random.nextInt(11) + 1) + "台です");
				case "加湿器" -> System.out.println("加湿器の残り台数は" + (random.nextInt(11) + 1) + "台です");
				case "テレビ", "ディスプレイ" -> System.out.println(
						data.equals("テレビ") ? "テレビの残り台数は" + count + "台です" : "ディスプレイの残り台数は" + (11 - count) + "台です");
				default -> System.out.println("『" + data + "』" + "は指定の商品ではありません");
				}
			}
		}

	}

}
