package curriculum_B;

import java.util.Random; //じゃんけん用
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//【問1&2】				
		System.out.print("「名前を入力してください」");
		
		//名前の入力処理
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine(); //入力された文字列を取得させる
		
		int valid = 0;
		
		while(valid == 0) {
			if(name.length()>10) {
				System.out.print("「名前を10文字以内にしてください」");
				name = sc1.nextLine();
			} else if(name.length()<= 0 || name == null) {
				System.out.print("「名前を入力してください」");
				name = sc1.nextLine();
			}else if(!name.matches("^[A-Za-z0-9]+$")) {		//問2
				System.out.print("「半角英数字のみで名前を入力してください」");
				name = sc1.nextLine();
			}else {
				System.out.println();
				System.out.println("「ユーザー名「" + name + "」を登録しました」");
				valid = 1;
			}
		}
		
		//スペース確保
		System.out.println();


		//【問3】
		
		//勝つまで繰り返す
		boolean win = false;
		
		//繰り返し回数のカウント
		int playCount = 0;
		
		//userが勝つまでじゃんけんを繰り返す
		while(win == false) {
			//条件の設定
			playCount++;
			System.out.println("じゃんけんしましょう！");
			System.out.print("数値を入れてください。「0はグー、1：チョキ、2：パー」です。");
			String[] hands = {"グー", "チョキ", "パー"};
			
			//userのじゃんけん処理
			Scanner sc2 = new Scanner(System.in);
			int userChoose = sc2.nextInt();
			String userHands = hands[userChoose];
			System.out.println(name + "の手は「" + userHands + "」" );
			
			//pc側のじゃんけん処理
			Random pcChoose = new Random();
			String pcHands = hands[pcChoose.nextInt(2)];
			System.out.println("相手の手は「" + pcHands + "」");
			
			//スペース
			System.out.println();
			
		//条件分岐
		 switch(userChoose) {
			case 0: //userが「グー」を選んだ場合
				if(pcHands == hands[0]) {   //pcが「グー」を選んだ場合
					System.out.println("DRAW あいこ もう一回しましょう！");
				}else if(pcHands == hands[1]) {   //pcが「チョキ」を選んだ場合
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					win = true;
				} else {   //pcが「パー」を選んだ場合
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
				break;
			case 1: //userが「チョキ」を選んだ場合
				if(pcHands == hands[0]) {  //pcが「グー」を選んだ場合
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				} else if(pcHands == hands[1]) {  //pcが「チョキ」を選んだ場合
					System.out.println("DRAW あいこ もう一回しましょう！");					
				} else {  //pcが「パー」を選んだ場合
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					win = true;
				}
				break;
			case 2: //userが「パー」を選んだ場合
				if(pcHands == hands[0]) {  //pcが「グー」を選んだ場合
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					win = true;
				} else if(pcHands == hands[1]) { //pcが「チョキ」を選んだ場合
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				} else {  //pcが「パー」を選んだ場合
					System.out.println("DRAW あいこ もう一回しましょう！");		
				}
				}
			}
		
		System.out.println("勝つまでにかかった合計回数は" + playCount + "回です");
	}

}
