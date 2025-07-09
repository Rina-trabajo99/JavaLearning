package curriculum_New_question;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Curriculum_New_1_18 {
	
//クラス全体で共有できるようにする
	static double[] avr;
	static double avrAdd;
	static double avrCal;
	static boolean check;
		
	//メソッド処理
	//Q1
	static void greet(String name, int num) {
		System.out.println("Hello" + " " +  name + " " + num );
	}
	
	//Q2
	static void msgQ2()  {
		System.out.println();
		System.out.print("好きな整数を入力してください：");
	}
	static int cal(int num) {
		return num*num;
	}
	static void result(int num) {
		System.out.println((num) + " ＊ " + (num) + " = " + cal(num) + " です");
	}

	//Q3
	static void msgQ3() {
		System.out.println();		
		System.out.println("整数をいくつか記述してください。");
		System.out.println("整数と整数の間は「、」で区切ってください：");
	}
	static void numArray(String str) {
		List<String> nums = Arrays.asList(str.split("、"));
		System.out.println(nums);
	}

	//Q4
	static void msgQ4a() {
		System.out.println();
		System.out.println("好きな小数点を一つ入力してください：");
	}
	static void msgQ4b() {
		System.out.println();
		System.out.println("もう一つ、好きな小数点を入力してください：");
	}
	static double cal(double first, double second) { //Q2オーバーロード
		return first + second;
	}
	static void result(double first, double second) {	//Q2オーバーロード
		System.out.println(first + " + " + second + " = " + String.format("%.2f",cal(first, second)) + " です");
	}
	
	//Q5
	static void msgQ5() {
		System.out.println();
		System.out.println("1~100までのランダムな数字を好きな回数表示します");
		System.out.println("表示させたい回数を指定してください");
	}
	static void times(int num) {
		avr = new double[num];
		if (num <= 0) {
			System.out.println("1以上の整数の値を指定してください");
		} else {
			System.out.println(num + "回表示します");
			for(int i = 1; i <= num; i++) {
				Random rdm = new Random();
				int numRandom = rdm.nextInt(100) + 1;
				avr[i-1] = numRandom;
				System.out.println(i + "回目：" + numRandom);
			}
		} 
	} 
	
	//Q6
	static void msgQ6() {
		avrAdd = 0;
		avrCal = 0;
		for(int i = 0; i < avr.length; i++) {
			avrAdd += avr[i];
		}
		avrCal = avrAdd / avr.length;
		System.out.println();
		System.out.println("上記に表示させたランダム数値の和の平均は" + String.format("%.2f",avrCal) + "です");
	}

	//Q7
	static void msgQ7() {
		check = avrCal >= 50;
		if(check == false) {
			System.out.println();
			System.out.println("ランダム数値の和の平均が50以下のため、結果は「" + check + "」です" );
		} else {
			System.out.println();
			System.out.println("ランダム数値の和の平均が50以上のため、結果は「" + check + "」です");
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		greet("JavaSE", 11);
		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		msgQ2();
		int num1 = sc.nextInt();
		result(num1);
	
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		msgQ3();
		String nums = sc.next();
		numArray(nums);
			
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		msgQ4a();
		double dec1 = sc.nextDouble();
		msgQ4b();
		double dec2 = sc.nextDouble();
		result(dec1, dec2);
		
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		msgQ5();
		int numTimes = sc.nextInt();
		times(numTimes);
	
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		msgQ6();
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		msgQ7();
		
		
		sc.close();
	}

}