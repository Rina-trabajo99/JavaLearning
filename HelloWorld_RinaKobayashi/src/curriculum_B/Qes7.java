package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問7
		System.out.println("-----問7-----");
		Scanner sc = new Scanner(System.in);
		Scanner eng = new Scanner(System.in);
		Scanner math = new Scanner(System.in);
		Scanner science = new Scanner(System.in);
		Scanner society = new Scanner(System.in);
		
		//生徒数
		System.out.print("生徒の人数を入力してください(2以上)：");
		int ppl = sc.nextInt();
		
		//各生徒の点数を保管する
		int j = 0;
		int[] engArray = new int[ppl];
		int[] mathArray = new int[ppl];
		int[] scienceArray = new int[ppl];
		int[] societyArray = new int[ppl];
		
		//個人の各教科の点数
		for(int i = 1; i <= ppl; i++) {
			System.out.print(i + "人目の『英語』の点数を入力してください：");
			int engPoints = eng.nextInt();
			engArray[j] = engPoints;
			System.out.print(i + "人目の『数学』の点数を入力してください：");
			int mathPoints = math.nextInt();
			mathArray[j] = mathPoints;
			System.out.print(i + "人目の『理科』の点数を入力してください：");
			int sciencePoints = science.nextInt();
			scienceArray[j] = sciencePoints;
			System.out.print(i + "人目の『社会』の点数を入力してください：");
			int societyPoints = society.nextInt();
			societyArray[j] = societyPoints;
			System.out.println();
			j++;
		}
			
		//4教科の平均点
		for(int k = 0; k < engArray.length; k++) {
			double result1 = (engArray[k] + mathArray[k] + scienceArray[k] + societyArray[k]) / 4.0;  //各教科の平均点の計算
			String allAvr = String.valueOf(result1);  //小数点第2位まで表示させるために一度整数にする
			allAvr = String.format("%.2f", result1);  //小数点第2位まで表示させる指示をする
			System.out.println((k+1) + "人目の平均点は" + allAvr + "です。");
		}
		
		//各教科の合計点
		System.out.println();
		int justEng = 0;
		int justMath = 0;
		int justScience = 0;
		int justSociety = 0;
		
		for(int just = 0; just < engArray.length; just++) {
			justEng += engArray[just];
			justMath += mathArray[just];
			justScience += scienceArray[just];
			justSociety += societyArray[just];
		}
		
		//各教科の平均点
		double num = (double)ppl;
		//英語
		double engAvr = justEng / num;  //合計点÷人数
		String justEngAvr = String.valueOf(engAvr);   //double→Stringへ強制変換
		justEngAvr = String.format("%.2f", engAvr);  //小数点第2位まで表示
		System.out.println("英語の平均点は" + justEngAvr + "点です。");
		
		//数学
		double mathAvr = justMath / num;
		String justMathAvr = String.valueOf(mathAvr);
		justMathAvr = String.format("%.2f", mathAvr);
		System.out.println("英語の平均点は" + justMathAvr + "点です。");		
		
		//理科
		double scienceAvr = justScience / num;
		String justScienceAvr = String.valueOf(scienceAvr);
		justScienceAvr = String.format("%.2f", scienceAvr);
		System.out.println("英語の平均点は" + justScienceAvr + "点です。");
		
		//社会
		double societyAvr = justSociety / num;
		String justSocietyAvr = String.valueOf(societyAvr);
		justSocietyAvr = String.format("%.2f", societyAvr);
		System.out.println("英語の平均点は" + justSocietyAvr + "点です。");
		
		
		//全体の平均点
		double entire = (justEng + justMath + justScience + justSociety) / (4.0 * ppl);
		String entireAvr = String.valueOf(entire);
		entireAvr = String.format("%.2f", entire);
		System.out.println("全体の平均点は" + entireAvr + "点です。");
		
	}

}
