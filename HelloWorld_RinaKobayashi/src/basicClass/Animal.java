package basicClass;

import java.time.LocalDateTime; //現在の日時を取得
import java.time.format.DateTimeFormatter; //日付をフォーマット形式で表示させる
import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog.setAnimalName("犬");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.print("動物の数を記載してください：");
		int num = sc.nextInt();
		Dog.setAnimalNum(num);
		sc.close();
						
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime jpNow = LocalDateTime.now(); //現在の現地時刻を指定
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); //フォーマット形式を指定
		String formattedDateTime = jpNow.format(dtf); //フォーマットをパッケージする
		System.out.println("現在の日時：" + formattedDateTime);
	}

}
