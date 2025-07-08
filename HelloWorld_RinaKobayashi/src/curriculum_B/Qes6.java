package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問6
		System.out.println("-----問6-----");
		String[] items = {"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ"};
		Random rdm = new Random();
		int itemsNum = rdm.nextInt(11);
		
		System.out.println("在庫を調べたい商品を入力してください");
		System.out.println("※複数記載する場合は「、」を付けて続けて記載してください");
		System.out.print("→");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		sc.close();
		String[] productList = search.split("、");
		
		for(String bucle : productList) {
			int tvdispAmount = 11;
			int amount = bucle != items[5] || bucle != items[6] ? itemsNum : tvdispAmount;
			switch (bucle) {
				case "パソコン":
					System.out.println("パソコンの残り台数は " + amount + "台です");
				break;
				case "冷蔵庫":
					System.out.println("冷蔵庫の残り台数は " + amount + "台です");
				break;
				case "扇風機":
					System.out.println("扇風機の残り台数は" + amount + "台です");
				break;
				case "洗濯機":
					System.out.println("洗濯機の残り台数は" + amount + "台です");
				break;
				case "加湿器":
					System.out.println("加湿器の残り台数は" + amount + "台です");
				break;
				case	"テレビ":
				case "ディスプレイ":
					int tvAmount = tvdispAmount - itemsNum;
					int dispAmount = tvdispAmount - tvAmount;
					System.out.println("テレビの残り台数は" + tvAmount + "台です");
					System.out.println("ディスプレイの残り台数は" + dispAmount + "台です");					
				break;
				default:
					System.out.println("『 " + bucle + "』は指定の商品ではありません");	
					break;
			}
		}
		
	}

}
