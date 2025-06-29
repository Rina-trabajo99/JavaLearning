package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("-----問5-----");
		
		int[] firstNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] secondNum = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int j = 0;j < secondNum.length; j++) {			
			for(int i = 0; i < firstNum.length; i++) {
				String firstZero = String.format("%03d", firstNum[i]);
				String secondZero = String.format("%03d", secondNum[j]);
				String result = String.format("%03d", firstNum[i] * secondNum[j]);
				System.out.print((firstZero + " ＊ " + secondZero + " = ") + result + " || ");				
			}
			System.out.println();
		}
	}

}
