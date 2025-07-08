package curriculum_New_question;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		Method.greet("JavaSE", 11);
		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		Method.msgQ2();
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		Method.resultQ2(num1);
	
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		Method.msgQ3();
		Scanner sc2 = new Scanner(System.in);
		String nums = sc2.nextLine();
		Method.numList(nums);
			
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		Method.msgQ4a();
		Scanner sc3 = new Scanner(System.in);
		double dec1 = sc3.nextDouble();
		
		Method.msgQ4b();
		double dec2 = sc3.nextDouble();
		
		Method.resultQ4(dec1, dec2);
		
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		Method.msgQ5();
		int numTimes = sc1.nextInt();
		Method.times(numTimes);
	
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		Method.msgQ6();
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		Method.msgQ7();
		
		
		sc1.close();
		sc2.close();
		sc3.close();
	}

}

class Method {
	//メンバ変数
	String name;
	int num;
	String str;
	double first;
	double second;
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
	static void resultQ2(int num) {
		System.out.println((num) + " ＊ " + (num) + " = " + Method.cal(num) + " です");
	}

	//Q3
	static void msgQ3() {
		System.out.println();		
		System.out.println("整数をいくつか記述してください。");
		System.out.println("整数と整数の間は「、」で区切ってください：");
	}
	static void numList(String str) {
		List<String> numSingle = Arrays.asList(str.split("、"));
		System.out.println(numSingle);
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
	static double cal(double first, double second) {
		return first + second;
	}
	static void resultQ4(double first, double second) {	
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
		System.out.println("上記に表示させたランダム数値の和の平均は" + avrCal + "です");
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
	
	
	
	
	
	
	
	}