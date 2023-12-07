package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		//バイト型ローカル変数宣言と初期値代入
		byte b = 0;
		
		//短整数型ローカル変数宣言と初期値代入
		short st = 0;
		
		//整数型ローカル変数宣言と初期値代入
		int i = 0;
		
		//長整数型ローカル変数宣言と初期値代入
		long lg = 0L;
		
		//単精度浮動小数点数型ローカル変数宣言と初期値代入
		float ft = 0.0f;
		
		//倍精度浮動小数点数型ローカル変数宣言と初期値代入
		double db = 0.0d;
		
		//文字型ローカル変数宣言と初期値代入
		char c = '\u0000'; 
		
		//文字列型ローカル変数宣言と初期値代入
		String str = null;
		
		//ブーリアン型列型ローカル変数宣言と初期値代入
		boolean bl = false;
		
		//バイト型に代入
		b = 10;
		
		//短整数型に代入
		st =  100;
		
		//整数型に代入
		i = 1000;
		
		//長整数型に代入
		lg = 10000;
		
		//単精度浮動小数点数型に代入
		ft = 9.5F;
		
		//倍精度浮動小数点数型に代入
		db = 10.5;
		
		//文字型に代入
		c = 'a';
		
		//文字列型に代入
		str = "ハロー";
		
		//ブーリアン型列型に代入
		bl = true;
		
		//11110をコンソールに出力
		System.out.println(b+st+i+lg);
		
		//20をコンソールに出力
		double a = ft + db; 
		//少数第一位を四捨五入
		System.out.println(Math.round(a));
		
		//a ハロー trueを画面に出力
		System.out.println(c+str+bl);
		
		//11130を画面に出力
		System.out.println(b*3+st+i+lg);
		
		//10000000000を画面に出力
		System.out.println(lg*lg*st);
		
		//0.105を画面に出力
		System.out.println(db/100);
		
		//-90を画面に出力
		System.out.println(b-st);
		
		//正しく動作するように修正
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		//文字列型に名前を代入
		String str1 = "山田太郎";
		
		//バイト型に年齢を代入
		byte b1 = 18;
		
		//単精度浮動小数点数型に身長を代入
		double db1 = 170.5;
		
		//倍精度浮動小数点数型に体重を代入
		double db2 = 62.2;
		
		//文字列型に食べ物を代入
		String str2 = "寿司";
		
		//自己紹介を出力
		System.out.println("初めまして"+(str1)+"です");
		System.out.println("年齢は"+b1+"歳です");
		System.out.println("身長は"+db1+"cmです");
		System.out.println("体重は"+db2+"kgです");
		System.out.println("好きな食べ物は"+str2+"です");
		
		//変数宣言
		double result;
		
		//身長の二乗
	    result = Math.pow((db1/st), 2);
	    double resultx;
	    resultx = db2/result;
	    
	    //少数第三位から四捨五入
	    double resulty;
	    resulty = ((double)Math.round(resultx * 100))/100;
	    System.out.println("BMIは"+resulty+"です");
	    
	    //再代入
	    str1 = "鈴木一郎";
		b1 = 24;
		db1 = 168.5;
		db2 = 64.2;
		str2 = "オムライス";
		
		//変数宣言
	    double result1 =0;
	    //BMI
	    result1 = Math.pow((db1/st), 2);
	    double result2;
	    result2 = db2/result1;
	    double result3;
		result3 = ((double)Math.round(result2 * 100))/100;
		
		//8再代入した自己紹介を出力
		System.out.println("初めまして"+(str1)+"です");
		System.out.println("年齢は"+b1+"歳です");
		System.out.println("身長は"+db1+"cmです");
		System.out.println("体重は"+db2+"kgです");
		System.out.println("好きな食べ物は"+str2+"です");
		System.out.println("BMIは"+((double) Math.round(result3 * 10)) / 10+"です");
		
		//9自己代入
		b1+=24;
		db1+=168.5;
		db2+=64.2;
		
		//BMI
		result1 = Math.pow((db1/st), 2);
		result2 = db2/result1;
		result3 = ((double)Math.round(result2 * 100))/100;
		System.out.println("初めまして"+(str1)+"です");
		System.out.println("年齢は"+b1+"歳です");
		System.out.println("身長は"+db1+"cmです");
		System.out.println("体重は"+db2+"kgです");
		System.out.println("好きな食べ物は"+str2+"です");
		System.out.println("BMIは"+result3+"です");
		
		//10三項演算子
		b1 = 24;
		int z = 25;
		bl = b1 >= z ?true : false;
		// 出力:false
		System.out.println(bl);
		
		//11【年齢・身長・体重】を文字列型に型変換
		b1 = 24;
		db1 = 168.5;
		db2 = 64.2;
		String strx = String.valueOf(b1);
		String stry = String.valueOf(db1);
		String strz = String.valueOf(db2);
		//繋げて出力
		System.out.print("年齢は"+strx+"歳です");
		System.out.print("身長は"+stry+"cmです");
		System.out.println("体重は"+strz+"kgです");
		
		//12【年齢・身長】を整数型に型変換
        int numx = Integer.parseInt(strx);
	    System.out.println("年齢は"+numx+"歳です");
		double dbx = Double.parseDouble(stry);
		System.out.println("身長は"+(int)dbx+"cmです");
		
		//13
	    System.out.println(numx == 25 || dbx >= 160);
	}

}
