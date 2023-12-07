package basicClass;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog a = new Dog("トイ・プードル");
		System.out.println(a.getName());
		a.setName("シェパード");
		System.out.println(a.getName());
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog b = new Dog(3);
		System.out.println(b.getCount());
		//、動物の名前と動物の数をコンソールに出力
		Dog c = new Dog("チワワ",2);
		System.out.println(c.getName());
		System.out.println(c.getCount());
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
	}
}


