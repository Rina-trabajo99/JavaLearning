package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ		
		
		/*
		 【問題１】
		 下記9個をローカル変数として宣言のみしてください
			・バイト型・短整数型・整数型・長整数型
			・単精度浮動小数点数型・倍精度浮動小数点数型
			・文字型・文字列型
			・ブーリアン型

		 【問題２】
		　それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		 【問題３】
		  初期化をしたそれぞれの変数に下記の値を代入してください					
			・バイト型：10			
			・短整数型：100			
			・整数型：1000			
			・長整数型：10000			
			・単精度浮動小数点数型：9.5			
			・倍精度浮動小数点数型：10.5			
			・文字型：a			
			・文字列型：ハロー			
			・ブーリアン型：true
		 */
	
		//バイト型
		byte Byte = 10;
		//短整数型
		short Short = 100;
		//整数型
		int Int = 1000;
		//長整数型
		long Long = 10000;
		//単精度浮動小数点型
		float Float = 9.5F;
		//倍精度浮動小数点型
		double Double = 10.5;
		//文字型
		char Char = 'a';
		//文字列型
		String String = "ハロー";
		//ブーリアン型(真偽値)
		boolean Boolean = true;
		
		
		/*
		【問題４】
		 下記の通りにコンソール出力されるようにしてください						
		 上記で作成した変数を必ず使用すること						
			11110→11110				
			20→20				
			a ハロー true→a ハロー true				
			11130→11130（数字を全て足す）			
			10000000000→10000000000（小数点以外の数字を全てかける）		
			0.105→0.105（10.5割る100をする）			
			-90→-90（10引く100をする）			
		 */
		
		System.out.println("-----問題４-----");		
		
		System.out.println(Byte + Short + Int + Long);
		System.out.println(Byte + Byte);
		System.out.println(Char +  String +  Boolean);
		System.out.println(Byte * Short * Int * Long);
		System.out.println(10.5 / 100);
		System.out.println(10 - 100);
		
		
		/*
		【問題５】
		 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
			　String num="20";
			　int num1=23;
			　System.out.println("ハローJAVA"+(num+num1));
		*/

		System.out.println("-----問題５-----");		
		
		int num1 = 2000;
		int num2 = 23;
		System.out.println("ハローJAVA" + (num1 + num2));
		
		
		/*
		【問題６】
		 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 ローカル変数に代入し○○に入れてください
		『山田太郎 18歳 170.5cm 62.2kg 寿司』
		
		↓↓format↓↓
		「初めまして○○です」
		「年齢は○○歳です」
		「身長は○○cmです」
		「体重は○○kgです」
		「好きな食べ物は○○です」
		*/
		
		System.out.println("-----問題６-----");
		
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		
		/*
		 【問題７】
		  6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 「BMIは○○です」
		  ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		
		System.out.println("-----問題７-----");
		
		System.out.println("BMIは" + (weight / height / height) + "です");
		
		
		/*
		 【問題８】
		  6で宣言した変数に再代入し下記の通りコンソールに出力してください
			　初めまして鈴木一郎です
			　年齢は24歳です
			　身長168.5cmです
			　体重は64.2kgです
			　好きな食べ物はオムライスです
			　BMIは22.6です
		 */
		
		System.out.println("-----問題８-----");
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		//BMIを小数点第2位まで表示する
		double bmi = weight / height / height * 100000; //小数点第2位までを整数とする
		bmi = Math.round(bmi); //小数点以下を切り捨てる
		bmi /= 10; //22.6にするため10で割る

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi + "です");
	
		
		/*
		 【問題９】
		  8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
			　初めまして鈴木一郎です
			　年齢は48歳です
			　身長337.0cmです
			　体重は128.4kgです
			　好きな食べ物はオムライスです
			　BMIは11.31です
		*/

		
		System.out.println("-----問題９-----");

		int ageAfter = age * 2;
		double heightAfter = height * 2;
		double weightAfter = weight * 2;
		
		//BMIを小数点第2位まで表示する
		bmi = weightAfter / heightAfter / heightAfter * 1000000; //小数点第2位までを整数とする
		bmi = Math.round(bmi); //小数点以下を切り捨てる
		bmi /= 100; //11.31にするため100で割る
		

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + ageAfter + "歳です");
		System.out.println("身長は" + heightAfter + "cmです");
		System.out.println("体重は" + weightAfter + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi + "です");
		
		
		/*
		 【問題１０】
		  8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		
		System.out.println("-----問題１０-----");	
		
		//問題９で自己代入をしているため、下記に再度変数を定義
		age = 24;
		
		boolean ageCheck = age >= 25;
		System.out.println(ageCheck);
	
		
		/*
		 【問題１１】
		  8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		
		System.out.println("-----問題１１-----");	
		
		String ageText = age + "";
		String heightText = height + "";
		String weightText = weight + "";
		
		System.out.println(ageText + " " + heightText + " " + weightText);
		
		
		/*
		 【問題１２】
		  11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		
		System.out.println("-----問題１２-----");	
		
		int ageInt = Integer.parseInt(ageText); //String to int
		System.out.println(ageInt);
		
		int heightInt = (int) height; //double to int
		System.out.println(heightInt);

		
		
		
		
		
		
		
		
		
		
	}

}
